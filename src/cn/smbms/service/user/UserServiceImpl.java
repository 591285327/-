package cn.smbms.service.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;

/**
 * UserServiceImpl
 * @author bdqn_hl
 * @date 2014-2-21
 */

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper mapper;
	
	@Override
	public List<User> getUserList(User user) throws Exception{
		// TODO Auto-generated method stub
		return mapper.getUserList(user);
	}

	@Override
	public User getLoginUser(User user) throws Exception{
		// TODO Auto-generated method stub
		return mapper.getLoginUser(user);
	}

	@Override
	public int addUser(User user) throws Exception{
		// TODO Auto-generated method stub
		return mapper.addUser(user);
	}

	@Override
	public int deleteUser(User user) throws Exception{
		// TODO Auto-generated method stub
		return mapper.deleteUser(user);
	}

	@Override
	public int modifyUser(User user) throws Exception{
		// TODO Auto-generated method stub
		return mapper.modifyUser(user);
	}

	@Override
	public int count(User user) throws Exception {
		// TODO Auto-generated method stub
		return mapper.count(user);
	}

	@Override
	public User getUserById(User user) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getUserById(user);
	}

	@Override
	public int delUserPic(User user) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delUserPic(user);
	}

	@Override
	public int loginCodeIsExit(User user) throws Exception {
		// TODO Auto-generated method stub
		return mapper.loginCodeIsExit(user);
	}

	@Override
	public List<User> getUserListBySearch(User user) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getUserListBySearch(user);
	}

}
