package kr.co.dong.check3;

public class Room {
	private int roomNum;
	private String roomName;
	private int numOfRoom;
	private boolean reserVation;
	private int price;
	private String roomPwd;

	public Room() {
	}

	public Room(int roomNum, String roomName, int numOfRoom, boolean reserVation, int price, String roomPwd) {
		super();
		this.roomNum = roomNum;
		this.roomName = roomName;
		this.numOfRoom = numOfRoom;
		this.reserVation = reserVation;
		this.price = price;
		this.roomPwd = roomPwd;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getNumOfRoom() {
		return numOfRoom;
	}

	public void setNumOfRoom(int numOfRoom) {
		this.numOfRoom = numOfRoom;
	}

	public boolean isReserVation() {
		return reserVation;
	}

	public void setReserVation(boolean reserVation) {
		this.reserVation = reserVation;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRoomPwd() {
		return roomPwd;
	}

	public void setRoomPwd(String roomPwd) {
		this.roomPwd = roomPwd;
	}

	

}
