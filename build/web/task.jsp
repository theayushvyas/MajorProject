<%-- 
    Document   : task
    Created on : May 5, 2020, 5:09:16 PM
    Author     : win7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pending</title>

    </head>
    <div align ="center" />

    <h2></h2>
    <%
        String t = (String) session.getAttribute("user");

        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ayush?autoReconnect=true&useSSL=false";
            String un = "root";
            String pwd = "avyas";
            con = (Connection) DriverManager.getConnection(url, un, pwd);
            st = con.createStatement();
            String q = "select * from Tasknew where USER='" + t + "'";
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {

    %>     
    <form action="comp.jsp">
        <button onclick="bag()" class="button">Mark as Complete</button>
        </br> <th style="background:yellow;">Task Creation Date:&nbsp<label><%=rs.getString("dt")%></th></br>
        </br><td>Task:<input type="text" name= "tk" placeholder="<%=rs.getString("task")%>" class="td"></td>
        </br><td>Target:<input type="text" placeholder="<%=rs.getString("target_date")%>" class="td"></td>
    </form>
    <script>
        function bag()
        {
            var element = document.body;
            element.classList.toggle("Darkbg");
        }
    </script>
</tr></br>    
<style>
    ::placeholder{
        color :#000000;
        font: bold;
    }
    .body
    {
        font-weight: bolder;
    }
    .td
    { 
        background: white;
        border:outset;
        border-color: #ffb73c;
        background:#ffb73c;
        font:bold 15px arial,sans-serif;
        height: 40px;
        width: 400px;
    }
    .Darkbg {
        background-color: greenyellow;
        background-image: url("done2.png");
        background-size: 427px 620px;
        color: black;

    }

    .button
    {
        position: absolute;
        right: 30px;
        top: 20px;
        background: lightgreen;
        width: 80px;
        height: 46px;
        font: bold 15px arial,sans-serif;
    }                              
</style> 
<%
        }

        con.close();

    } catch (Exception e) {
        out.println(e.getMessage());
        out.println("Error in catch");
    }

%>


</html>
