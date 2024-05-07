package kr.co.oop;

public class Board {
	private int boardNum;
	private String writer;
	private String title;
	private String content;

	public Board() {
	}

	public Board(int boardNum, String writer, String title, String content) {
		super();
		this.boardNum = boardNum;
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

//	public Board boardCreate(Board board) {
//		
//		return board;
//	}


	public String getWriter() {
		return writer;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
