package cn.smbms.service.dataDatasictionary;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.datadictionary.DataDictionaryMapper;
import cn.smbms.pojo.DataDictionary;
/**
 * DataDictionaryServiceImpl
 * @author bdqn_hl
 * @date 2014-2-24
 */
@Service
public class DataDictionaryServiceImpl implements DataDictionaryService{
	@Resource
	private DataDictionaryMapper mapper;
	@Override
	public List<DataDictionary> getDataDictionaries(
			DataDictionary dataDictionary) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionaries(dataDictionary);
	}

	@Override
	public int addDataDictionary(DataDictionary dataDictionary)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.addDataDictionary(dataDictionary);
	}

	@Override
	public int modifyDataDictionary(DataDictionary dataDictionary)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.modifyDataDictionary(dataDictionary);
	}

	@Override
	public int deleteDataDictionary(DataDictionary dataDictionary)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.deleteDataDictionary(dataDictionary);
	}

	@Override
	public List<DataDictionary> getDataDictionariesCategory() throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionariesCategory();
	}

	@Override
	public List<DataDictionary> getDataDictionariesNotIn(
			DataDictionary dataDictionary) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionariesNotIn(dataDictionary);
	}

	@Override
	public int modifyDataDictionarys(DataDictionary dataDictionary)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.modifyDataDictionarys(dataDictionary);
	}

	@Override
	public int typeCodeOrValueIdIsExit(DataDictionary dataDictionary) throws Exception {
		// TODO Auto-generated method stub
		return mapper.typeCodeOrValueIdIsExit(dataDictionary);
	}

	@Override
	public int maxValueId(DataDictionary dataDictionary) throws Exception {
		// TODO Auto-generated method stub
		return mapper.maxValueId(dataDictionary);
	}

}
