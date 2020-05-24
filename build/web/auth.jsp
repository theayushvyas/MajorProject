<%-- 
    Document   : auth
    Created on : May 4, 2020, 10:47:34 PM
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
            String uname = request.getParameter("User_Name");
            String pswd = request.getParameter("Password");
            
            session.setAttribute("user",uname);
            
            Connection con = null;
            Statement st = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                String url ="jdbc:mysql://localhost:3306/ayush?autoReconnect=true&useSSL=false"; 
                String un = "root";
                String pwd= "avyas";
                con =(Connection)DriverManager.getConnection(url,un,pwd);
                st=con.createStatement();
                String q ="select * from login where User_name ='"+uname+"' and Password ='"+pswd+"'";
                ResultSet rs = st.executeQuery(q);
                if (rs.next())
                { 
                    response.sendRedirect("ins.jsp?user="+ uname+"");
                    
                }
                else
                {
                  // response.sendRedirect("login.jsp");
               %>
               <script>
                   alert("Incorrect USERNAME/PASSWORD");
                   window.location.href="login.jsp";
                   
               </script>
               <%
                }
                
                con.close();
                        
                
            }
            catch(Exception e)
            {
                out.println(e.getMessage());
                out.println("Error in catch");
            }
        
            
            %>
    </body>
</html>
