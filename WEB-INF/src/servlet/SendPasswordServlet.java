package servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import dto.User;

public class SendPasswordServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		//日本語利用の為のエンコーディング
		response.setContentType("text/html; charset=Windows-31J");
		request.setCharacterEncoding("Windows-31J");


		String mail = "";
		String error=null;
		String errorCmd="";

		try {

			String id = request.getParameter("id");
			String email = request.getParameter("email");
			UserDAO userDao = new UserDAO();
			User user = userDao.SelectById(id);
			if(user==null){
				error="入力したユーザー名は登録されていません。";
				errorCmd="login";
				return;
			}
			if(!user.getEmail().equals(email)){
				error="メールアドレス情報が間違いました。";
				errorCmd="Password";
				return;
			}

			mail ="新しい世界を開こう!\n" +
					"FreeWitです。\n" +
					"この度、弊社のシステムをご利用いただき、誠に有難うございます。\n" +
					"お客様から要請いただきましたパスワード探しの結果を送りいたします。\n"+
					"お客様のユーザー名："+user.getId()+"\n "+
					"お客様のパスワード："+user.getPassword()+"\n"+
					"これからも宜しく尾長居いたします。";

			Properties props = System.getProperties();

			// SMTPサーバのアドレスを指定（今回はGmailのSMTPサーバを利用）
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.debug", "true");

			Session session = Session.getInstance(props,
					new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(
									"sarayaszeroj@gmail.com", "chocola1010");
						}
					});

			MimeMessage mimeMessage = new MimeMessage(session);
			// 送信元メールアドレスと送信者名を指定
			mimeMessage.setFrom(new InternetAddress("sarayaszeroj@gmail.com",
					"kwon", "iso-2022-jp"));

			// 送信先メールアドレスを指定
			mimeMessage.setRecipients(Message.RecipientType.TO, user.getEmail());

			// メールのタイトルを指定
			mimeMessage.setSubject("書籍注文の確認メール", "iso-2022-jp");

			// メールの内容を指定
			mimeMessage.setText(mail, "iso-2022-jp");

			// メールの形式を指定
			mimeMessage.setHeader("Content-Type",
					"text/plain; charset=iso-2022-jp");

			// 送信日付を指定
			mimeMessage.setSentDate(new Date());

			// 送信します
			Transport.send(mimeMessage);

			// 送信成功
			System.out.println("送信に成功しました。");
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("送信に失敗しました。\n" + e);
		}finally{
			//最後の処理request,responsesを他のサーブレット、ページに伝送する

			if(error!=null){
				request.setAttribute("error", error);
				request.setAttribute("errorCmd", errorCmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);

			}else{

				String message="お客様のパスワードの伝送が正常に完了されました。\n" +
						"登録したメールを確認お願い致します。";
				request.setAttribute("message", message);
				request.getRequestDispatcher("/view/checkPage.jsp").forward(request, response);

			}
		}

	}

}
