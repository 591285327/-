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

	public List<GoodsInfo> getGoodsInfoList(GoodsInfo goodsInfo)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getGoodsInfoList(goodsInfo);
	}

	public int count(GoodsInfo goodsInfo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.count(goodsInfo);
	}

	public int addGoodsInfo(GoodsInfo goodsInfo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addGoodsInfo(goodsInfo);
	}

	public int goodsSNIsExit(GoodsInfo goodsInfo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.goodsSNIsExit(goodsInfo);
	}

	public GoodsInfo getGoodsInfoById(GoodsInfo goodsInfo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getGoodsInfoById(goodsInfo);
	}

	public int modifyGoodsInfo(GoodsInfo goodsInfo) throws Exception{
		// TODO Auto-generated method stub
		return mapper.modifyGoodsInfo(goodsInfo);
	}

	public int deleteGoodsInfo(GoodsInfo goodsInfo) throws Exception{
		// TODO Auto-generated method stub
		return mapper.deleteGoodsInfo(goodsInfo);
	}

	public int isExitInPack(GoodsInfo goodsInfo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.isExitInPack(goodsInfo);
	}
	
	
}
