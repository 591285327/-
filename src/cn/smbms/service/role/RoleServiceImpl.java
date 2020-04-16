package cn.smbms.service.role;

import java.util.List;
import javax.annotation.Resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.smbms.dao.role.RoleMapper;
import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.Role;
import cn.smbms.pojo.User;
/**
 * RoleServiceImpl
 * @author bdqn_hl
 * @date 2014-2-24
 */
@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleMapper  mapper;
	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<Role> getRoleList() throws Exception {
		// TODO Auto-generated method stub
		return mapper.getRoleList();
	}

	@Override
	public Role getRole(Role role) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getRole(role);
	}

	@Override
	public int addRole(Role role) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addRole(role);
	}

	@Override
	public int modifyRole(Role role) throws Exception {
		// TODO Auto-generated method stub
		return mapper.modifyRole(role);
	}

	@Override
	public int deleteRole(Role role) throws Exception {
		// TODO Auto-generated method stub
		return mapper.deleteRole(role);
	}

	@Override
	public List<Role> getRoleIdAndNameList() throws Exception {
		// TODO Auto-generated method stub
		return mapper.getRoleIdAndNameList();
	}

	@Override
	public Role getRoleR(Role role) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getRoleR(role);
	}

	@Override
	public boolean hl_modifyRole(Role role) throws Exception {
		// TODO Auto-generated method stub
		mapper.modifyRole(role);
		int roleId = role.getId();
		String roleName = role.getRoleName();
		User user = new User();
		user.setRoleId(roleId);
		user.setRoleName(roleName);
		if(null != roleName && !"".equals(roleName)){
			userMapper.modifyUserRole(user);
		}
		return true;
	}

}
