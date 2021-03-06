/*FreeWit SNS System
 * 作成者：権　五聖
 * 最終修正日：2018年1月4日
 *
 * コメントの入力、削除を管理するサーブレット*/
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

		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");

		//エラー判別の為の変数
		String error = null;
		String errorCmd = "";

		//例外処理
		try {
			//session check
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("user");

			//ログインセッションが切れた例外処理
			if (user == null) {
				error = "セッション切れの為、ログイン画面に戻ります。";
				errorCmd = "login";
				return;
			}

			//変数の宣言
			String content = request.getParameter("coment");			//コメント内容
			String contentIdx = request.getParameter("contentIdx");		//コメントが付ける
			String id = user.getId();									//ログインしたユーザーの情報
			int cCmd = Integer.parseInt(request.getParameter("cCmd"));	//処理を区分する為のCMD
			ComentDAO comentDao = new ComentDAO();						//DAOオブジェクト
			Coment coment = new Coment();								//DTOオブジェクト

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
				request.getRequestDispatcher("/contentPage").forward(request,
						response);
			}
		}

	}

}
