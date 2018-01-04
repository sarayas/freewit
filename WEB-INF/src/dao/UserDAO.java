package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.User;

public class UserDAO {
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

	public ArrayList<User> selectAllUser() {
		Connection con = null;
		Statement smt = null;
		ArrayList<User> list = new ArrayList<User>();
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "select * from userinfo";
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()){
				User user = new User();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setAuthority(rs.getString("authority"));
				list.add(user);
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

	public User SelectById(String id) {
		Connection con = null;
		Statement smt = null;
		User user = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "select * from userinfo where id='"+id+"'";
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()){
				user = new User();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setAuthority(rs.getString("authority"));
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
		return user;
	}

	public User login(String id, String password) {
		Connection con = null;
		Statement smt = null;
		User user = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "select * from userinfo where id='"+id+"' and password='"+password+"'";
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()){
				user = new User();
				user.setId(rs.getString("id"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setAuthority(rs.getString("authority"));
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
		return user;
	}

	public void insertUser(User user) {
		Connection con = null;
		Statement smt = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "insert into userinfo values('"+user.getId()+"','"+user.getPassword()+"','"+user.getEmail()+"','"+user.getAuthority()+"')";
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

	public void updateUser(User user) {
		Connection con = null;
		Statement smt = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "update userinfo set authority='"+user.getAuthority()+"',password='"+user.getPassword()+"',email='"+user.getEmail()+"' where id='"+user.getId()+"'";
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

	public void deleteUser(String id) {
		Connection con = null;
		Statement smt = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "delete from userinfo where id='"+id+"'";
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
