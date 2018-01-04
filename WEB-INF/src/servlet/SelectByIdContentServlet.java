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

public class SelectByIdContentServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{

		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");
		String error = null;
		String errorCmd = "";
		try {
			HttpSession session = request.getSession();

			User user = (User)session.getAttribute("user");
			String id = request.getParameter("id");

			ContentDAO contentDao = new ContentDAO();
			ComentDAO comentDao = new ComentDAO();
			ArrayList<Coment> comentList = comentDao.selectComent();
			ArrayList<Content> contentList = contentDao.selectById(id);

			request.setAttribute("contentList", contentList);
			request.setAttribute("comentList", comentList);

		} catch (IllegalStateException e) {

			// TODO: handle exception
		}finally{
			if(error != null){
				request.setAttribute("error", error);
				request.setAttribute("errorCmd", errorCmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}else{
				request.getRequestDispatcher("/view/contentPageById.jsp").forward(request, response);
			}
		}

	}


}
