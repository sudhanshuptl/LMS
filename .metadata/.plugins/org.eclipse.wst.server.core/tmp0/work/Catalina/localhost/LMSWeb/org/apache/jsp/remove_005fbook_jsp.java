/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2016-11-24 19:45:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.virtusa.project.services.admin.AdminServices;

public final class remove_005fbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Admin Service</title>\r\n");
      out.write("<link\r\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table>\r\n");
      out.write("<th> <a href=\"add_user.jsp\">Add User</a><br/></th>\r\n");
      out.write("<th> <a href=\"update_member_by_id.jsp\">Update User Details</a><br/></th>\r\n");
      out.write("<th> <a href=\"remove_user.jsp\">Remove User</a><br/></th>\r\n");
      out.write("<th> <a href=\"display_user.jsp\">Display User Details</a><br/></th>\r\n");
      out.write("<th> <a href=\"add_book.jsp\">Add Book</a><br/></th>\r\n");
      out.write("<th> <a href=\"update_book_by_id.jsp\">Update Book Details</a><br/></th>\r\n");
      out.write("<th> <a href=\"remove_book.jsp\">Remove Book</a><br/></th>\r\n");
      out.write("<th> <a href=\"display_book.jsp\">Display Book Details</a><br/></th>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t<h1>\r\n");
      out.write("\t\t<font color=\"#FF00FF\" size=\"100\">Library Management System</font>\r\n");
      out.write("\t</h1>\r\n");
      out.write("\t<div class=\"form\">\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"tab-group\">\r\n");
      out.write("\t\t\t<li class=\"tab active\"><a href=\"#signup\">Remove Book</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"tab-content\">\r\n");
      out.write("\t\t\t<div id=\"signup\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"remove_book.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"field-wrap\">\r\n");
      out.write("\t\t\t\t\t\t<label> Book ID<span class=\"req\" name=\"name\">*</span>\r\n");
      out.write("\t\t\t\t\t\t</label> <input type=\"number\" name=\"bookId\" required autocomplete=\"off\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--<p class=\"forgot\"><a href=\"#\">Forgot Password?</a></p>-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"button button-block\" />\r\n");
      out.write("\t\t\t\t\tRemove Book\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- tab-content -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /form -->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/index.js\"></script>\r\n");
      out.write("\t");

		if (request.getParameter("bookId") != null) {
			String bookId = request.getParameter("bookId");
			AdminServices adminServices = new AdminServices();
			adminServices.removeBook(Integer.parseInt(bookId));
		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!-- pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" -->");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
