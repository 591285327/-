package cn.smbms.service.goodsinfo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.goodsinfo.GoodsInfoMapper;
import cn.smbms.pojo.GoodsInfo;
/**
 * GoodsInfoServiceImpl
 * @author bdqn_hl
 * @date 2014-2-28
 */
@Service
public class GoodsInfoServiceImpl implements GoodsInfoService{
	@Resource
	private GoodsInfoMapper mapper;

	@Override
	public List<GoodsInfo> getGoodsInfoList(GoodsInfo goodsInfo)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getGoodsInfoList(goodsInfo);
	}

	@Override
	public int count(GoodsInfo goodsInfo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.count(goodsInfo);
	}

	@Override
	public int addGoodsInfo(GoodsInfo goodsInfo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addGoodsInfo(goodsInfo);
	}

	@Override
	public int goodsSNIsExit(GoodsInfo goodsInfo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.goodsSNIsExit(goodsInfo);
	}

	@Override
	public GoodsInfo getGoodsInfoById(GoodsInfo goodsInfo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getGoodsInfoById(goodsInfo);
	}

	@Override
	public int modifyGoodsInfo(GoodsInfo goodsInfo) throws Exception{
		// TODO Auto-generated method stub
		return mapper.modifyGoodsInfo(goodsInfo);
	}

	@Override
	public int deleteGoodsInfo(GoodsInfo goodsInfo) throws Exception{
		// TODO Auto-generated method stub
		return mapper.deleteGoodsInfo(goodsInfo);
	}

	@Override
	public int isExitInPack(GoodsInfo goodsInfo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.isExitInPack(goodsInfo);
	}
	
	
}
