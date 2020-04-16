package cn.smbms.service.goodspackffiliated;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.goodspackaffiliated.GoodsPackAffiliatedMapper;
import cn.smbms.pojo.GoodsPackAffiliated;
/**
 * GoodsPackAffiliatedServiceImpl
 * @author bdqn_hl
 * @date 2014-2-28
 */
@Service
public class GoodsPackAffiliatedServiceImpl implements GoodsPackAffiliatedService{
	
	@Resource
	private GoodsPackAffiliatedMapper mapper;

	@Override
	public List<GoodsPackAffiliated> getGoodsPackAffiliatedListById(
			GoodsPackAffiliated goodsPackAffiliated) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getGoodsPackAffiliatedListById(goodsPackAffiliated);
	}

	@Override
	public int addGoodsPackAffiliated(GoodsPackAffiliated goodsPackAffiliated)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.addGoodsPackAffiliated(goodsPackAffiliated);
	}

	@Override
	public int modifyGoodsPackAffiliated(GoodsPackAffiliated goodsPackAffiliated) {
		// TODO Auto-generated method stub
		return mapper.modifyGoodsPackAffiliated(goodsPackAffiliated);
	}

	@Override
	public int deleteGoodsPackAffiliated(GoodsPackAffiliated goodsPackAffiliated) {
		// TODO Auto-generated method stub
		return mapper.deleteGoodsPackAffiliated(goodsPackAffiliated);
	}


}
