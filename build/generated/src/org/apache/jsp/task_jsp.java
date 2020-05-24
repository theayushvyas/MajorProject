package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class task_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pending</title>\n");
      out.write("    </head>\n");
      out.write("        <div align =\"center\" />\n");
      out.write("        <h1 style=\"background-color: yellow;\">TASKS PENDING</h1>\n");
      out.write("        <h2>TASKS &nbsp &nbsp &nbsp &nbsp TARGET</h2>\n");
      out.write("        ");
  
            
            
             Connection con = null;
                 Statement st = null;
                 try {
                     Class.forName("com.mysql.jdbc.Driver");
                     String url = "jdbc:mysql://localhost:3306/ayush?autoReconnect=true&useSSL=false?autoReconnect=true&useSSL=false";
                     String un = "avyas";
                     String pwd = "avyas";
                     con = (Connection)DriverManager.getConnection(url, un, pwd);
                     st = con.createStatement();
                     String q = "select * from Tasknew";
                     ResultSet rs = st.executeQuery(q);
                     while(rs.next()) {
                       response.sendRedirect("task.jsp");

      out.write("     \n");
      out.write("                <th><input type=\"button\" value=\"");
      out.print(rs.getString("dt"));
      out.write("\" class=\"th\" ></th></br>\n");
      out.write("                </br><td><input type=\"text\" value=\"");
      out.print(rs.getString("task"));
      out.write("\" class=\"td\"></td>\n");
      out.write("                </br><td><input type=\"text\" value=\"");
      out.print(rs.getString("Name"));
      out.write("\" class=\"td\"></td>\n");
      out.write("                <td>&nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp; <input type=\"text\" placeholder=\"");
      out.print(rs.getString("target_date"));
      out.write("\" class=\"td\"></td>\n");
      out.write("            <button onclick=\"window.location.href='ins.jsp';\" class='at'>Add New Task</button>\n");
      out.write("        </tr></br>    \n");
      out.write("        \n");
      out.write("            ");
    
                     } 

                     con.close();

                 } catch (Exception e) {
                     out.println(e.getMessage());
                     out.println("Error in catch");
                 }
        
        
      out.write("\n");
      out.write("    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
