package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class w_005ftest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"jumbotron\">\n");
      out.write("\n");
      out.write("\t<p>\n");
      out.write("\t\tThis application uses <a href=\"http://developer.yahoo.com/weather/\" target=\"_blank\">Yahoo weather Rest API</a> to retrieve current weather in some US state / city. Database is limited, but it's not the point of this demo.\n");
      out.write("\t\tThis project is to showcase Spring Boot, Spring Data JPA, REST web. services (XML and JSON) and Spring Cache.\n");
      out.write("\t</p>\n");
      out.write("\t<br />\n");
      out.write("\n");
      out.write("\t<form action=\"\" method=\"post\" id=\"formular\" class=\"form-horizontal\">\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label class=\"col-md-3 control-label\">What's the weather in:</label>\n");
      out.write("\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"city\" id=\"city\" class=\"form-control\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-1\">\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"btn btn-md btn-primary\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\t\n");
      out.write("<script>\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$(\"#formular\").submit(function(event) {\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\tvar city = $(\"#city\").val();\n");
      out.write("\t\t\t$.getJSON(\"weather.json?city=\" + city, function(data) {\n");
      out.write("\t\t\t\tvar weather = \"<h1>\" + data.channel.description + \":</h1>\";\n");
      out.write("\t\t\t\t$.each(data.channel.item.forecasts, function(key, value) {\n");
      out.write("\t\t\t\t\tweather += value.date + \": low: \" + value.low + \", high: \" + value.high;\n");
      out.write("\t\t\t\t\t// this is not the full list, but it's what's mostly used\n");
      out.write("\t\t\t\t\tif(value.text.indexOf(\"Sunny\") != -1 || value.text.indexOf(\"Clear\") != -1) {\n");
      out.write("\t\t\t\t\t\tweather += \"<img src='resources/img/sunny.png' />\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse if(value.text.indexOf(\"Cloud\") != -1) {\n");
      out.write("\t\t\t\t\t\tweather += \"<img src='resources/img/cloudy.png' />\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse if(value.text.indexOf(\"Snow\") != -1) {\n");
      out.write("\t\t\t\t\t\tweather += \"<img src='resources/img/snow.png' />\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse if(value.text.indexOf(\"Thunder\") != -1) {\n");
      out.write("\t\t\t\t\t\tweather += \"<img src='resources/img/thunder.png' />\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse if(value.text.indexOf(\"Showers\") != -1 || value.text.indexOf(\"Rain\") != -1) {\n");
      out.write("\t\t\t\t\t\tweather += \"<img src='resources/img/rain.png' />\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse {\n");
      out.write("\t\t\t\t\t\tweather += \", \" + value.text;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tweather += \"<br>\";\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#result\").html(weather);\n");
      out.write("\t\t\t}).fail(function() {\n");
      out.write("\t\t\t    $(\"#result\").html('<p>Sorry, no such US state / city in a database. Try: \"Washington\", \"Alaska\", \"California\", \"Florida\"</p>');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div id=\"result\" class=\"jumbotron\">\n");
      out.write("\t<p>Tip: Try one of these states: \"Washington\", \"Alaska\", \"California\", \"Florida\".</p>\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/footer.jsp", out, false);
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
