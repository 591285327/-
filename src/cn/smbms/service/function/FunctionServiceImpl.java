package cn.smbms.service.function;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.function.FunctionMapper;
import cn.smbms.pojo.Authority;
import cn.smbms.pojo.Function;
/**
 * FunctionServiceImpl
 * @author bdqn_hl
 * @date 2014-2-24
 */
@Service
public class FunctionServiceImpl  implements FunctionService {
	
	@Resource
	private FunctionMapper mapper;
	
	public List<Function> getSubFunctionList(Function function)  throws Exception{
		// TODO Auto-generated method stub
		return mapper.getSubFunctionList(function);
	}
	
	public Function getFunctionById(Function function) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getFunctionById(function);
	}
	
	public List<Function> getMainFunctionList(Authority authority) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getMainFunctionList(authority);
	}

	public List<Function> getSubFuncList(Function function) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getSubFuncList(function);
	}

	@Override
	public List<Function> getFunctionListByIn(String sqlInString) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getFunctionListByIn(sqlInString);
	}
	
	@Override
	public List<Function> getFunctionListByRoId(Authority authority) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getFunctionListByRoId(authority);
	}

}
