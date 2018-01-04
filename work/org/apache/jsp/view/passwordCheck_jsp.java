package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class passwordCheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

	String path = request.getContextPath();

      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=Windows-31J\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(path);
      out.write("/common/div.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- サーブレットから渡されたデータを取得する -->\n");
      out.write("\n");
      out.write("\t\t<title>会員登録</title>\n");
      out.write("\n");
      out.write("\t\t<!-- header, footerインクルード -->\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction validateForm(){\n");
      out.write("\t\t\tvar id = document.forms[\"join\"][\"id\"].value;\n");
      out.write("\t\t\tvar email = document.forms[\"join\"][\"email\"].value;\n");
      out.write("\n");
      out.write("\t\t\tif(id==\"\"){\n");
      out.write("\t\t\t\talert(\"ユーザー名を入力して下さい。\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tif(email==\"\"){\n");
      out.write("\t\t\t\talert(\"メールを入力して下さい。\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("\t</head>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t<div class=\"float-left w100\">\n");
      out.write("\t\t\t\t<h2 align=\"center\">パスワード探し</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<hr size=\"1\" color=\"#000000\"></hr>\n");
      out.write("\n");
      out.write("\t\t\t<h4 align=\"center\">登録したユーザー名と、メールアドレスを入力して下さい。</h4>\n");
      out.write("\t\t\t<h4 align=\"center\">パスワードは登録されているメールに伝送されます。</h4>\n");
      out.write("\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<div align=\"center\"><!-- 新規データの入力 -->\n");
      out.write("\t\t\t<form name=\"join\" action=\"");
      out.print(request.getContextPath());
      out.write("/sendPassword\"\n");
      out.write("\t\t\t\tmethod=\"post\" onsubmit=\"return validateForm()\">\n");
      out.write("\t\t\t<table align=\"center\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#B5B4FF\" width=\"150\">ユーザー名</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"id\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#9190FF\" width=\"150\">Email</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"email\" name=\"email\" /></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"uCmd\" value=\"1\" /> <input type=\"hidden\"\n");
      out.write("\t\t\t\tname=\"link\" value=\"1\" /> <input type=\"submit\" value=\"登録\" /> <input\n");
      out.write("\t\t\t\ttype=\"button\" onclick=\"location.href='");
      out.print(path);
      out.write("/start'\" value=\"戻る\" />\n");
      out.write("\t\t\t</form>\n");
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
      out.write("</html>");
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
