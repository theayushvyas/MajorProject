<%-- 
    Document   : sql
    Created on : Apr 28, 2020, 11:40:23 AM
    Author     : win7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <%
            
            String tk1 = request.getParameter("t1");
            String tk2 = request.getParameter("t2");
            String u=(String)session.getAttribute("user");
            
            Connection con = null;
            Statement st = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url ="jdbc:mysql://localhost:3306/ayush?autoReconnect=true&useSSL=false"; 
                String un = "root";
                String pwd= "avyas";
                con =(Connection)DriverManager.getConnection(url,un,pwd);
                st=con.createStatement();
                String q ="Insert into Tasknew(Task,Target_date,USER) values ('"+tk1+"','"+tk2+"','"+u+"')";
                st.executeUpdate(q);
               
                %>
                <script>
                    window.location.href="ins.jsp"
                    window.alert("Tasks Inserted Sucessfully !!");
                    
                </script>
                <%
                    
                // response.sendRedirect("iframe.html");
                con.close();
                        
                
            }
            catch(Exception e)
            {
                out.println(e.getMessage());
            }
        
            
            %>
    </body>
</html>
