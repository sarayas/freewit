package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.FollowDAO;
import dao.UserDAO;
import dto.User;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");

		String error = null;
		String errorCmd = "";
		User user = null;
		try {
			HttpSession session = request.getSession();
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			UserDAO userDao = new UserDAO();
			user = userDao.login(id, password);
			if (user == null) {
				error = "ユーザー名やパスワードを確認してください。";
				errorCmd = "login";
				return;
			}
			if(user.getAuthority().equals("3")){
				error = "会員様は現在利用停止状態です。";
				errorCmd = "login";
				return;
			}
			FollowDAO followDao = new FollowDAO();
			ArrayList<String> followList = followDao.selectAllFollwer(id);

			session.setAttribute("user", user);
			session.setAttribute("followList", followList);
		} catch (IllegalStateException e) {
			error="データベース接続エラーが発生しました。";
			errorCmd="login";
		} finally {
			if (error != null) {
				request.setAttribute("error", error);
				request.setAttribute("errorCmd", errorCmd);
				request.getRequestDispatcher("/view/error.jsp").forward(
						request, response);
			} else if(user.getAuthority().equals("1")) {

				request.getRequestDispatcher("/view/admin.jsp").forward(request,
						response);
			}else{
				request.getRequestDispatcher("/privatePage").forward(request,
						response);

			}
		}
	}

}
