package kr.co.check3;

public class Room {
	private int roomNum;
	private String roomName;
	private int numOfRoom;
	private int price;

	public void Hostell() {
	}

	public Room(int roomNum, String roomName, int numOfRoom, int price) {
		super();
		this.roomNum = roomNum;
		this.roomName = roomName;
		this.numOfRoom = numOfRoom;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
