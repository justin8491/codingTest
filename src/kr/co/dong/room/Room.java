/*
 * ȣ�� ���� ���α׷� �����ϱ� ver1.0
 * - ȣ�ڹ� : ȣ��, ���̸�,  ����, ����, ��������(����), �����ڸ�, �����ڵ�
 * - �濹�� : �����ڸ�, �����ڵ�, ȣ��
 * - ��� : �����ϱ�, ��������ϱ�, ȣ�ڷ� Ȯ���ϱ�, �޴������ֱ�, �帧�����ֱ�
 *  
 */
package kr.co.dong.room;

import java.util.List;

public class Room {
	private int rNo; // 방 번호
	private String rName; // 방 이름
	private int rPrice; // 방 가격
	private String rContent; // 방 내용?
	private boolean check; // 예약 true/false
	private String customer; // 예약자
	private String revCode; // 예약 번호

	public Room() {
	}

	/**
	 * @param rNo
	 * @param rName
	 * @param rPrice
	 * @param rContent
	 */
	public Room(int rNo, String rName, int rPrice, String rContent) {
		super();
		this.rNo = rNo;
		this.rName = rName;
		this.rPrice = rPrice;
		this.rContent = rContent;
	}

	public int getrNo() {
		return rNo;
	}

	public void setrNo(int rNo) {
		this.rNo = rNo;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public int getrPrice() {
		return rPrice;
	}

	public void setrPrice(int rPrice) {
		this.rPrice = rPrice;
	}

	public String getrContent() {
		return rContent;
	}

	public void setrContent(String rContent) {
		this.rContent = rContent;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getRevCode() {
		return revCode;
	}

	public void setRevCode(String revCode) {
		this.revCode = revCode;
	}

	@Override
	public String toString() {
		return "Room [rNo=" + rNo + ", rName=" + rName + ", rPrice=" + rPrice + ", rContent=" + rContent + ", check="
				+ check + ", customer=" + customer + ", revCode=" + revCode + "]";
	}

	

}
