package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Get Registered </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 String fn = request.getParameter("EN");
           String user= request.getParameter("un");
           String pass=request.getParameter("pwd");
            Connection con =null;
            PreparedStatement pst= null;
            try
            { 
              Class.forName("com.mysql.jdbc.Driver");
       //       String url ="jdbc:mysql://localhost:3306/ayush";
              String url ="jdbc:mysql://localhost:3306/ayush";
              String un="avyas";
              String pwd="avyas";
              con=(Connection)DriverManager.getConnection(url,user,pass);
             String q="insert into login (Name , User_name , Password) values('"+fn+"','"+user+"','"+pass+"')";
             pst=con.prepareStatement(q); 
             pst.executeUpdate(q);
            
      out.write("\n");
      out.write("            <script>\n");
      out.write("\n");
      out.write("                window.alert(\"Registered Successfully !!\");\n");
      out.write("                </script>\n");
      out.write("            \n");
      out.write("            ");

                response.sendRedirect("login.jsp");
                con.close();
             }
            catch(Exception e)
            {
                out.println(e.getMessage());
                out.println("Error in catch");
            }
            
        
      out.write("\n");
      out.write("    </body>\n");
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
