package cn.smbms.service.authority;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.authority.AuthorityMapper;
import cn.smbms.dao.function.FunctionMapper;
import cn.smbms.pojo.Authority;
import cn.smbms.pojo.Function;
/**
 * AuthorityServiceImpl
 * @author bdqn_hl
 * @date 2014-2-25
 */
@Service
public class AuthorityServiceImpl implements AuthorityService{
	@Resource
	private AuthorityMapper mapper;
	@Resource
	private FunctionMapper functionMapper;
	
	@Override
	public List<Authority> getList(Authority authority) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getList(authority);
	}

	@Override
	public int addAuthority(Authority authority) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addAuthority(authority);
	}

	@Override
	public int modifyAuthority(Authority authority) throws Exception {
		// TODO Auto-generated method stub
		return mapper.modifyAuthority(authority);
	}

	@Override
	public int deleteAuthority(Authority authority) throws Exception {
		// TODO Auto-generated method stub
		return mapper.deleteAuthority(authority);
	}

	@Override
	public boolean hl_delAddAuthority(Authority authority, String checkFuncList)
			throws Exception {
		// TODO Auto-generated method stub
		String[] funcList = null;
		mapper.deleteAuthority(authority);
		if(null != checkFuncList && !checkFuncList.equals("")){
			funcList = checkFuncList.split(",");
			for(int i = 0; i < funcList.length; i++){
				authority.setFunctionId(Integer.valueOf(funcList[i]));
				mapper.addAuthority(authority);
			}
		}
		return true;
	}

	@Override
	public boolean hl_addAuthority(String[] ids,String createdBy) throws Exception {
		// TODO Auto-generated method stub
		Authority authority = new Authority();
		authority.setRoleId(Integer.parseInt(ids[0]));
		mapper.deleteAuthority(authority);
		String idsSqlString = "";
		for(int i=1;i<ids.length;i++){
			idsSqlString += Integer.parseInt(ids[i])+",";
		}
		if(idsSqlString != null && idsSqlString.contains(",")){
			idsSqlString = idsSqlString.substring(0,idsSqlString.lastIndexOf(","));
			
			List<Function> fList = functionMapper.getFunctionListByIn(idsSqlString);
			
			if(null != fList && fList.size() > 0){
				
				for(Function function : fList){
					authority.setFunctionId(function.getId());
					authority.setCreationTime(new Date());
					authority.setCreatedBy(createdBy);
					mapper.addAuthority(authority);
				}
				
			}
		}
		return true;
	}

	@Override
	public Authority getAuthority(Authority authority) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAuthority(authority);
	}

}
