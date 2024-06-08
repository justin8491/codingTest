package kr.co.dong.dbtest;

public class Member {

	private String uid;
	private String pwd;
	private String name;
	private String gender;
	private String email;

	public Member() {
	}

	public Member(String uid, String pwd) {
		super();
		this.uid = uid;
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "Member [uid=" + uid + ", pwd=" + pwd + ", name=" + name + ", gender=" + gender + ", email=" + email
				+ "]";
	}

	

	

}
