package cn.smbms.dao.goodspackaffiliated;

import java.util.List;

import cn.smbms.pojo.GoodsPackAffiliated;


/**
 * GoodsPackAffiliatedMapper
 * @author bdqn_hl
 * @date 2014-3-1
 */
public interface GoodsPackAffiliatedMapper {
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
	 * deleteGoodsPackAffiliated
	 * @param goodsPackAffiliated
	 * @return
	 */
	public int deleteGoodsPackAffiliated(GoodsPackAffiliated goodsPackAffiliated);
}
