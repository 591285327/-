package cn.smbms.dao.affiche;

import java.util.List;

import cn.smbms.pojo.Affiche;

/**
 * AfficheMapper
 * @author bdqn_hl
 * @date 2014-3-3
 */
public interface AfficheMapper {
	/**
	 * getList
	 * @param affiche
	 * @return
	 * @throws Exception
	 */
	public List<Affiche> getList(Affiche affiche) throws Exception;
	/**
	 * getAfficheList
	 * @param affiche
	 * @return
	 * @throws Exception
	 */
	public List<Affiche> getAfficheList(Affiche affiche) throws Exception;
	/**
	 * getAffiche
	 * @param affiche
	 * @return
	 * @throws Exception
	 */
	public Affiche getAffiche(Affiche affiche) throws Exception;
	/**
	 * addAffiche
	 * @param affiche
	 * @return
	 * @throws Exception
	 */
	public int addAffiche(Affiche affiche) throws Exception;
	/**
	 * modifyAffiche
	 * @param affiche
	 * @return
	 * @throws Exception
	 */
	public int modifyAffiche(Affiche affiche) throws Exception;
	/**
	 * deleteAffiche
	 * @param affiche
	 * @return
	 * @throws Exception
	 */
	public int deleteAffiche(Affiche affiche) throws Exception;
	/**
	 * count
	 * @return
	 * @throws Exception
	 */
	public int count() throws Exception;
	
	/**
	 * portalCount
	 * @return
	 * @throws Exception
	 */
	public int portalCount() throws Exception;
	/**
	 * getPortalAfficheList
	 * @param affiche
	 * @return
	 * @throws Exception
	 */
	public List<Affiche> getPortalAfficheList(Affiche affiche) throws Exception;
}
