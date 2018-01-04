package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ComentDAO;
import dto.Coment;
import dto.User;

public class ComentControllerServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");
		String error = null;
		String errorCmd = "";
		try {
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");

			if (user == null) {
				error = "セッション切れの為、ログイン画面に戻ります。";
				errorCmd = "login";
				return;
			}

			String content = request.getParameter("coment");
			String contentIdx = request.getParameter("contentIdx");
			String id = user.getId();
			int cCmd = Integer.parseInt(request.getParameter("cCmd"));
			ComentDAO comentDao = new ComentDAO();
			Coment coment = new Coment();

			switch (cCmd) {
			//insert
			case 1:

				coment.setContentIdx(contentIdx);
				coment.setId(id);
				coment.setContent(content);
				comentDao.insertComent(coment);
				break;
			//delete
			case 2:
				coment.setContentIdx(contentIdx);
				coment.setId(id);
				coment.setContent(content);
				comentDao.deleteComent(coment);
				break;
			}



		} catch (IllegalStateException e) {
			error = "データベース接続エラーが発生しました。";
			errorCmd = "login";
		} finally {
			if (error != null) {
				request.setAttribute("error", error);
				request.setAttribute("errorCmd", errorCmd);
				request.getRequestDispatcher("/view/error.jsp").forward(
						request, response);
			} else {
				request.getRequestDispatcher("/contentPage").forward(request,
						response);
			}
		}

	}

}
