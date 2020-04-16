package cn.smbms.service.reply;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.reply.ReplyMapper;
import cn.smbms.pojo.Reply;
/**
 * ReplyServiceImpl
 * @author bdqn_hl
 * @date 2014-2-25
 */
@Service
public class ReplyServiceImpl implements ReplyService{

	@Resource
	private ReplyMapper mapper;
	@Override
	public List<Reply> getReplyList(Reply replay) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getReplyList(replay);
	}

	@Override
	public int count(Reply replay) throws Exception {
		// TODO Auto-generated method stub
		return mapper.count(replay);
	}

	@Override
	public int delete(Reply replay) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delete(replay);
	}

	@Override
	public int addReply(Reply reply) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addReply(reply);
	}

}
