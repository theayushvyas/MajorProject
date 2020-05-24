<%-- 
    Document   : reg
    Created on : May 9, 2020, 4:09:42 PM
    Author     : win7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Registered </title>
    </head>
    <body>
        <% String fn = request.getParameter("EN");
           String user= request.getParameter("un");
           String pass=request.getParameter("pwd");
            Connection con =null;
            Statement pst= null;
            try
            { 
              Class.forName("com.mysql.jdbc.Driver");
       //       String url ="jdbc:mysql://localhost:3306/ayush";
              String url ="jdbc:mysql://localhost:3306/ayush?autoReconnect=true&useSSL=false";
              String un="root";
              String pwd="avyas";
              con=(Connection)DriverManager.getConnection(url,un,pwd);
              pst=con.createStatement();
             String q="insert into login (Name , User_name , Password) values('"+fn+"','"+user+"','"+pass+"')";
            
             pst.executeUpdate(q);
            %>
            <script>
                window.location.href="login.jsp"; 
                window.alert("Registered Successfully !!");
                </script>
            
            <%
                
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
