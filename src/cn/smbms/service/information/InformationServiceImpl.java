package cn.smbms.service.information;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.information.InformationMapper;
import cn.smbms.pojo.Information;
/**
 * InformationServiceImpl
 * @author bdqn_hl
 * @date 2014-2-27
 */
@Service
public class InformationServiceImpl implements InformationService {

	@Resource
	private InformationMapper mapper;
	
	@Override
	public List<Information> getList(Information information) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getList(information);
	}

	@Override
	public List<Information> getInformationList(Information information)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getInformationList(information);
	}

	@Override
	public Information getInformation(Information information) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getInformation(information);
	}

	@Override
	public int addInformation(Information information) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addInformation(information);
	}

	@Override
	public int modifyInformation(Information information) throws Exception {
		// TODO Auto-generated method stub
		return mapper.modifyInformation(information);
	}

	@Override
	public int deleteInformation(Information information) throws Exception {
		// TODO Auto-generated method stub
		return mapper.deleteInformation(information);
	}

	@Override
	public int count(Information information) throws Exception {
		// TODO Auto-generated method stub
		return mapper.count(information);
	}

	@Override
	public int modifyInformationFileInfo(Information information)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.modifyInformationFileInfo(information);
	}
}
