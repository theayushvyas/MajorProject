package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ins_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>WELCOME</title>\n");
      out.write("       \n");
      out.write("    <button onclick=\"bag()\" class=\"bgt\">DarkMode</button>\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("            body {  \n");
      out.write("                background-image: url(\"do.png\");  \n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position: bottom-right;\n");
      out.write("                 background-size: 1400px 700px ;\n");
      out.write("                 background-color: smokewhite;\n");
      out.write("                 font:15px arial white, sans-serif;\n");
      out.write("                 font-weight: bolder;\n");
      out.write("                \n");
      out.write("                }\n");
      out.write("                .button {\n");
      out.write("                    background: #0066A2;\n");
      out.write("                    color: white;\n");
      out.write("                    border-style: outset;\n");
      out.write("                    border-color: #0066A2;\n");
      out.write("                    height: 30px;\n");
      out.write("                    width: 200px;\n");
      out.write("                    align-items: center;\n");
      out.write("                    font: bold 15px arial, sans-serif;\n");
      out.write("                    text-shadow:none;\n");
      out.write("                    transition: width 2s, height 2s;\n");
      out.write("                    }\n");
      out.write("                           \n");
      out.write("                    .button:hover {\n");
      out.write("                    width: 120px;\n");
      out.write("                    height: 40px;\n");
      out.write("                    background: lightgreen;\n");
      out.write("                    font : bold 20px arial ,sans-serif;\n");
      out.write("                    transition-duration: 1s;\n");
      out.write("                    }\n");
      out.write("                  \n");
      out.write("                \n");
      out.write("                  .tf {\n");
      out.write("                      background: yellow;\n");
      out.write("                      color: black;\n");
      out.write("                      border-style: outset;\n");
      out.write("                      border-color: #0066A2;\n");
      out.write("                      border-radius: 24px 0 24px 0;\n");
      out.write("                      height: 100px;\n");
      out.write("                      width: 100px;\n");
      out.write("                      font: bold 15px arial, sans-serif;\n");
      out.write("                      text-shadow:none;\n");
      out.write("                      opacity: 0.7;\n");
      out.write("                      \n");
      out.write("                  }\n");
      out.write("                  .tf:focus {\n");
      out.write("                      height: 200px;\n");
      out.write("                      width: 200px;\n");
      out.write("                  }\n");
      out.write("                  .form {\n");
      out.write("                      background : #99ffff ;\n");
      out.write("                      color: black;\n");
      out.write("                      height: 0px;\n");
      out.write("                      position: absolute;\n");
      out.write("                      top: 30%;\n");
      out.write("                      left: 50%;\n");
      out.write("                      transform: translate(-50%,-50%);\n");
      out.write("                      font: bold 15px arial, sans-serif;\n");
      out.write("                      text-shadow:none;\n");
      out.write("                  }\n");
      out.write("                  h1{\n");
      out.write("                      color:black;\n");
      out.write("                      text-transform:uppercase;\n");
      out.write("                      font-size: 2em;\n");
      out.write("                      font-family: 'Bangers',cursive;\n");
      out.write("                      left: 40%;\n");
      out.write("                      top: 20%;\n");
      out.write("                      background:#ffb73c;\n");
      out.write("                      animation: font 5s 1;\n");
      out.write("                      \n");
      out.write("                      \n");
      out.write("                  }\n");
      out.write("                  @keyframes font {\n");
      out.write("                 0%{font-size:2em;}\n");
      out.write("                 0%{font-size:8em ; left:40%;}\n");
      out.write("                 100%{font-size:2em ;l}\n");
      out.write("                }\n");
      out.write("                .newbtn\n");
      out.write("                {\n");
      out.write("                    position: absolute;\n");
      out.write("                    bottom:60px;\n");
      out.write("                    left: 45%;\n");
      out.write("                    background-image: url(\"tp.png\");\n");
      out.write("                    width: 100px;\n");
      out.write("                    height: 100px;\n");
      out.write("                    border: outset;\n");
      out.write("                }\n");
      out.write("                .newbtn:hover\n");
      out.write("                {\n");
      out.write("                    background: transparent;\n");
      out.write("                }\n");
      out.write("             \n");
      out.write("                .logout\n");
      out.write("                {\n");
      out.write("                    position: absolute;\n");
      out.write("                    right: 30px;\n");
      out.write("                    top: 20px;\n");
      out.write("                    background: lightblue;\n");
      out.write("                    width: 80px;\n");
      out.write("                    height: 46px;\n");
      out.write("                    font: bold 15px arial,sans-serif;\n");
      out.write("                }\n");
      out.write("                .logout:hover{\n");
      out.write("                    background: lightcoral;\n");
      out.write("                }\n");
      out.write("                .bgt\n");
      out.write("                {\n");
      out.write("                    position: absolute;\n");
      out.write("                    left: 30px;\n");
      out.write("                    top: 20px;\n");
      out.write("                    background: lightblue;\n");
      out.write("                    width: 90px;\n");
      out.write("                    height: 46px;\n");
      out.write("                    font: bold 15px arial,sans-serif;\n");
      out.write("                }\n");
      out.write("                  .Darkbg {\n");
      out.write("                      background-color:#333333;\n");
      out.write("                              color: #ccff00;\n");
      out.write("                              }\n");
      out.write("                \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("         </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body> \n");
      out.write("        <div align =\"center\" />\n");
      out.write("        <h1> WELCOME </h1>\n");
      out.write("        \n");
      out.write("          <form action=\"sql.jsp\" class =\"form\" >\n");
      out.write("              \n");
      out.write("     \n");
      out.write("                       <input type=\"text\" name =\"t1\" value=\"\" class=\"tf\">\n");
      out.write("                       </br> </br>                \n");
      out.write("                       Add Target Date: <input type=\"date\" name=\"t2\"> \n");
      out.write("                       </br> </br>\n");
      out.write("                    <br/>  <input type=\"submit\" class =\"button\" value=\"SUBMIT\" >\n");
      out.write("                   \n");
      out.write("                     \n");
      out.write("           <br/>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("        </form>\n");
      out.write("          <button onclick=\"window.location.href = 'iframe.html';\" class=\"newbtn\">TASKS</button>\n");
      out.write("          <button  onclick=\"window.location.href = 'login.jsp';\" class=\"logout\">Logout</button>\n");
      out.write("         ");
 String u = (String)session.getAttribute("user");
          
      out.write("\n");
      out.write("         ");
      out.print( u );
      out.write("\n");
      out.write("          <script>\n");
      out.write("        function bag()\n");
      out.write("        {\n");
      out.write("            var element=document.body;\n");
      out.write("            element.classList.toggle(\"Darkbg\");\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    \n");
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
