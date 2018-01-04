package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import dto.Content;
import dto.User;
import dto.Coment;

public final class contentPageById_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/common/header.jsp");
    _jspx_dependants.add("/common/adminMenu.jsp");
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

      out.write('\n');

	String path = request.getContextPath();
	ArrayList<Content> contentList = (ArrayList<Content>) request.getAttribute("contentList");
	ArrayList<String> followList = (ArrayList<String>) session.getAttribute("followList");
	ArrayList<Coment> comentList = (ArrayList<Coment>) request.getAttribute("comentList");

	User user = (User) session.getAttribute("user");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=Windows-31J\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/common/div.css\" />\n");
      out.write("\t\t<title>全てのコンテンツ</title>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\t\tfunction check(){\n");
      out.write("\t\t\treturn confirm(\"コンテンツを削除します。\\nよろしいですか。\");\n");
      out.write("\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("\t\t</head>\n");
      out.write("\t<body style=\"background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);\">\n");
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
      out.write('\n');
      out.write('	');
      out.write('	');

			if (user.getAuthority().equals("1")) {
		
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write("\t\n");
      out.write("\n");
      out.write("<div style=\"float: left; position: fixed; margin-left: 40;\">\n");
      out.write("<ul>\n");
      out.write("\t<h2>サイトマップ</h2>\n");
      out.write("\n");
      out.write("\t\t<h4>");
      out.print(user.getId() );
      out.write("様のアカウントです。</h4>\n");
      out.write("\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/admin.jsp\">管理者メニュー</a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/selectAllUser\">ユーザ管理</a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/contentPage\">コンテンツ管理</a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/contentInsert.jsp\">広告登録</a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/logout\">ログアウト</a></li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write('\n');
      out.write('	');
      out.write('	');

			} else {
		
      out.write('\n');
      out.write('	');
      out.write('	');
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
      out.write('\n');
      out.write('	');
      out.write('	');

			}
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2 align=\"center\">");
      out.print(contentList.get(0).getId() );
      out.write("様のコンテンツ</h2>\n");
      out.write("\t\t\t<hr color=\"#000000\" />\n");
      out.write("\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t<div class=\"float-left\" style=\"width: 20%;\">\n");
      out.write("\t\t\t<p></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div align=\"center\" class=\"float-left\" style=\"width: 60%;\">\n");
      out.write("\t\t\t<table bordercolor=\"#000000\">\n");
      out.write("\t\t\t\t");

					for (int i = 0; i < contentList.size(); i++) {
						Content content = contentList.get(i);
				
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th width=\"300\" bgcolor=\"#B5B4FF\">\n");
      out.write("\t\t\t\t\t<p>作 成 者</p>\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t<th width=\"300\" bgcolor=\"#B5B4FF\" colspan=\"2\">\n");
      out.write("\t\t\t\t\t<p>作 成 日</p>\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th align=\"center\">");
      out.print(content.getId());
      out.write("&nbsp;&nbsp;&nbsp; ");

			 	if (!user.getId().equals(content.getId())
			 				&& followList.indexOf(content.getId()) == -1
			 				&& (Integer.parseInt(content.getAuthority()) > 1)
			 				&& !user.getAuthority().equals("1")) {
			 
      out.write("\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print(path);
      out.write("/followController\" method=\"post\"><input\n");
      out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"follow\" value=\"");
      out.print(content.getId());
      out.write("\" /> <input\n");
      out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"fCmd\" value=\"1\" /> <input type=\"submit\"\n");
      out.write("\t\t\t\t\t\tvalue=\"フォローする\" ;/></form>\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\n");
      out.write("\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t<th colspan=\"2\">");
      out.print(content.getDate());
      out.write("</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th bgcolor=\"#B5B4FF\">タイトル</th>\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" bgcolor=\"#DAD9FF\" >");
      out.print(content.getTitle());
      out.write("</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" align=\"center\">");
if(!content.getFilename().equals("")){ 
      out.write("\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print(path );
      out.write("/upload/");
      out.print( content.getFilename());
      out.write("\"><br>");
}
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.print(content.getContent() );
      out.write("\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t");

					if (user.getId().equals(content.getId())) {
				
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td align=\"center\" colspan=\"3\">\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t<div class=\"float-left w50\">\n");
      out.write("\t\t\t\t\t\t\t<form action=\"");
      out.print(path);
      out.write("/view/contentModi.jsp\" method=\"post\" ><input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" name=\"idx\" value=\"");
      out.print(content.getContentIdx());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"コンテンツ修正\"></form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"float-left w50\">\n");
      out.write("\t\t\t\t\t\t\t<form name=\"delete\" action=\"");
      out.print(path);
      out.write("/contentController\" method=\"post\" enctype=\"multipart/form-data\" onsubmit=\"return check()\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"idx\" value=\"");
      out.print(content.getContentIdx());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"cCmd\" value=\"3\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"コンテンツ削除\"></form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");

					}
						if (!user.getId().equals(content.getId())&&user.getAuthority().equals("1")) {
				
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan=\"3\" align=\"center\">\n");
      out.write("\t\t\t\t\t<form name=\"delete\" action=\"");
      out.print(path);
      out.write("/contentController\" method=\"post\" enctype=\"multipart/form-data\" onsubmit=\"return check()\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"idx\" value=\"");
      out.print(content.getContentIdx());
      out.write("\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"cCmd\" value=\"3\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"コンテンツ削除\"></form>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");

					}
						
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(user.getId() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(path );
      out.write("/comentController\" method=\"post\">\n");
      out.write("\t\t\t\t\t<textarea name=\"coment\" cols=\"55\"></textarea>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"contentIdx\" value=\"");
      out.print(content.getContentIdx() );
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(user.getId() );
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"cCmd\" value=\"1\"/>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" value=\"コメントを残す\"></td>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");

					for(int j=0; j<comentList.size(); j++){
					Coment coment = comentList.get(j);
					if(coment.getContentIdx().equals(content.getContentIdx())){
					
      out.write("\n");
      out.write("\t\t\t\t<tr align=\"center\">\n");
      out.write("\t\t\t\t\t<td width=\"20%\" bgcolor=\"#D6C7ED\">");
      out.print(coment.getId() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td width=\"60%\" bgcolor=\"#E8D9FF\">");
      out.print(coment.getContent() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td width=\"20%\" bgcolor=\"#D6C7ED\">");
      out.print(coment.getDate() );
      out.write("\n");
      out.write("\t\t\t\t");
if(user.getId().equals(coment.getId())){ 
      out.write("\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(path );
      out.write("/comentController\" method=\"post\">\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"contentIdx\" value=\"");
      out.print(content.getContentIdx() );
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(user.getId() );
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"coment\" value=\"");
      out.print(coment.getContent() );
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"cCmd\" value=\"2\"/>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"削除\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t");
	}
					}
					
      out.write("\n");
      out.write("\t\t\t\t\t<tr><td colspan=\"3\" bgcolor=\"#000000\"></td></tr>\n");
      out.write("\t\t\t\t\t");

					}
						
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"float-left\" style=\"width: 20%\">フォローしたユーザー ");

				for (int i = 0; i < followList.size(); i++) {
			
      out.write("\n");
      out.write("\t\t\t<p>");
      out.print(followList.get(i));
      out.write("</p>\n");
      out.write("\t\t\t");

				}
			
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
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
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
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
