package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.Follow;

public class FollowDAO {
	public static String RDB_DRIVE = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost/freewit";
	public static String USER = "root";
	public static String PASSWD = "root123";

	private static Connection getconConnection() {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			return con;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}
	public ArrayList<String>selectAllFollwer(String id){
		Connection con = null;
		Statement smt = null;
		ArrayList<String> list = new ArrayList<String>();
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "select * from followinfo where id='"+id+"'";
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()){
				list.add(rs.getString("follow"));
			}

		} catch (SQLException e) {

			throw new IllegalStateException(e);
		} finally {
			try {
				if (smt != null) {
					smt.close();
				}
			} catch (SQLException ignore) {
				// TODO: handle exception
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException ignore) {
				// TODO: handle exception
			}
		}
		return list;
	}
	public void insertFollower(Follow follow){
		Connection con = null;
		Statement smt = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "insert into followinfo values('"+follow.getId()+"','"+follow.getFollow()+"')";
			smt.executeUpdate(sql);

		} catch (SQLException e) {

			throw new IllegalStateException(e);
		} finally {
			try {
				if (smt != null) {
					smt.close();
				}
			} catch (SQLException ignore) {
				// TODO: handle exception
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException ignore) {
				// TODO: handle exception
			}
		}
	}
	public void deleteFollower(String follower){
		Connection con = null;
		Statement smt = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "delete from followinfo where follow='"+follower+"'";
			smt.executeUpdate(sql);

		} catch (SQLException e) {

			throw new IllegalStateException(e);
		} finally {
			try {
				if (smt != null) {
					smt.close();
				}
			} catch (SQLException ignore) {
				// TODO: handle exception
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException ignore) {
				// TODO: handle exception
			}
		}
	}


}
