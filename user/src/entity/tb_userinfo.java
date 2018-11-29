package entity;

import java.util.List;

public class tb_userinfo {
	
    private int	userid;
    private String userAccount;
    private String password;
    private String email;
    private int status;
    private String workDate;
    private List<tb_role> list;
    
	public List<tb_role> getList() {
		return list;
	}
	public void setList(List<tb_role> list) {
		this.list = list;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
    
    
}
