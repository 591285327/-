package cn.smbms.controller;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.smbms.pojo.User;
import cn.smbms.tools.Constants;


/**
 * BaseController
 * @author bdqn_hl
 * @date 2014-3-1
 */
public class BaseController {
	private Logger logger = Logger.getLogger(BaseController.class);
	
	private User currentUser;


	public User getCurrentUser() {
		if(null == this.currentUser){
			HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
			HttpSession session = request.getSession(false);
			if(null != session){
				currentUser = (User)session.getAttribute(Constants.SESSION_USER);
			}else {
				currentUser = null;
			}
		}
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder){
		dataBinder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
		    @Override
			public void setAsText(String value) {
		        try {
		            setValue(new SimpleDateFormat("yyyy-MM-dd").parse(value));
		        } catch(ParseException e) {
		            setValue(null);
		        }
		    }
		    @Override
			public String getAsText() {
		        return new SimpleDateFormat("yyyy-MM-dd").format((Date) getValue());
		    }        

		});
	}
}
