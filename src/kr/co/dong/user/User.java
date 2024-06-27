package kr.co.dong.user;

import java.sql.Timestamp;

public class User {
	private String uid;
	private String pwd;
	private String email;
	private Timestamp create_at;

	public User(String uid, String pwd, String email, Timestamp create_at) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.email = email;
		this.create_at = create_at;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}

}
