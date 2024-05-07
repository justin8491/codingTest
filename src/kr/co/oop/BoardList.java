package kr.co.oop;

public class BoardList {

	private String boardNum;
	private String boardName;

	public BoardList() {
	}

	public BoardList(String boardNum, String boardName) {
		super();
		this.boardNum = boardNum;
		this.boardName = boardName;
	}

	public String getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(String boardNum) {
		this.boardNum = boardNum;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public void boardListPrint(Board board) {
		System.out.println("�Խñ� ��ȣ : " + board.getBoardNum());
		System.out.println("���� : " + board.getTitle());
		System.out.println("�ۼ��� : " + board.getWriter());
		System.out.println("���� : " + board.getContent());
	}

}
