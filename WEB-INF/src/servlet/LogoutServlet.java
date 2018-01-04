package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");

		HttpSession session = request.getSession();
		session.invalidate();

		request.getRequestDispatcher("/start").forward(request,
				response);
	}

}
