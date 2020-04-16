package cn.smbms.service.affiche;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.affiche.AfficheMapper;
import cn.smbms.pojo.Affiche;

/**
 * AfficheServiceImpl
 * @author bdqn_hl
 * @date 2014-2-24
 */
@Service
public class AfficheServiceImpl implements AfficheService {
	@Resource
	private AfficheMapper mapper;
	@Override
	public List<Affiche> getList(Affiche affiche) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getList(affiche);
	}

	@Override
	public Affiche getAffiche(Affiche affiche) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAffiche(affiche);
	}

	@Override
	public int addAffiche(Affiche affiche) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addAffiche(affiche);
	}

	@Override
	public int modifyAffiche(Affiche affiche) throws Exception {
		// TODO Auto-generated method stub
		return mapper.modifyAffiche(affiche);
	}

	@Override
	public int deleteAffiche(Affiche affiche) throws Exception {
		// TODO Auto-generated method stub
		return mapper.deleteAffiche(affiche);
	}

	@Override
	public int count() throws Exception {
		// TODO Auto-generated method stub
		return mapper.count();
	}

	@Override
	public List<Affiche> getAfficheList(Affiche affiche) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getAfficheList(affiche);
	}

	@Override
	public int portalCount() throws Exception {
		// TODO Auto-generated method stub
		return mapper.portalCount();
	}

	@Override
	public List<Affiche> getPortalAfficheList(Affiche affiche) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getPortalAfficheList(affiche);
	}

}
