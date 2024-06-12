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
	
	
	
	public Member(String uid, String pwd, String name, String gender, String email) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
		this.email = email;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [uid=" + uid + ", pwd=" + pwd + ", name=" + name + ", gender=" + gender + ", email=" + email
				+ "]";
	}

	

	

}
