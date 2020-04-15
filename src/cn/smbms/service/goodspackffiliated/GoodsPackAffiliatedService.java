package cn.smbms.service.goodspackffiliated;

import java.util.List;

import cn.smbms.pojo.GoodsPackAffiliated;
/**
 * GoodsPackAffiliatedService
 * @author bdqn_hl
 * @date 2014-2-28
 */
public interface GoodsPackAffiliatedService {
	/**
	 * getGoodsPackAffiliatedListById
	 * @return
	 */
	public List<GoodsPackAffiliated> getGoodsPackAffiliatedListById(GoodsPackAffiliated goodsPackAffiliated) throws Exception;
	
	
	/**
	 * addGoodsPackAffiliated
	 * @param goodsPackAffiliated
	 * @return
	 */
	public int addGoodsPackAffiliated(GoodsPackAffiliated goodsPackAffiliated) throws Exception;
	
	/**
	 * modifyGoodsPackAffiliated
	 * @param goodsPackAffiliated
	 * @return
	 */
	public int modifyGoodsPackAffiliated(GoodsPackAffiliated goodsPackAffiliated);
	
	/**
	 * GoodsPackAffiliated
	 * @param goodsPackAffiliated
	 * @return
	 */
	public int deleteGoodsPackAffiliated(GoodsPackAffiliated goodsPackAffiliated);
}
