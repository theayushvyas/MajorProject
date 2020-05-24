package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>LOGIN</title>\n");
      out.write("        \n");
      out.write("    </head>                                                                                                                                                                                                                                                                                                                                                                                                                                                      \n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body {\n");
      out.write("                background-image: url(abs.png);\n");
      out.write("                background-size:1600px 1800px; \n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-color : whitesmoke;\n");
      out.write("                }\n");
      out.write("            .form\n");
      out.write("              {\n");
      out.write("                font: bold 15px arial, sans-serif;\n");
      out.write("                width: 300px;\n");
      out.write("                padding: 10px; padding-bottom: 130px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%,-50%);\n");
      out.write("                border: outset;\n");
      out.write("                border-color: #00ffff;\n");
      out.write("              }\n");
      out.write("              \n");
      out.write("              ::placeholder {\n");
      out.write("                        color: white;\n");
      out.write("                        opacity: 1;\n");
      out.write("                      }\n");
      out.write("                   \n");
      out.write("            .form input[type =\"text\"] ,.form input[type =\"password\"]\n");
      out.write("            {\n");
      out.write("                border: 0;\n");
      out.write("                background: none;\n");
      out.write("                display: block;\n");
      out.write("                margin: 20px auto;\n");
      out.write("                text-align: center;\n");
      out.write("                border: 2px solid #3498db;\n");
      out.write("                padding: 14px 10px;\n");
      out.write("                width: 100px;\n");
      out.write("                outline: none;\n");
      out.write("                color: white;\n");
      out.write("                border-radius: 24px;\n");
      out.write("                transition: 0.25s;\n");
      out.write("            }\n");
      out.write("            .form input[type =\"text\"]:focus ,.form input[type =\"password\"]:focus\n");
      out.write("            {\n");
      out.write("                 width: 200px;\n");
      out.write("                 border-color: #2ecc72;\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("               .btn {\n");
      out.write("                background-color:black;\n");
      out.write("                color: white;\n");
      out.write("                width: 70px;\n");
      out.write("                height: 30px;\n");
      out.write("                font: bold 15px arial, sans-serif;\n");
      out.write("                border-radius: 25px;\n");
      out.write("                \n");
      out.write("                border: 2px solid #2ecc72;\n");
      out.write("                \n");
      out.write("               }\n");
      out.write("            \n");
      out.write("               .btn:hover{\n");
      out.write("                   background-color: #2ecc72;}\n");
      out.write("               .reg{\n");
      out.write("                   position: absolute;\n");
      out.write("                   bottom: 25%;\n");
      out.write("                   right: 46.5%;\n");
      out.write("                   width: 100px;\n");
      out.write("                   height: 100px;\n");
      out.write("               }   \n");
      out.write("               .newbtn\n");
      out.write("                {\n");
      out.write("                    background-color: #ccff00;\n");
      out.write("                    position: absolute;\n");
      out.write("                    bottom:140px;\n");
      out.write("                    left: 47%;\n");
      out.write("                    width: 100px;\n");
      out.write("                    height: 100px;\n");
      out.write("                    border: outset;\n");
      out.write("                }\n");
      out.write("                .newbtn:hover\n");
      out.write("                {\n");
      out.write("                    background: transparent;\n");
      out.write("                }\n");
      out.write("     </style>\n");
      out.write("     <script>\n");
      out.write("        \n");
      out.write("     </script>\n");
      out.write("         \n");
      out.write("         <div align =\"center\" />\n");
      out.write("         <h1 style=\"background-color: #ffb73c\">LOGIN</h1>\n");
      out.write("         <form class =\"form\" action=\"auth.jsp\" id=\"of\" >\n");
      out.write("            \n");
      out.write("            </br><input type=\"text\" name=\"User_Name\" value=\"\" name=\"U_N\" placeholder=\"User Name\"/>\n");
      out.write("        <input type=\"password\" name=\"Password\" value=\"\" placeholder=\"Password\" /> </br>\n");
      out.write("            </br><td><input type=\"submit\" value=\"Login\" class=\"btn\"/> \n");
      out.write("           &nbsp;&nbsp;&nbsp;<input type=\"reset\" value=\"Reset\" class=\"btn\"/></td></br></br>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("         <form class=\"form\" id=\"nef\" style=\"display:none;\" action=\"reg.jsp\">\n");
      out.write("             <input type=\"text\" name=\"EN\" placeholder=\"Enter Name\"/>Enter Name:\n");
      out.write("             <input type=\"text\" name=\"un\" placeholder=\"Enter UserName\"/>Enter UserName:\n");
      out.write("             <input type=\"Password\" name=\"pwd\" placeholder=\"Enter Password\"/>Enter Password:\n");
      out.write("             <input type=\"submit\" value=\"REGISTER\" />\n");
      out.write("        </form>\n");
      out.write("         \n");
      out.write("         <script>\n");
      out.write("             function dispon(){\n");
      out.write("                 document.getElementById('nef').style.display='block';\n");
      out.write("             }\n");
      out.write("             function dispof()\n");
      out.write("             {\n");
      out.write("                 document.getElementById('of').style.display='none';\n");
      out.write("             }\n");
      out.write("             function btnof()\n");
      out.write("             {\n");
      out.write("                 document.getElementById('bt').style.display='none';\n");
      out.write("             }\n");
      out.write("         </script>\n");
      out.write("         <button id=\"bt\" class=\"newbtn\" type=\"button\" onclick=\"dispon();dispof();btnof()\">SIGN UP!</button>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
