package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/common/header.jsp");
    _jspx_dependants.add("/common/adminMenu.jsp");
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=Windows-31J\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/common/div.css\"/>\r\n");
      out.write("<title>�R���e���c�ژ^</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\n");
      out.write("\t<style>\n");
      out.write("\t\t\t.header{\n");
      out.write("\t\t\t\tposition:fixed;\n");
      out.write("\t\t\t\ttop:0;\n");
      out.write("\t\t\t\tleft:8;\n");
      out.write("\t\t\t\tright:8;\n");
      out.write("\t\t\t\tbackground-color: #ffffff;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<h1 align=\"center\" >FreeWit</h1>\n");
      out.write("\t\t\t<hr size=\"4\" color=\"#000000\" />\n");
      out.write("\t\t</div>\n");
      out.write('\r');
      out.write('\n');
      out.write("\t\n");
      out.write("<style>\n");
      out.write(".menu{\n");
      out.write("\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<div style=\"float: left; position: fixed; margin-left: 50;\">\n");
      out.write("<ul>\n");
      out.write("\t<h2>�T�C�g�}�b�v</h2>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/admin.jsp\">�Ǘ��҃��j���[</a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/userInfo.jsp\">���[�U�Ǘ�</a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/content2.jsp\">�R���e���c�Ǘ�</a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/cmInsert.jsp\">�L���o�^</a></li>\n");
      out.write("\t<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/view/login.jsp\">���O�A�E�g</a></li>\n");
      out.write("\t<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("\t<h4>�e�X�^�[�l�̃A�J�E���g�ł��B</h4>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<h2 align=\"center\">�S�ẴR���e���c</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr color=\"#000000\"/>\r\n");
      out.write("\t<div class=\"clearfix\">\r\n");
      out.write("\t\t<div class=\"float-left\" style=\"width: 20%;\">\r\n");
      out.write("\t\t<p></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div align=\"center\" class=\"float-left\" style=\"width: 60%;\">\r\n");
      out.write("\t\t<table border=\"1px\" bordercolor=\"#000000\">\r\n");
      out.write("\t\t");
for(int i=0; i<10; i++){ 
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th width=\"300\" bgcolor=\"#6666ff\"><p>�� �� ��</p></th>\r\n");
      out.write("\t\t\t\t<th width=\"300\" bgcolor=\"#6666ff\"><p>�� �� ��</p></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th align=\"center\">�t�H���[���Ă��Ȃ����[�U�[&nbsp;&nbsp;&nbsp;&nbsp;</th>\r\n");
      out.write("\t\t\t\t<th>2017/12/14</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"2\" bgcolor=\"#6666ff\">�^�C�g��</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\">�R���e���c�^�C�g���ł��B</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><br/>�R���e���c�{���ł��B<br/><br/><br/><br/><br/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"button\" value=\"�폜\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"float-left\" style=\"width: 20%\">\r\n");
      out.write("\t\t<p>�t�H���[�������[�U�[�O</p>\r\n");
      out.write("\t\t<p>�t�H���[�������[�U�[�P</p>\r\n");
      out.write("\t\t<p>�t�H���[�������[�U�[�Q</p>\r\n");
      out.write("\t\t<p>�t�H���[�������[�U�[�R</p>\r\n");
      out.write("\t\t<p>�t�H���[�������[�U�[�S</p>\r\n");
      out.write("\t\t<p>�t�H���[�������[�U�[�T</p>\r\n");
      out.write("\t\t<p>�t�H���[�������[�U�[�U</p>\r\n");
      out.write("\t\t<p>�t�H���[�������[�U�[�V</p>\r\n");
      out.write("\t\t<p>�t�H���[�������[�U�[�W</p>\r\n");
      out.write("\t\t<p>�t�H���[�������[�U�[�X</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\t.footer{\n");
      out.write("\t\t\t\tposition:fixed;\n");
      out.write("\t\t\t\tleft:8;\n");
      out.write("\t\t\t\tright:8;\n");
      out.write("\t\t\t\tbottom:0;\n");
      out.write("\t\t\t\tbackground-color: #ffffff;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<hr size=\"4\" color=\"#000000\" />\n");
      out.write("\t\t\tCopyright(C)2017 All Right Reserved.\n");
      out.write("\t\t</div>");
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
