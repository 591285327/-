package cn.smbms.service.leavemessage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.smbms.dao.leavemessage.LeaveMessageMapper;
import cn.smbms.pojo.LeaveMessage;
/**
 * LeaveMessageServiceImpl
 * @author bdqn_hl
 * @date 2014-2-26
 */
@Service
public class LeaveMessageServiceImpl implements LeaveMessageService{
	
	@Resource
	private LeaveMessageMapper mapper;
	
	public List<LeaveMessage> getLeaveMessageList(LeaveMessage leaveMessage)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getLeaveMessageList(leaveMessage);
	}

	public int count(LeaveMessage leaveMessage) throws Exception {
		// TODO Auto-generated method stub
		return mapper.count(leaveMessage);
	}

	public int addLeaveMessage(LeaveMessage leaveMessage) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addLeaveMessage(leaveMessage);
	}

	public int modifyLeaveMessage(LeaveMessage leaveMessage) {
		// TODO Auto-generated method stub
		return mapper.modifyLeaveMessage(leaveMessage);
	}

	public int deleteLeaveMessage(LeaveMessage deleteLeaveMessage) {
		// TODO Auto-generated method stub
		return mapper.deleteLeaveMessage(deleteLeaveMessage);
	}

	public LeaveMessage getLeaveMessage(LeaveMessage leaveMessage)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getLeaveMessage(leaveMessage);
	}

}
