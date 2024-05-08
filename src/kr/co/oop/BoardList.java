package kr.co.oop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BoardList {

	private String boardNum;
	private String boardName;

	private ArrayList<String> boardList = new ArrayList<String>();

	public BoardList() {
	}

	public BoardList(String boardNum, String boardName) {
		super();
		this.boardNum = boardNum;
	}

	public String getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(String boardNum) {
		this.boardNum = boardNum;
	}

	public void boardListPrint(Board board) {

//		for (int i = 0; i < boardList.size(); i++) {

//		}

		for (String str : boardList) {
			System.out.println("게시글 번호 : " + board.getBoardNum());
			System.out.println("제목 : " + board.getTitle());
		}

//		System.out.println("게시글 번호 : " + board.getBoardNum());
//		System.out.println("제목 : " + board.getTitle());
//		System.out.println("작성자 : " + board.getWriter());
//		System.out.println("내용 : " + board.getContent());
	}

}
