package kr.co.dong.good2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static kr.co.dong.good.JDBCTemplate.*;

public class GoodDAOimp implements GoodDAO {

	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List<Bean> goodList = new ArrayList<Bean>();
	Bean good = new Bean();
	Connection conn = getConnection();
	GoodsMsg gMsg = new GoodsMsg();
	GoodsMenu gm = new GoodsMenu();
	int result = 0;

	@Override
	public List<Bean> listAll() {
		goodList = new ArrayList<Bean>();
		try {
			pstmt = conn.prepareStatement("select * from goods");
			prnState();
			rs = pstmt.executeQuery();

			while (rs.next()) {
				goodList.add(new Bean(rs.getInt("gid"), rs.getNString("gname"), rs.getString("gcontent"),
						rs.getInt("gcnt"), rs.getString("getc")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
//			gMsg.goodErrorMsg(e);
		}
		return goodList;
	}

	@Override
	public int insert() {
		good = new Bean();
		System.out.println("상품추가");
		try {
			good = gm.add();
			pstmt = conn.prepareStatement("INSERT INTO goods VALUES(?, ?, ?, ?, ?)");
			pstmt.setInt(1, good.getGid());
			pstmt.setNString(2, good.getGname());
			pstmt.setNString(3, good.getGcontent());
			pstmt.setInt(4, good.getGcnt());
			pstmt.setNString(5, good.getGetc());
			prnState();
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			//gMsg.goodErrorMsg(e);
		}
		return result;
	}

	@Override
	public int update() {
		good = new Bean();
		System.out.println("상품수정");
		try {
			int getId = gm.GoodsId();
			good = gm.add();
			good.setGid(getId);
			pstmt = conn.prepareStatement("update goods set gname = ?, gcontent = ?, gcnt = ?, getc = ? where gid = ?");
			pstmt.setString(1, good.getGname());
			pstmt.setString(2, good.getGcontent());
			pstmt.setInt(3, good.getGcnt());
			pstmt.setString(4, good.getGetc());
			pstmt.setInt(5, good.getGid());
			prnState();
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
//			gMsg.goodErrorMsg(e);
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public Bean selectOne() {
		int getId = gm.GoodsId();
		try {
			pstmt = conn.prepareStatement("select * from goods where gid = ?");
			pstmt.setInt(1, getId);
			prnState();
			rs = pstmt.executeQuery();

			while (rs.next()) {
				good = new Bean(rs.getInt("gid"), rs.getString("gname"), rs.getString("gcontent"), rs.getInt("gcnt"),
						rs.getString("getc"));
			}
		} catch (SQLException e) {
//			gMsg.goodErrorMsg(e);
			e.printStackTrace();
		}

		return good;
	}

	@Override
	public int delete(int gid) {
		System.out.println("상품삭제");
		try {
			pstmt = conn.prepareStatement("delete from goods where gid = ?");
			pstmt.setInt(1, gid);

			prnState();

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
//			gMsg.goodErrorMsg(e);
			e.printStackTrace();
		}

		return result;
	}

	public void prnState() {
		//
		System.out.println("동작을 진행합니다........");
		try {
			Thread.sleep(1000); // 1초간 재우기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("동작 합니다. ");
	}

}
