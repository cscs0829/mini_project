package model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);

	// 회원가입
	public int join(UserDTO dto) {

		connect();
		int cnt = 0;

		try {
			String sql = "INSERT INTO PLAYER VALUES(?, ?, ?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());

			cnt = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 로그인
	public boolean login(UserDTO dto) {
		connect();
		boolean result = false;

		try {
			String sql = "SELECT * FROM PLAYER WHERE ID = ? AND PW = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();

			if (rs.next()) {
				result = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	private void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-cgi.smhrd.com:1524:xe";
			String db_id = "campus_24K_dcx_bigdata16_p1_2";
			String db_pw = "smhrd2";

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			System.out.println("클래스 못 찾음ㅠㅠ");
		} catch (SQLException e) {
			System.out.println("DB연결 실패ㅠㅠ");
		} finally {
			close();
		}
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}

			rs.close();
			psmt.close();
			conn.close();
		} catch (Exception e2) {

		}
	}

}
