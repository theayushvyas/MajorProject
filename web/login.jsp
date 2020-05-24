<%-- 
    Document   : login
    Created on : May 3, 2020, 5:11:42 PM
    Author     : win7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
        
    </head>                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    <body>
        <style>
            
            body {
                background-image: url(abs.png);
                background-size:1600px 1800px; 
                background-repeat: no-repeat;
                background-color : whitesmoke;
                }
            .form
              {
                font: bold 15px arial, sans-serif;
                width: 300px;
                padding: 10px; padding-bottom: 130px;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%,-50%);
                border: outset;
                border-color: #00ffff;
              }
              
              ::placeholder {
                        color: white;
                        opacity: 1;
                      }
                   
            .form input[type ="text"] ,.form input[type ="password"]
            {
                border: 0;
                background: none;
                display: block;
                margin: 20px auto;
                text-align: center;
                border: 2px solid #3498db;
                padding: 14px 10px;
                width: 100px;
                outline: none;
                color: white;
                border-radius: 24px;
                transition: 0.25s;
            }
            .form input[type ="text"]:focus ,.form input[type ="password"]:focus
            {
                 width: 200px;
                 border-color: #2ecc72;
                    
            }
               .btn {
                background-color:black;
                color: white;
                width: 70px;
                height: 30px;
                font: bold 15px arial, sans-serif;
                border-radius: 25px;
                
                border: 2px solid #2ecc72;
                
               }
            
               .btn:hover{
                   background-color: #2ecc72;}
               .reg{
                   position: absolute;
                   bottom: 25%;
                   right: 46.5%;
                   width: 100px;
                   height: 100px;
               }   
               .newbtn
                {
                    background-color: #ccff00;
                    position: absolute;
                    bottom:140px;
                    left: 47%;
                    width: 100px;
                    height: 100px;
                    border: outset;
                }
                .newbtn:hover
                {
                    background: transparent;
                }
     </style>
     <script>
        
     </script>
         
         <div align ="center" />
         <h1 style="background-color: #ffb73c">LOGIN</h1>
         <form class ="form" action="auth.jsp" id="of" >
            
            </br><input type="text" name="User_Name" value="" name="U_N" placeholder="User Name"/>
        <input type="password" name="Password" value="" placeholder="Password" /> </br>
            </br><td><input type="submit" value="Login" class="btn"/> 
           &nbsp;&nbsp;&nbsp;<input type="reset" value="Reset" class="btn"/></td></br></br>
            
        </form>
         <form class="form" id="nef" style="display:none;" action="reg.jsp">
             <input type="text" name="EN" placeholder="Enter Name"/>Enter Name:
             <input type="text" name="un" placeholder="Enter UserName"/>Enter UserName:
             <input type="Password" name="pwd" placeholder="Enter Password"/>Enter Password:
             <input type="submit" value="REGISTER" />
        </form>
         
         <script>
             function dispon(){
                 document.getElementById('nef').style.display='block';
             }
             function dispof()
             {
                 document.getElementById('of').style.display='none';
             }
             function btnof()
             {
                 document.getElementById('bt').style.display='none';
             }
         </script>
         <button id="bt" class="newbtn" type="button" onclick="dispon();dispof();btnof()">SIGN UP!</button>
    </body>
</html>