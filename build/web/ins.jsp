<%-- 
    Document   : ins
    Created on : Apr 28, 2020, 11:06:13 AM
    Author     : win7
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WELCOME</title>
       
    <button onclick="bag()" class="bgt">DarkMode</button>
        <style>
           
            body {  
                 background-color: smokewhite;
                 font:15px arial white, sans-serif;
                 font-weight: bolder;
                
                }
                .button {
                    background: #0066A2;
                    color: white;
                    border-style: outset;
                    border-color: #0066A2;
                    height: 30px;
                    width: 200px;
                    align-items: center;
                    font: bold 15px arial, sans-serif;
                    text-shadow:none;
                    transition: width 2s, height 2s;
                    }
                           
                    .button:hover {
                    width: 120px;
                    height: 40px;
                    background: lightgreen;
                    font : bold 20px arial ,sans-serif;
                    transition-duration: 1s;
                    }
                  
                
                  .tf {
                      background: yellow;
                      color: black;
                      border-style: outset;
                      border-color: #0066A2;
                      border-radius: 24px 0 24px 0;
                      height: 100px;
                      width: 100px;
                      font: bold 15px arial, sans-serif;
                      text-shadow:none;
                      opacity: 0.7;
                      
                  }
                  .tf:focus {
                      height: 200px;
                      width: 200px;
                  }
                  .form {
                      background : #99ffff ;
                      color: black;
                      height: 0px;
                      position: absolute;
                      top: 30%;
                      left: 50%;
                      transform: translate(-50%,-50%);
                      font: bold 15px arial, sans-serif;
                      text-shadow:none;
                  }
                  h1{
                      color:black;
                      text-transform:uppercase;
                      font-size: 2em;
                      font-family: 'Bangers',cursive;
                      left: 40%;
                      top: 20%;
                      background:#ffb73c;
                      animation: font 5s 1;
                      
                      
                  }
                  @keyframes font {
                 0%{font-size:2em;}
                 0%{font-size:8em ; left:40%;}
                 100%{font-size:2em ;l}
                }
                .newbtn
                {
                    position: absolute;
                    bottom:60px;
                    left: 45%;
                    background-image: url("tp.png");
                    width: 100px;
                    height: 100px;
                    border: outset;
                }
                .newbtn:hover
                {
                    background: transparent;
                }
             
                .logout
                {
                    position: absolute;
                    right: 30px;
                    top: 20px;
                    background: lightblue;
                    width: 80px;
                    height: 46px;
                    font: bold 15px arial,sans-serif;
                }
                .logout:hover{
                    background: lightcoral;
                }
                .bgt
                {
                    position: absolute;
                    left: 30px;
                    top: 20px;
                    background: lightblue;
                    width: 90px;
                    height: 46px;
                    font: bold 15px arial,sans-serif;
                }
                  .Darkbg {
                      background-color:#333333;
                              color: #ccff00;
                              }
                
                  
                  
         </style>

    </head>
    
    <body> 
        <div align ="center" />
        <h1> WELCOME </h1>
        
          <form action="sql.jsp" class ="form" >
              
     
                       <input type="text" name ="t1" value="" class="tf">
                       </br> </br>                
                       Add Target Date: <input type="date" name="t2"> 
                       </br> </br>
                    <br/>  <input type="submit" class ="button" value="SUBMIT" >
                   
                     
           <br/>
               
               
               
        </form>
          <button onclick="window.location.href = 'iframe.html';" class="newbtn">TASKS</button>
          <button  onclick="window.location.href = 'login.jsp';" class="logout">Logout</button>
         <% String u = (String)session.getAttribute("user");
          %>
         <%= u %>
          <script>
        function bag()
        {
            var element=document.body;
            element.classList.toggle("Darkbg");
        }
    </script>
    
    </body>
</html>
