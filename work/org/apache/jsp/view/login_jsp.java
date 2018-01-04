package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import dto.Content;
import dto.Coment;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/common/header.jsp");
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
	ArrayList<Content> contentList = (ArrayList<Content>) request
			.getAttribute("contentList");
	ArrayList<Coment> comentList = (ArrayList<Coment>) request.getAttribute("comentList");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=Windows-31J\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/common/div.css\" />\r\n");
      out.write("\t\t<title>ログイン</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction validationForm(){\r\n");
      out.write("\t\tvar id = document.forms[\"login\"][\"id\"].value;\r\n");
      out.write("\t\tvar password = document.forms[\"login\"][\"password\"].value;\r\n");
      out.write("\r\n");
      out.write("\t\tif(id==\"\"){\r\n");
      out.write("\t\t\talert(\"ユーザー名を入力して下さい。\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\tif(password==\"\"){\r\n");
      out.write("\t\t\talert(\"パスワードを入力して下さい。\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
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
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t<div class=\"float-left w100\">\r\n");
      out.write("\t\t\t\t\t<h2 align=\"center\">ログイン</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr size=\"1\" color=\"#000000\"></hr>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div style=\"width: 60%; margin: 0 auto;\" align=\"center\"><!-- 新規データの入力 -->\r\n");
      out.write("\t\t\t\t<form name=\"login\" action=\"");
      out.print(request.getContextPath());
      out.write("/login\" method=\"post\" onsubmit=\"return validationForm()\">\r\n");
      out.write("\t\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#B5B4FF\" width=\"100\">ユーザー名</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"id\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#B5B4FF\" width=\"100\"\">パスワード</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(path);
      out.write("/view/join.jsp\">新規会員登録はこちらへ</a><br />\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(path);
      out.write("/view/passwordCheck.jsp\">パスワードを忘れた方</a><br />\r\n");
      out.write("\t\t\t\t\t<input class=\"btn-info\" type=\"submit\" value=\"ログイン\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<table class=\"table\" bordercolor=\"#000000\">\r\n");
      out.write("\t\t\t\t\t");

						for (int i = 0; i < contentList.size(); i++) {
							Content content = contentList.get(i);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"300\" bgcolor=\"#B5B4FF\">\r\n");
      out.write("\t\t\t\t\t\t<p>作 成 者</p>\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"300\" bgcolor=\"#B5B4FF\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<p>作 成 日</p>\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th align=\"center\">");
      out.print(content.getId());
      out.write("&nbsp;&nbsp;&nbsp;</th>\r\n");
      out.write("\t\t\t\t\t\t<th colspan=\"2\">");
      out.print(content.getDate());
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th bgcolor=\"#B5B4FF\">タイトル</th>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" bgcolor=\"#DAD9FF\">");
      out.print(content.getTitle());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\" align=\"center\">");
if(!content.getFilename().equals("")){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print(path );
      out.write("/upload/");
      out.print( content.getFilename());
      out.write("\"><br>");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print(content.getContent() );
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
for(int j=0; j<comentList.size(); j++){
					Coment coment = comentList.get(j);
					if(coment.getContentIdx().equals(content.getContentIdx())){
					
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"20%\" bgcolor=\"#D6C7ED\">");
      out.print(coment.getId() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"60%\" bgcolor=\"#E8D9FF\">");
      out.print(coment.getContent() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"20%\" bgcolor=\"#D6C7ED\">");
      out.print(coment.getDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
	}
					}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
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
      out.write("</div>\r\n");
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
