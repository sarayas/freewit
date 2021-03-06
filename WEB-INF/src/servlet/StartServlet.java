package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.ComentDAO;
import dao.ContentDAO;
import dto.Coment;
import dto.Content;


public class StartServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");
		selectAlluser(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");
		selectAlluser(request, response);
	}
	public void selectAlluser(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");

		String error = null;
		String errorCmd = "";
		try {
			ContentDAO contentDao = new ContentDAO();
			ComentDAO comentDao = new ComentDAO();
			ArrayList<Content> contentList=contentDao.selectAllContent();
			ArrayList<Coment> comentList = comentDao.selectComent();
			request.setAttribute("contentList", contentList);
			request.setAttribute("comentList", comentList);
		} catch (IllegalStateException e) {
			//データベース接続エラーIllegal State Exception でスローした例外をキャッチ
			error="データベース接続エラーが発生しました。";
			errorCmd="login";
		}finally {
			//最後の処理request,responsesを他のサーブレット、ページに伝送する

			if (error != null) {
				request.setAttribute("error", error);
				request.setAttribute("errorCmd", errorCmd);
				request.getRequestDispatcher("/view/error.jsp").forward(
						request, response);
			} else {

				request.getRequestDispatcher("/view/login.jsp").forward(request,
						response);
			}
		}
	}


}
