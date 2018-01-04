package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import dto.User;

public class UserControllerServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");

		String error = null;
		String errorCmd = "";
		int uCmd = Integer.parseInt(request.getParameter("uCmd"));

		int link=0;
		try {
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");

			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String authority = request.getParameter("authority");
			link = Integer.parseInt(request.getParameter("link"));

			User userObj = new User();
			UserDAO userDao = new UserDAO();
			switch (uCmd) {

			//insert
			case 1:
				if(userDao.SelectById(id)!=null){
					error="既に登録されたユーザー名です。";
					errorCmd="login";
					return;
				}
				userObj.setId(id);
				userObj.setPassword(password);
				userObj.setEmail(email);
				userObj.setAuthority("2");
				userDao.insertUser(userObj);
				break;
			//update
			case 2:
				if(user == null){
					//ログインセッションが切れた例外処理
					error="セッション切れの為、ログイン画面に戻ります。";
					errorCmd="login";
					return;
				}
				if(userDao.SelectById(id).getId()==null){
					error="存在しないユーザーです。";
				}
				userObj.setId(id);
				userObj.setPassword(password);
				userObj.setEmail(email);
				userObj.setAuthority(authority);
				userDao.updateUser(userObj);
/*				userObj = userDao.SelectById(id);
				session.setAttribute("user", userObj);*/
				break;
			//delete
			case 3:
				if(user == null){
					error="セッション切れの為、ログイン画面に戻ります。";
					errorCmd="login";
					return;
				}
				if(userDao.SelectById(id)==null){
					error="存在しないユーザーです。";
				}
				userDao.deleteUser(id);
				break;
			}
		} catch (IllegalStateException e) {
			//データベース接続エラーIllegal State Exception でスローした例外をキャッチ
			error="データベース接続エラーが発生しました。";
			errorCmd="login";
		} finally {
			//最後の処理request,responsesを他のサーブレット、ページに伝送する

			if (error != null) {
				request.setAttribute("error", error);
				request.setAttribute("errorCmd", errorCmd);
				request.getRequestDispatcher("/view/error.jsp").forward(
						request, response);
			} else if(link ==1){
				String message = "会員登録が正常に完了されました。";
				request.setAttribute("message", message);
				request.getRequestDispatcher("/view/checkPage.jsp").forward(
						request, response);
			} else if (link==2){
				request.getRequestDispatcher("/selectAllUser").forward(
						request, response);
			}else {
				request.getRequestDispatcher("/contentPage").forward(
						request, response);
			}
		}
	}

}
