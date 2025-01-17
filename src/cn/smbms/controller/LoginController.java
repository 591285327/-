package cn.smbms.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.smbms.pojo.Authority;
import cn.smbms.pojo.Function;
import cn.smbms.pojo.Menu;
import cn.smbms.pojo.User;
import cn.smbms.service.affiche.AfficheService;
import cn.smbms.service.function.FunctionService;
import cn.smbms.service.information.InformationService;
import cn.smbms.service.user.UserService;
import cn.smbms.tools.Constants;

/**
 * LoginController
 * 
 * @author bdqn_hl
 * @date 2014-2-21
 */

@Controller
@Scope("prototype")
public class LoginController extends BaseController {
	private Logger logger = Logger.getLogger(LoginController.class);

	@Resource
	private UserService userService;
	@Resource
	private FunctionService functionService;
	@Resource
	private InformationService informationService;
	@Resource
	private AfficheService afficheService;
	
	@RequestMapping("/main")
	public String main() {
		return "/index";
		
	}

	/*
	 * @RequestMapping("/main.html") public ModelAndView main(HttpSession session){
	 * List<Information> infoList = null; List<Affiche> afficheList = null;
	 * Information information = new Information(); Affiche affiche = new Affiche();
	 * information.setStarNum(0); information.setPageSize(5);
	 * information.setState(1); affiche.setStarNum(0); affiche.setPageSize(5); try {
	 * infoList = informationService.getInformationList(information); afficheList =
	 * afficheService.getPortalAfficheList(affiche); } catch (Exception e) {
	 * infoList = null; afficheList = null; }
	 * 
	 * //menu list(redis) List<Menu> mList = null; User user =
	 * this.getCurrentUser(); if(null != user){ Map<String,Object> model = new
	 * HashMap<String,Object>(); model.put("user",user); menu
	 * list=========start=======
	 * if(!redisAPI.exist("menuList"+user.getRoleId())){//redis里没有数据 mList =
	 * getFuncByCurrentUser(user.getRoleId()); //json if(null != mList){ JSONArray
	 * jsonArray = JSONArray.fromObject(mList); String jsonString =
	 * jsonArray.toString(); model.put("mList", jsonString);
	 * redisAPI.set("menuList"+user.getRoleId(), jsonString); }
	 * }else{//redis里有数据,直接从redis里取数据 String redisMenuListKeyString =
	 * redisAPI.get("menuList"+user.getRoleId());
	 * logger.debug("++++++++++++++++++++++++:menuList from redis:"
	 * +redisMenuListKeyString); if(null != redisMenuListKeyString &&
	 * !"".equals(redisMenuListKeyString)) model.put("mList",
	 * redisMenuListKeyString); else return new ModelAndView("redirect:/"); } menu
	 * list=========end=======
	 * if(!redisAPI.exist("Role"+user.getRoleId()+"UrlList")){ try{ //get all role
	 * url list to redis Authority authority = new Authority();
	 * authority.setRoleId(user.getRoleId()); List<Function> functionList =
	 * functionService.getFunctionListByRoId(authority);
	 * 
	 * if(null != functionList){ StringBuffer sBuffer = new StringBuffer();
	 * for(Function f:functionList){ sBuffer.append(f.getFuncUrl()); }
	 * redisAPI.set("Role"+user.getRoleId()+"UrlList", sBuffer.toString()); } }catch
	 * (Exception e) { // TODO: handle exception e.printStackTrace(); } }
	 * model.put("infoList", infoList); model.put("afficheList", afficheList);
	 * session.setAttribute(Constants.SESSION_BASE_MODEL, model); return new
	 * ModelAndView("main",model); }else{ return new ModelAndView("redirect:/"); } }
	 */
//	@RequestMapping("/login.html")
//	public ModelAndView login(User user,HttpSession session){
//		if(null != user 
//				&& !user.getLoginCode().isEmpty() 
//				&& !user.getPassword().isEmpty()){
//			try {
//					User _user = userService.getLoginUser(user);
//				if(null != _user){
//					session.setAttribute(Constants.SESSION_USER, _user);
//					User updateLoginTimeUser = new User();
//					updateLoginTimeUser.setId(_user.getId());
//					updateLoginTimeUser.setLastLoginTime(new Date());
//					userService.modifyUser(updateLoginTimeUser);
//					updateLoginTimeUser = null;
//					return new ModelAndView("redirect:/main.html");
//				}
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return new ModelAndView("index");
//	}

	@RequestMapping("/login.html")
	@ResponseBody
	public Object login(HttpSession session, @RequestParam String user) {

		if (null == user || "".equals(user)) {
			return "nodata";
		} else {
			JSONObject userObject = JSONObject.fromObject(user);
			User userObj = (User) JSONObject.toBean(userObject, User.class);
			try {
				if (userService.loginCodeIsExit(userObj) == 0) {// 不存在这个登陆账号
					return "nologincode";
				} else {
					User _user = userService.getLoginUser(userObj);
					if (null != _user) {
						session.setAttribute(Constants.SESSION_USER, _user);
						User updateLoginTimeUser = new User();
						updateLoginTimeUser.setId(_user.getId());
						updateLoginTimeUser.setLastLoginTime(new Date());
						userService.modifyUser(updateLoginTimeUser);
						updateLoginTimeUser = null;
						return "success";
					} else {
						return "pwderror";
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return "failed";
			}
		}
	}

	@RequestMapping("/logout.html")
	public String logout(HttpSession session) {
		session.removeAttribute(Constants.SESSION_USER);
		session.invalidate();
		this.setCurrentUser(null);
		return "index";
	}

	/**
	 * 根据当前用户的角色id的到功能列表（对应菜单）
	 */
	protected List<Menu> getFuncByCurrentUser(int roleId) {
		List<Menu> menuList = new ArrayList<Menu>();
		Authority authority = new Authority();
		authority.setRoleId(roleId);
		try {

			List<Function> mList = functionService.getMainFunctionList(authority);
			if (null != mList) {
				for (Function function : mList) {
					Menu menu = new Menu();
					menu.setMainMenu(function);
					function.setRoleId(roleId);
					List<Function> subList = functionService.getSubFunctionList(function);
					if (null != subList)
						menu.setSubMenus(subList);
					menuList.add(menu);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return menuList;
	}

	@RequestMapping("/regsuccess.html")
	public ModelAndView regSuccess(User user) {
		int result;
		try {
			result = userService.addUser(user);

			if (result > 0) {
				user = userService.getLoginUser(user);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("regsuccess");
	}

	@RequestMapping("/401.html")
	public ModelAndView noRole(User user) {
		return new ModelAndView("401");
	}
}
