package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import dto.User;

public final class userModi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/common/header.jsp");
    _jspx_dependants.add("/common/menu.jsp");
    _jspx_dependants.add("/common/footer.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=Windows-31J");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	ArrayList<String> followList = (ArrayList<String>) session
			.getAttribute("followList");
	User user = (User) session.getAttribute("user");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=Windows-31J\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/common/div.css\" />\r\n");
      out.write("\t\t<title>アカウント情報変更</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction validationForm(){\r\n");
      out.write("\t\t\tvar email = document.forms[\"usermodi\"][\"email\"].value;\r\n");
      out.write("\t\t\tvar password = document.forms[\"usermodi\"][\"password\"].value;\r\n");
      out.write("\t\t\tvar passwordCheck = document.forms[\"usermodi\"][\"passwordCheck\"].value;\r\n");
      out.write("\r\n");
      out.write("\t\t\tif(email==\"\"){\r\n");
      out.write("\t\t\t\talert(\"メールを入力して下さい。\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\tif(password==\"\"){\r\n");
      out.write("\t\t\t\talert(\"パスワードを入力して下さい。\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\tif(password!=passwordCheck){\r\n");
      out.write("\t\t\t\talert(\"同じパスワードを入力して下さい。\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body style=\"background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);\">\r\n");
      out.write("\t\t");
      out.write("\t\n");
      out.write("\t<style>\n");
      out.write("\t\t\t.header{\n");
      out.write("\t\t\t\tposition:fixed;\n");
      out.write("\t\t\t\ttop:0;\n");
      out.write("\t\t\t\tleft:0;\n");
      out.write("\t\t\t\tright:0;\n");
      out.write("\t\t\t\tbackground-color: #ffffff;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t<div class=\"header\" style=\"background-image: linear-gradient(to top, white 100%, #D7D2FF 0%);\">\n");
      out.write("\t\t<table align=\"center\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th><IMG SRC=\"");
      out.print(path );
      out.write("/imgfile/left.png\" width=\"80px\" height=\"80px\" align=\"left\"></th>\n");
      out.write("\t\t\t\t<th><h1 align=\"center\" >FreeWit</h1></th>\n");
      out.write("\t\t\t\t<th><IMG SRC=\"");
      out.print(path );
      out.write("/imgfile/right.png\" width=\"80px\" height=\"80px\" align=\"right\"></th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    $(\"#flip\").click(function(){\r\n");
      out.write("        $(\"#panel\").slideToggle(\"slow\");\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#panel, #flip {\r\n");
      out.write("    padding: 5px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);\r\n");
      out.write("    border: solid 1px #c3c3c3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#panel {\r\n");
      out.write("    padding: 50px;\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div style=\"float: left; position: fixed; margin-left: 30; margin-top: 0;\">\r\n");
      out.write("\t\t<div id=\"flip\" >メニュー</div>\r\n");
      out.write("\t<div id=\"panel\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h2>サイトマップ</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t<h4>");
      out.print(user.getId() );
      out.write("のアカウントです。</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t<p><a href=\"");
      out.print(request.getContextPath() );
      out.write("/contentPage\">全てのコンテンツ</a></p>\r\n");
      out.write("\t\t<p><a href=\"");
      out.print(request.getContextPath() );
      out.write("/privatePage\">個人ページ</a></p>\r\n");
      out.write("\t\t<p><a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/follow.jsp\">フォロー管理</a></p>\r\n");
      out.write("\t\t<p><a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/userModi.jsp\">個人情報修正</a></p>\r\n");
      out.write("\t\t<p><a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/contentInsert.jsp\">投稿</a></p>\r\n");
      out.write("\t\t<p><a href=\"");
      out.print(request.getContextPath() );
      out.write("/logout\">ログアウト</a></p>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h2 align=\"center\">アカウント情報変更</h2>\r\n");
      out.write("\t\t\t<hr color=\"#000000\" />\r\n");
      out.write("\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t<div class=\"float-left\" style=\"width: 20%;\">\r\n");
      out.write("\t\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" class=\"float-left\" style=\"width: 60%;\">\r\n");
      out.write("\t\t\t\t\t\t<form name=\"usermodi\" action=\"");
      out.print(request.getContextPath());
      out.write("/userController\" onsubmit=\"return validationForm()\" method=\"post\" ><br>\r\n");
      out.write("\t\t\t\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>＜＜変更情報＞＞</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=\"#B5B4FF\" width=\"200\">ユーザー名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(user.getId());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=\"#9190FF\" width=\"200\">E-Mail</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"email\" name=\"email\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=A3A2FF width=\"200\">パースワード</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td bgcolor=A3A2FF width=\"200\">パースワード確認</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"password\" name=\"passwordCheck\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(user.getId());
      out.write("\"></input> <br />\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"uCmd\" value=\"2\"></input> <br />\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"link\" value=\"3\"></input> <br />\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"authority\" value=\"2\"></input> <br />\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"変更完了\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"float-left\" style=\"width: 20%\">フォローしたユーザー\r\n");
      out.write("\t\t\t\t");

					for (int i = 0; i < followList.size(); i++) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<p>");
      out.print(followList.get(i));
      out.write("</p>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\t.footer{\n");
      out.write("\t\t\t\tposition:fixed;\n");
      out.write("\t\t\t\tleft:0;\n");
      out.write("\t\t\t\tright:0;\n");
      out.write("\t\t\t\tbottom:0;\n");
      out.write("\t\t\t\tbackground-color: #ffffff;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer\" style=\"background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);\">\n");
      out.write("\t\t\t<hr size=\"4\" color=\"#000000\" />\n");
      out.write("\t\t\tCopyright(C)2017 All Right Reserved.\n");
      out.write("\t\t</div>");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
