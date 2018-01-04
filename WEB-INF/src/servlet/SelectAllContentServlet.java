package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ComentDAO;
import dao.ContentDAO;
import dto.Coment;
import dto.Content;
import dto.User;

public class SelectAllContentServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");
		contentPage(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");
		contentPage(request, response);

	}

	public void contentPage(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");

		String error = null;
		String errorCmd = "";
		try {
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");
			if (user == null) {
				//ログインセッションが切れた例外処理
				error = "セッション切れの為、ログイン画面に戻ります。";
				errorCmd = "login";
				return;
			}
			ContentDAO contentDao = new ContentDAO();
			ComentDAO comentDao = new ComentDAO();
			ArrayList<Content> ContentList = contentDao.selectAllContent();
			ArrayList<Coment> comentList =  comentDao.selectComent();
			request.setAttribute("contentList", ContentList);
			request.setAttribute("comentList", comentList);

		} catch (IllegalStateException e) {
			//データベース接続エラーIllegal State Exception でスローした例外をキャッチ
			error = "データベース接続エラーが発生しました。";
			errorCmd = "login";
		} finally {
			//最後の処理request,responsesを他のサーブレット、ページに伝送する

			if (error != null) {
				request.setAttribute("error", error);
				request.setAttribute("errorCmd", errorCmd);
				request.getRequestDispatcher("/view/error.jsp").forward(
						request, response);
			} else {

				request.getRequestDispatcher("/view/contentPage.jsp").forward(
						request, response);
			}
		}

	}

}
