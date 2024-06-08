package kr.co.dong.dbtest;

public class Member {

	private String uid;
	private String pwd;

	public Member() {
	}

	public Member(String uid, String pwd) {
		super();
		this.uid = uid;
		this.pwd = pwd;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void memberList() {

	}

	@Override
	public String toString() {
		return "Member [아이디=" + uid + ", 비밀번호=" + pwd + "]";
	}

}
