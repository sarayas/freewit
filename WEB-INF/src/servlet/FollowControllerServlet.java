package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.FollowDAO;
import dto.Follow;
import dto.User;

public class FollowControllerServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");

		//エラー判別の為の変数
		String error = null;
		String errorCmd = "";

		//follow処理を判断するCMD
		int fCmd = Integer.parseInt(request.getParameter("fCmd"));

		//例外処理
		try {

			//session check
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");

			//ログインセッションが切れた例外処理
			if(user == null){
				error="セッション切れの為、ログイン画面に戻ります。";
				errorCmd="login";
				return;
			}

			//変数の宣言
			String follower = request.getParameter("follow");
			Follow follow = null;
			FollowDAO followDao = new FollowDAO();

			switch (fCmd) {

			// insert
			case 1:
				follow = new Follow();
				follow.setId(user.getId());
				follow.setFollow(follower);
				followDao.insertFollower(follow);
				ArrayList<String> followList = followDao.selectAllFollwer(user.getId());
				session.setAttribute("followList", followList);
				break;

			// delete
			case 2:
				followDao.deleteFollower(follower);
				followList = followDao.selectAllFollwer(user.getId());
				session.setAttribute("followList", followList);
				break;
			}

		} catch (IllegalStateException e) {
			//データベース接続エラーIllegal State Exception でスローした例外をキャッチ
			error="データベース接続エラーが発生しました。";
			errorCmd="login";

		} finally {
			if (error != null) {
				//最後の処理request,responsesを他のサーブレット、ページに伝送する
				request.setAttribute("error", error);
				request.setAttribute("errorCmd", errorCmd);
				request.getRequestDispatcher("/view/error.jsp").forward(
						request, response);
			} else if(fCmd==2) {

				request.getRequestDispatcher("/view/follow.jsp").forward(request,
						response);
			} else{
				request.getRequestDispatcher("/contentPage").forward(request,
						response);
			}
		}
	}

}
