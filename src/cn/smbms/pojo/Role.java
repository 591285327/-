package cn.smbms.pojo;

import java.util.Date;
/**
 * Role
 * @author bdqn_hl
 * @date 2014-2-21
 */
public class Role extends Base{
	
	private Integer id;
	private String roleCode;
	private String roleName;
	private Integer isStart;
	private Date createDate;
	private String createdBy;
	
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getIsStart() {
		return isStart;
	}
	public void setIsStart(Integer isStart) {
		this.isStart = isStart;
	}
	@Override
	public Integer getId() {
		return id;
	}
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
}
