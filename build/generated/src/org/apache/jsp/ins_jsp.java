package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("          <meta charset=\"utf-8\">\n");
      out.write("            <title>Current Weather</title>\n");
      out.write("            <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,900\" rel=\"stylesheet\">\n");
      out.write("       \n");
      out.write("    <!--  <button onclick=\"bag()\" class=\"bgt\">DarkMode</button> -->\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("        /*    body {  \n");
      out.write("                 background-color: smokewhite;\n");
      out.write("                 font:15px arial white, sans-serif;\n");
      out.write("                 font-weight: bolder;\n");
      out.write("                \n");
      out.write("                } */\n");
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
      out.write("                  .date\n");
      out.write("                  {\n");
      out.write("                      left:15%;\n");
      out.write("                  }\n");
      out.write("                  .form {\n");
      out.write("                      background : #99ffff ;\n");
      out.write("                      color: black;\n");
      out.write("                      height: 0px;\n");
      out.write("                      position: absolute;\n");
      out.write("                      top: 20%;\n");
      out.write("                      right: 1.5%;\n");
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
      out.write("                 }\n");
      out.write("                  @keyframes font {\n");
      out.write("                 0%{font-size:2em;}\n");
      out.write("                 0%{font-size:8em ; left:40%;}\n");
      out.write("                 100%{font-size:2em ;l}\n");
      out.write("                }\n");
      out.write("                .newbtn\n");
      out.write("                {\n");
      out.write("                    position: absolute;\n");
      out.write("                    bottom:60px;\n");
      out.write("                    top: 65%;\n");
      out.write("                    right: 11%;\n");
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
      out.write("                              .find{\n");
      out.write("                                  position:absolute;\n");
      out.write("                                  left: 50%;\n");
      out.write("                                  top: 30%;\n");
      out.write("                                  width: 150px;\n");
      out.write("                                  height: 50px;\n");
      out.write("                                      \n");
      out.write("                              }\n");
      out.write("               \n");
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
      out.write("              <h2>PLAN </h2>\n");
      out.write("     \n");
      out.write("                       <input type=\"text\" name =\"t1\" value=\"\" class=\"tf\">\n");
      out.write("                       </br> </br>                \n");
      out.write("                       Date: <input type=\"date\" name=\"t2\" class=\"date\"> \n");
      out.write("                       </br> </br>\n");
      out.write("                    <br/>  <input type=\"submit\" class =\"button\" value=\"SUBMIT\" >\n");
      out.write("             <br/>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("          <button onclick=\"window.location.href = 'iframe.html';\" class=\"newbtn\">TASKS</button>\n");
      out.write("          <button  onclick=\"window.location.href = 'login.jsp';\" class=\"logout\">Logout</button>\n");
      out.write("         ");
 String u = (String)session.getAttribute("user");
          
      out.write("\n");
      out.write("         ");
      out.print( u );
      out.write("\n");
      out.write("         <script>\n");
      out.write("             \n");
      out.write("        function bag()\n");
      out.write("        {\n");
      out.write("            var element=document.body;\n");
      out.write("            element.classList.toggle(\"Darkbg\");\n");
      out.write("        }\n");
      out.write("      </script>\n");
      out.write("       <div>\n");
      out.write("    <form action=\"#\" class=\"a2\">\n");
      out.write("      <label for=\"lname\">Enter city:</label>\n");
      out.write("      <input type=\"text\" id=\"lname\" name=\"lname\">\n");
      out.write("    <button id=\"sub\" onClick=\"load()\" class=\"button\">Submit</button>\n");
      out.write("     </form>\n");
      out.write("           <script type=\"text/javascript\">\n");
      out.write("                    const key = '8118ed6ee68db2debfaaa5a44c832918';\n");
      out.write("              if(key=='') document.getElementById('temp').innerHTML = ('Remember to add your api key!');\n");
      out.write("\n");
      out.write("              // api.openweathermap.org/data/2.5/weather?q={city name}&appid={your api key}\n");
      out.write("\n");
      out.write("              function weatherBallon( city ) {\n");
      out.write("                fetch('https://api.openweathermap.org/data/2.5/weather?q=' + city+ '&appid=' + key +'&cnt = 5')  \n");
      out.write("                .then(function(resp) { return resp.json() }) // Convert data to json\n");
      out.write("                .then(function(data) {\n");
      out.write("                  drawWeather(data);\n");
      out.write("                })\n");
      out.write("                .catch(function() {\n");
      out.write("                  // catch any errors\n");
      out.write("                });\n");
      out.write("              }\n");
      out.write("              function drawWeather( d ) {\n");
      out.write("                var celcius = Math.round(parseFloat(d.main.temp)-273.15);\n");
      out.write("                var fahrenheit = Math.round(((parseFloat(d.main.temp)-273.15)*1.8)+32);\n");
      out.write("                var description = d.weather[0].description; \n");
      out.write("\n");
      out.write("                document.getElementById('description').innerHTML = description;\n");
      out.write("                document.getElementById('temp').innerHTML = celcius + '&deg;';\n");
      out.write("                document.getElementById('location').innerHTML = d.name;\n");
      out.write("\n");
      out.write("                if( description.indexOf('rain') > 0 ) {\n");
      out.write("                  document.body.className = 'rainy';\n");
      out.write("                } else if( description.indexOf('cloud') > 0 ) {\n");
      out.write("                  document.body.className = 'cloudy';\n");
      out.write("                } else if( description.indexOf('sunny') > 0 ) {\n");
      out.write("                  document.body.className = 'sunny';\n");
      out.write("                } else {\n");
      out.write("                  document.body.className = 'clear';\n");
      out.write("                }\n");
      out.write("              }\n");
      out.write("              // window.onload = function() {\n");
      out.write("              //  weatherBallon( 'agra' );\n");
      out.write("              // }\n");
      out.write("\n");
      out.write("              document.getElementById(\"sub\").addEventListener(\"click\", function(event){\n");
      out.write("                event.preventDefault()\n");
      out.write("              });\n");
      out.write("\n");
      out.write("\n");
      out.write("              function load() {\n");
      out.write("                var x = document.getElementById(\"lname\").value;\n");
      out.write("                console.log(x);\n");
      out.write("                weatherBallon(x);\n");
      out.write("              }\n");
      out.write("</script>\n");
      out.write("\t<div>\n");
      out.write("    <div class=\"a1\">\n");
      out.write("      <div id=\"description\"></div>\n");
      out.write("      <h2 id=\"temp\" ></h2>\n");
      out.write("      <div id=\"location\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("       </div>\n");
      out.write("         <style type=\"text/css\">\n");
      out.write("                    body {\n");
      out.write("                   font-family: 'Montserrat', sans-serif;\n");
      out.write("                   font-weight: 400;\n");
      out.write("                   color: #fff;\n");
      out.write("                   display: flex;\n");
      out.write("                   align-items: center;\n");
      out.write("                   justify-content: center;\n");
      out.write("                   text-shadow: .1em .1em 0 rgba(0,0,0,0.3);\n");
      out.write("                   font-size: 1.3em;\n");
      out.write("                   height: 100vh;\n");
      out.write("                   background-image: linear-gradient(to right top, #99bbcb, #a5c7d7, #b1d4e2, #bde0ee, #c9edfa);\n");
      out.write("              }\n");
      out.write("               h2 {\n");
      out.write("                   margin: 0 auto;\n");
      out.write("                   font-size: 2.2em;\n");
      out.write("                   text-align: center;\n");
      out.write("                   color: #fff;\n");
      out.write("                   font-size: 2em;\n");
      out.write("               }\n");
      out.write("               body.sunny {\n");
      out.write("                   background-image: linear-gradient(to right top, #ff4e50, #ff713e, #ff932b, #ffb41d, #f9d423);\n");
      out.write("               }\n");
      out.write("               body.cloudy {\n");
      out.write("                   background-image: linear-gradient(to right top, #63747c, #71858e, #7f96a0, #8da8b2, #9bbac5);\n");
      out.write("               }\n");
      out.write("               body.rainy {\n");
      out.write("                   background-image: linear-gradient(to right top, #637c7b, #718e8c, #7ea09e, #8db2b0, #9bc5c3);\n");
      out.write("               }\n");
      out.write("                  </style>\n");
      out.write("                  \n");
      out.write("                   <div id=\"covid\">\n");
      out.write("  \t <label for=\"div\">Corona Virus Cases In INDIA LIVE:</label>\n");
      out.write("  </br>\n");
      out.write("  \t  Total Cases:<div id=\"Total\"></div>\n");
      out.write("      Total Recovered<div id=\"Recovered\"></div>\n");
      out.write("      Total New Cases Today<div id=\"New\"></div>\n");
      out.write("      Total Deaths<div id=\"death\"></div>\n");
      out.write("    </div>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("  \tfunction cases() {\n");
      out.write("            fetch('https://api.thevirustracker.com/free-api?countryTotal=IN')  \n");
      out.write("            .then(function(resp) { return resp.json() }) // Convert data to json\n");
      out.write("            .then(function(data) {\n");
      out.write("              drawCases(data);\n");
      out.write("            })\n");
      out.write("            .catch(function() {\n");
      out.write("              // catch any errors\n");
      out.write("            });\n");
      out.write("          }\n");
      out.write("          window.onload = function() {\n");
      out.write("              cases();\n");
      out.write("          }\n");
      out.write("            function drawCases(d)\n");
      out.write("            {\n");
      out.write("                  var totalc = d.countrydata[0].total_cases;\n");
      out.write("                  var R = d.countrydata[0].total_recovered;\n");
      out.write("                  var newC = d.countrydata[0].total_new_cases_today;\n");
      out.write("                  var death = d.countrydata[0].total_deaths;\n");
      out.write("              document.getElementById('Total').innerHTML = totalc;\n");
      out.write("              document.getElementById('Recovered').innerHTML = R;\n");
      out.write("              document.getElementById('New').innerHTML = newC;\n");
      out.write("              document.getElementById('death').innerHTML = death;\n");
      out.write("              console.log(totalc);\n");
      out.write("          }\n");
      out.write("</script>\n");
      out.write("        </body>\n");
      out.write("        </html>\n");
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
