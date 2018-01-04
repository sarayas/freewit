/*FreeWit SNS System
 * 作成者：権　五聖
 * 最終修正日：2018年1月4日
 *
 * コンテンツの入力、削除を管理するサーブレット*/

package servlet;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import dao.ContentDAO;
import dto.Content;
import dto.User;

public class ContentControllerServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");

		//エラー判別の為の変数
		String error=null;
		String errorCmd="";

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

			//file max size
			int maxPostSize = 10 * 1024 * 1024;

			//save directory(paht)
			String saveDirectory = getServletContext().getRealPath("/upload");

			//mautlpart object
			MultipartRequest multi = new MultipartRequest(request, saveDirectory, maxPostSize, "Windows-31J");


			//変数の宣言
			int cCmd = Integer.parseInt(multi.getParameter("cCmd"));		//処理の種類を判断するCMD
			ContentDAO contentDao = new ContentDAO();						//DAOオブジェクト
			Content contentObj = new Content();								//DTOオブジェクト

		     Enumeration formNames=multi.getFileNames();					//マルチパトオブジェクト
		     String title = multi.getParameter("title");					//コンテンツタイトル
		     String content = multi.getParameter("content");				//コンテンツ内容
		     String idx = multi.getParameter("idx");						//コンテンツインデックス


		     //ファウルの情報及びアプデート
		     String fileInput = "";
		     String fileName = "";
		     String type = "";
		     File fileObj = null;
		     String originFileName = "";
		     String fileExtend = "";
		     String fileSize = "";

		     while(formNames.hasMoreElements()) {


		          fileInput = (String)formNames.nextElement();

		          fileName = multi.getFilesystemName(fileInput);

		          if (fileName != null) {
		               type = multi.getContentType(fileInput);

		               fileObj = multi.getFile(fileInput);

		               originFileName = multi.getOriginalFileName(fileInput);

		               fileExtend = fileName.substring(fileName.lastIndexOf(".")+1);

		               fileSize = String.valueOf(fileObj.length());
		          }
		     }



			switch (cCmd) {

				//insert
			case 1:

				contentObj.setId(user.getId());
				contentObj.setTitle(title);
				contentObj.setContent(content);
				contentObj.setAuthority(user.getAuthority());
				contentObj.setFilename(originFileName);
				contentDao.insertContent(contentObj);

				break;

			case 2:

				//update

				if(contentDao.SelectByIdx(idx).getId() == null){
					error="存在しないコンテンツです。";
					return;
				}
				contentObj.setContentIdx(idx);
				contentObj.setId(user.getId());
				contentObj.setTitle(title);
				contentObj.setContent(content);
				contentObj.setAuthority(user.getAuthority());
				contentObj.setFilename(originFileName);
				contentDao.updateContent(contentObj);
				break;

				//delete
			case 3:
				if(contentDao.SelectByIdx(idx).getId() == null){
					error="存在しないコンテンツです。";
					return;
				}
				contentDao.deleteContent(idx);
				break;
			}
		} catch (IllegalStateException e) {
			//データベース接続エラーIllegal State Exception でスローした例外をキャッチ
			error="データベース接続エラーが発生しました。";
			errorCmd="login";

		}finally{
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
