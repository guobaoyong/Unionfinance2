/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-09 08:14:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=”renderer” content=”Webkit”>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=”renderer” content=”webkit|ie-comp|ie-stand”>\r\n");
      out.write("<title>登录界面</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("css/index-one.css\">\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("img/top.ico\" type=\"image/x-icon\"/>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write(" \t\tfunction reloadCode(){\r\n");
      out.write(" \t\t\tvar time=new Date().getTime();\r\n");
      out.write("\t\t\tdocument.getElementById(\"imagecode\").src=\"verifyCode?d=\"+time;\r\n");
      out.write(" \t}\r\n");
      out.write(" \t\tfunction relog(){\r\n");
      out.write(" \t\tvar meg = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMeg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write(" \t\t\tif(meg != '' && meg != null)\r\n");
      out.write(" \t\t\t\talert(meg);\r\n");
      out.write(" \t\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"relog();\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <p>河南科技学院工会财务管理系统</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"body\">\r\n");
      out.write("        <div class=\"box\">\r\n");
      out.write("            <div class=\"input-two\">\r\n");
      out.write("            \t\r\n");
      out.write("                <form class=\"form-inline\" id=\"form\" method=\"post\" action=\"loginAction\">\r\n");
      out.write("                    <div class=\"label-two\">\r\n");
      out.write("                        <label for=\"account\" >账&nbsp;&nbsp;&nbsp;&nbsp;号</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\"  placeholder=\"请输入用户名\" name=\"user.account\">\r\n");
      out.write("                    </div> \r\n");
      out.write("                    <div class=\"label-two\">\r\n");
      out.write("                        <label for=\"password\" >密&nbsp;&nbsp;&nbsp;&nbsp;码</label>\r\n");
      out.write("                        <input type=\"password\" class=\"form-control\"  placeholder=\"请输入密码\" name=\"user.password\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"label-two\">\r\n");
      out.write("                        <label for=\"password\">验证码</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control yan\"  placeholder=\"输入验证码\" name=\"randStr\" style=\"width:30%\">\r\n");
      out.write("                        <img border=0 src=\"verifyCode\" id=\"imagecode\" onclick=\"reloadCode()\" class=\"image1\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"input-four\">\r\n");
      out.write("                <button class=\"btn  btn-primary one\" form=\"form\" type=\"submit\">登&nbsp;&nbsp;录</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<ul class=\"bg-bubbles\">\r\n");
      out.write("    <li></li>\r\n");
      out.write("    <li></li>\r\n");
      out.write("    <li></li>\r\n");
      out.write("    <li></li>\r\n");
      out.write("    <li></li>\r\n");
      out.write("    <li></li>\r\n");
      out.write("    <li></li>\r\n");
      out.write("    <li></li>\r\n");
      out.write("    <li></li>\r\n");
      out.write("    <li></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("js/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rootPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("js/bootstrap.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
