package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.Coment;
import dto.Content;
import dto.User;

public class ContentDAO {
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

	public ArrayList<Content> selectAllContent() {
		Connection con = null;
		Statement smt = null;
		ArrayList<Content> list = new ArrayList<Content>();
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "select * from contentinfo order by contentidx desc";

				/*"select * from contentinfo left join comentinfo on contentinfo.contentidx = comentinfo.contentidx order by contentinfo.contentidx desc";*/


			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()){
				Content content = new Content();
				content.setContentIdx(rs.getString("contentidx"));
				content.setId(rs.getString("id"));
				content.setTitle(rs.getString("title"));
				content.setContent(rs.getString("content"));
				content.setDate(rs.getString("date"));
				content.setAuthority(rs.getString("authority"));
				content.setFilename(rs.getString("filename"));
				list.add(content);
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

	public ArrayList<Content> selectPrivateContent(String id, ArrayList<String> follow) {
		Connection con = null;
		Statement smt = null;
		ArrayList<Content> list = new ArrayList<Content>();
		try {
			con = getconConnection();
			smt = con.createStatement();
			String str = "";
			for(int i=0; i<follow.size(); i++){
				str += "or id='"+follow.get(i)+"'";
			}
			String sql = "select * from contentinfo where id='"+id+"'"+str+"or authority='1' order by contentidx desc";
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()){
				Content content = new Content();
				content.setContentIdx(rs.getString("contentidx"));
				content.setId(rs.getString("id"));
				content.setTitle(rs.getString("title"));
				content.setContent(rs.getString("content"));
				content.setDate(rs.getString("date"));
				content.setAuthority(rs.getString("authority"));
				content.setFilename(rs.getString("filename"));
				list.add(content);
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

	public ArrayList<Content> selectById(String id){
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList<Content> list = new ArrayList<Content>();
		try {
			con = getconConnection();
			String sql = "select * from contentinfo where id=? order by contentidx desc";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Content content = new Content();
				content.setContentIdx(rs.getString("contentidx"));
				content.setId(rs.getString("id"));
				content.setTitle(rs.getString("title"));
				content.setContent(rs.getString("content"));
				content.setDate(rs.getString("date"));
				content.setAuthority(rs.getString("authority"));
				content.setFilename(rs.getString("filename"));
				list.add(content);
			}


		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				if(ps !=null){
					ps.close();
				}
			} catch (Exception ignore) {
				// TODO: handle exception
			}
			try {
				if(con !=null){
					con.close();
				}

			} catch (Exception ignore) {
				// TODO: handle exception
			}

		}
		return list;
	}

	public Content SelectByIdx(String idx) {
		Connection con = null;
		Statement smt = null;
		Content content = new Content();
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "select * from Contentinfo where contentidx="+idx;
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()){
				content.setContentIdx(rs.getString("contentidx"));
				content.setId(rs.getString("id"));
				content.setTitle(rs.getString("title"));
				content.setContent(rs.getString("content"));
				content.setDate(rs.getString("date"));
				content.setAuthority(rs.getString("authority"));
				content.setFilename(rs.getString("filename"));
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
		return content;
	}
	public void insertContent(Content content) {
		Connection con = null;
		Statement smt = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String file = "";
			if(content.getFilename()!=null){
				file = ",'"+content.getFilename()+"'";
			}
			String sql = "insert into contentinfo values(null,'"+content.getId()+"','"+content.getTitle()+"','"+content.getContent()+"',curdate(),'"+content.getAuthority()+"'"+file+")";
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

	public void updateContent(Content content) {
		Connection con = null;
		Statement smt = null;
		String file = "";
		try {
			con = getconConnection();
			smt = con.createStatement();
			if(content.getFilename()!=null){
				file = ",filename='"+content.getFilename()+"'";
			}
			String sql = "update contentinfo set title='"+content.getTitle()+"', content='"+content.getContent()+"'"+file+ "where contentidx="+content.getContentIdx();
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

	public void deleteContent(String idx) {
		Connection con = null;
		Statement smt = null;
		try {
			con = getconConnection();
			smt = con.createStatement();
			String sql = "delete from contentinfo where contentidx="+idx;
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