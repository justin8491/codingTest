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
		System.out.println("게시글 번호 : " + board.getBoardNum());
		System.out.println("제목 : " + board.getTitle());
		System.out.println("작성자 : " + board.getWriter());
		System.out.println("내용 : " + board.getContent());
	}

}
