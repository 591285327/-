package cn.smbms.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.smbms.pojo.Role;
import cn.smbms.pojo.User;
import cn.smbms.service.role.RoleService;
import cn.smbms.service.user.UserService;
import cn.smbms.tools.Constants;

/**
 * RoleController
 * @author bdqn_hl
 * @date 2014-3-7
 */
@Controller
public class RoleController extends BaseController {
	private Logger logger = Logger.getLogger(RoleController.class);
	
	@Resource
	private RoleService roleService;
	@Resource
	private UserService userService;
	
	@RequestMapping("/backend/delRole.html")
	@ResponseBody
	public Object delRole(HttpSession session,@RequestParam String role){
		
		if(null == role || "".equals(role)){
			return "nodata";
		}else{
			JSONObject roleObject = JSONObject.fromObject(role);
			Role roleObjRole =  (Role)JSONObject.toBean(roleObject, Role.class);
			try {
				User u = new User();
				List <User> uList = null;
				u.setRoleId(roleObjRole.getId());
				uList = userService.getUserListBySearch(u);
				if(uList == null || uList.size() == 0){
					roleService.deleteRole(roleObjRole);
				}else{
					String flag = "";
					for(int i = 0; i < uList.size(); i++){
						flag += uList.get(i).getLoginCode();
						flag += ","; 
					}
					return flag;
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return "failed";
			}
			return "success";
		}
		
	}
	@RequestMapping("/backend/modifyRole.html")
	@ResponseBody
	public Object modifyRole(HttpSession session,@RequestParam String role){
		
		if(null == role || "".equals(role)){
			return "nodata";
		}else{
			JSONObject roleObject = JSONObject.fromObject(role);
			Role roleObjRole =  (Role)JSONObject.toBean(roleObject, Role.class);
			roleObjRole.setCreateDate(new Date());
			//roleObjRole.setIsStart(1);
			roleObjRole.setCreatedBy(((User)session.getAttribute(Constants.SESSION_USER)).getLoginCode());
			try {
				roleService.hl_modifyRole(roleObjRole);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return "failed";
			}
			return "success";
		}
		
	}
	@RequestMapping("/backend/addRole.html")
	@ResponseBody
	public Object addRole(HttpSession session,@RequestParam String role){
		
		if(null == role || "".equals(role)){
			return "nodata";
		}else{
			JSONObject roleObject = JSONObject.fromObject(role);
			Role roleObjRole =  (Role)JSONObject.toBean(roleObject, Role.class);
			roleObjRole.setCreateDate(new Date());
			roleObjRole.setIsStart(1);
			roleObjRole.setCreatedBy(((User)session.getAttribute(Constants.SESSION_USER)).getLoginCode());
			try {
				if(roleService.getRoleR(roleObjRole) !=  null){
					return "rename";
				}else{
					roleService.addRole(roleObjRole);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return "failed";
			}
			return "success";
		}
		
	}
	
	
	@RequestMapping("/backend/rolelist.html")
	public ModelAndView roleList(HttpSession session,Model model){
		
		Map<String,Object> baseModel= (Map<String,Object>)session.getAttribute(Constants.SESSION_BASE_MODEL);
		
		if(baseModel == null){
			return new ModelAndView("redirect:/");
		}else{
			List<Role> roleList = null;
			try {
				roleList = roleService.getRoleList();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				roleList = null;
			}
			model.addAllAttributes(baseModel);
			model.addAttribute(roleList);
			return new ModelAndView("/backend/rolelist");
		}
	}
}
