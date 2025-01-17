package cn.smbms.service.uploadtemp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.uploadtemp.UploadTempMapper;
import cn.smbms.pojo.UploadTemp;
/**
 * UploadServiceImpl
 * @author bdqn_hl
 * @date 2014-3-1
 */
@Service
public class UploadTempServiceImpl implements UploadTempService {

	@Resource
	private UploadTempMapper mapper;
	@Override
	public List<UploadTemp> getList(UploadTemp uploadTemp) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getList(uploadTemp);
	}

	@Override
	public int add(UploadTemp uploadTemp) throws Exception {
		// TODO Auto-generated method stub
		return mapper.add(uploadTemp);
	}

	@Override
	public int delete(UploadTemp uploadTemp) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delete(uploadTemp);
	}

}
