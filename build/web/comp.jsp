<%-- 
    Document   : comp
    Created on : May 16, 2020, 12:22:05 PM
    Author     : win7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
        <% String user=(String)session.getAttribute("user");
            
         Connection con= null;
         Statement st = null;
         try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/ayush?autoReconnect=true&useSSL=false";
            String uname="root";
            String pwd="avyas";
            con=(Connection)DriverManager.getConnection(url,uname,pwd);
            st=con.createStatement();
            String q = "insert into Completed (Task,USER) select TASK,user from Tasknew where USER='"+user+"'";
            st.executeUpdate(q);
            
         }
         catch(Exception e){
             out.println(e.getMessage());
         }
         
        %>
        <button class="button">Successfully Completed!!</button>

        <style>
             .button
{
    position: absolute;
    left: 0px;
    top: 250px;
    background: limegreen;
    height: 90px;
    width: 440px;
    font: bold italic 15px arial,sans-serif;
}   
</style>
    </body>
</html>
