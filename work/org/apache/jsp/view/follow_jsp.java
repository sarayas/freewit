package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import dto.User;

public final class follow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
ArrayList<String> followList = (ArrayList<String>)session.getAttribute("followList");
User user = (User)session.getAttribute("user");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=Windows-31J\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/common/div.css\"/>\r\n");
      out.write("<title>フォロー管理</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);\">\r\n");
      out.write("\t");
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
      out.write('\r');
      out.write('\n');
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
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<h2 align=\"center\">フォロー管理</h2>\r\n");
      out.write("<hr color=\"#000000\"/>\r\n");
      out.write("\t<div class=\"clearfix\">\r\n");
      out.write("\t\t<div class=\"float-left\" style=\"width: 20%;\">\r\n");
      out.write("\t\t<p></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div align=\"center\" class=\"float-left\" style=\"width: 60%;\">\r\n");
      out.write("\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t");
for(int i=0; i<followList.size(); i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#B5B4FF\" width=\"200\">");
      out.print(followList.get(i));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td><form action=\"");
      out.print(path );
      out.write("/followController\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"follow\" value=\"");
      out.print(followList.get(i) );
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"fCmd\" value=\"2\"/>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"フォロー解除\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"float-left\" style=\"width: 20%\">\r\n");
      out.write("\t\tフォローしたユーザーA\r\n");
      out.write("\t\t");
for(int i=0; i<followList.size(); i++){ 
      out.write("\r\n");
      out.write("\t\t<p>");
      out.print(followList.get(i) );
      out.write("</p>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("</body>\r\n");
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
