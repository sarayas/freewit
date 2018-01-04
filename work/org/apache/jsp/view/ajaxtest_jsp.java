package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import dto.Content;
import dto.User;
import dto.Coment;

public final class ajaxtest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      out.write("\t<form action=\"\">\n");
      out.write("\t<select name=\"customers\" onchange=\"showCustomer(this.value)\">\n");
      out.write("\t<option value=\"\">Select a customer:</option>\n");
      out.write("\t<option value=\"sarayas\">sarayas</option>\n");
      out.write("\t<option value=\"sarayaszero \">sarayaszero</option>\n");
      out.write("\t<option value=\"admin\">admin</option>\n");
      out.write("\t</select>\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("\t<div id=\"txtHint\">Customer info will be listed here...</div>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction showCustomer(str) {\n");
      out.write("\t\t  var xhttp;\n");
      out.write("\t\t  if (str == \"\") {\n");
      out.write("\t\t    document.getElementById(\"txtHint\").innerHTML = \"\";\n");
      out.write("\t\t    return;\n");
      out.write("\t\t  }\n");
      out.write("\t\t  xhttp = new XMLHttpRequest();\n");
      out.write("\t\t  xhttp.onreadystatechange = function() {\n");
      out.write("\t\t    if (this.readyState == 4 && this.status == 200) {\n");
      out.write("\t\t      document.getElementById(\"txtHint\").innerHTML = this.responseText;\n");
      out.write("\t\t    }\n");
      out.write("\t\t  };\n");
      out.write("\t\t  xhttp.open(\"GET\", \"/freewit/start\", true);\n");
      out.write("\t\t  xhttp.send();\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
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
