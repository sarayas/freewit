package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.Coment;
import dto.Content;

public class ComentDAO {
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

	public void insertComent(Coment coment){
		Connection con = null;
		Statement smt = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "insert into comentinfo values("+coment.getContentIdx()+",'"+coment.getId()+"','"+coment.getContent()+"',curdate())";
			smt.executeUpdate(sql);

		} catch (SQLException e) {
			throw new IllegalStateException(e);
			// TODO: handle exception
		}finally {
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

	public ArrayList<Coment> selectComent(){
		Connection con = null;
		Statement smt = null;
		ArrayList<Coment> comentList = new ArrayList<Coment>();
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "select * from comentinfo";
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()){
				Coment coment = new Coment();
				coment.setContentIdx(rs.getString("contentidx"));
				coment.setId(rs.getString("id"));
				coment.setContent(rs.getString("content"));
				coment.setDate(rs.getString("date"));
				comentList.add(coment);

			}

		} catch (SQLException e) {
			throw new IllegalStateException (e) ;
		}finally {
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
		return comentList;
	}
	public void deleteComent(Coment coment){
		Connection con = null;
		Statement smt = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "delete from comentinfo where contentidx ="+coment.getContentIdx()+" and id='"+coment.getId()+"' and content='"+coment.getContent()+"'";
			smt.executeUpdate(sql);

		} catch (SQLException e) {
			throw new IllegalStateException(e);
			// TODO: handle exception
		}finally {
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
