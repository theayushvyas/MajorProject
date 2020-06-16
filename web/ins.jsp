<%-- 
    Document   : ins
    Created on : Apr 28, 2020, 11:06:13 AM
    Author     : win7
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <meta charset="utf-8">
            <title>Current Weather</title>
            <link href="https://fonts.googleapis.com/css?family=Montserrat:400,900" rel="stylesheet">
       
    <!--  <button onclick="bag()" class="bgt">DarkMode</button> -->
        <style>
           
        /*    body {  
                 background-color: smokewhite;
                 font:15px arial white, sans-serif;
                 font-weight: bolder;
                
                } */
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
                  .date
                  {
                      left:15%;
                  }
                  .form {
                      background : #99ffff ;
                      color: black;
                      height: 0px;
                      position: absolute;
                      top: 20%;
                      right: 1.5%;
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
                    top: 65%;
                    right: 11%;
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
                              .find{
                                  position:absolute;
                                  left: 50%;
                                  top: 30%;
                                  width: 150px;
                                  height: 50px;
                                      
                              }
               
                  
                  
         </style>

    </head>
    
    <body> 
        <div align ="center" />
        <h1> WELCOME </h1>
        
          <form action="sql.jsp" class ="form" >
              <h2>PLAN </h2>
     
                       <input type="text" name ="t1" value="" class="tf">
                       </br> </br>                
                       Date: <input type="date" name="t2" class="date"> 
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
       <div>
    <form action="#" class="a2">
      <label for="lname">Enter city:</label>
      <input type="text" id="lname" name="lname">
      </br> </br> <button id="sub" onClick="load()" class="button">Submit</button>
     </form>
           <script type="text/javascript">
                    const key = '<USE YOUR OWN API KEYS>';
              if(key=='') document.getElementById('temp').innerHTML = ('Remember to add your api key!');

              // api.openweathermap.org/data/2.5/weather?q={city name}&appid={your api key}

              function weatherBallon( city ) {
                fetch('https://api.openweathermap.org/data/2.5/weather?q=' + city+ '&appid=' + key +'&cnt = 5')  
                .then(function(resp) { return resp.json() }) // Convert data to json
                .then(function(data) {
                  drawWeather(data);
                })
                .catch(function() {
                  // catch any errors
                });
              }
              function drawWeather( d ) {
                var celcius = Math.round(parseFloat(d.main.temp)-273.15);
                var fahrenheit = Math.round(((parseFloat(d.main.temp)-273.15)*1.8)+32);
                var description = d.weather[0].description; 

                document.getElementById('description').innerHTML = description;
                document.getElementById('temp').innerHTML = celcius + '&deg;';
                document.getElementById('location').innerHTML = d.name;

                if( description.indexOf('rain') > 0 ) {
                  document.body.className = 'rainy';
                } else if( description.indexOf('cloud') > 0 ) {
                  document.body.className = 'cloudy';
                } else if( description.indexOf('sunny') > 0 ) {
                  document.body.className = 'sunny';
                } else {
                  document.body.className = 'clear';
                }
              }
              // window.onload = function() {
              //  weatherBallon( 'agra' );
              // }

              document.getElementById("sub").addEventListener("click", function(event){
                event.preventDefault()
              });


              function load() {
                var x = document.getElementById("lname").value;
                console.log(x);
                weatherBallon(x);
              }
</script>
	<div>
    <div class="a1">
      <div id="description"></div>
      <h2 id="temp" ></h2>
      <div id="location"></div>
    </div>
  </div>
       </div>
         <style type="text/css">
                    body {
                   font-family: 'Montserrat', sans-serif;
                   font-weight: 400;
                   color: #fff;
                   display: flex;
                   align-items: center;
                   justify-content: center;
                   text-shadow: .1em .1em 0 rgba(0,0,0,0.3);
                   font-size: 1.3em;
                   height: 100vh;
                   background-image: linear-gradient(to right top, #99bbcb, #a5c7d7, #b1d4e2, #bde0ee, #c9edfa);
              }
               h2 {
                   margin: 0 auto;
                   font-size: 2.2em;
                   text-align: center;
                   color: #fff;
                   font-size: 2em;
               }
               body.sunny {
                   background-image: linear-gradient(to right top, #ff4e50, #ff713e, #ff932b, #ffb41d, #f9d423);
               }
               body.cloudy {
                   background-image: linear-gradient(to right top, #63747c, #71858e, #7f96a0, #8da8b2, #9bbac5);
               }
               body.rainy {
                   background-image: linear-gradient(to right top, #637c7b, #718e8c, #7ea09e, #8db2b0, #9bc5c3);
               }
                  </style>
                  
                   <div id="covid">
                       </br> <label for="div">Corona Virus Cases In INDIA LIVE:</label>
                </br>
                        Total Cases:<div id="Total"></div>
                    Total Recovered<div id="Recovered"></div>
                    Total New Cases Today<div id="New"></div>
                    Total Deaths<div id="death"></div>
                  </div>
  <script type="text/javascript">

  	function cases() {
            fetch('https://api.thevirustracker.com/free-api?countryTotal=IN')  
            .then(function(resp) { return resp.json() }) // Convert data to json
            .then(function(data) {
              drawCases(data);
            })
            .catch(function() {
              // catch any errors
            });
          }
          window.onload = function() {
              cases();
          }
            function drawCases(d)
            {
                var totalc = d.countrydata[0].total_cases;
                var R = d.countrydata[0].total_recovered;
                var newC = d.countrydata[0].total_new_cases_today;
                var death = d.countrydata[0].total_deaths;
              document.getElementById('Total').innerHTML = totalc;
              document.getElementById('Recovered').innerHTML = R;
              document.getElementById('New').innerHTML = newC;
              document.getElementById('death').innerHTML = death;
              console.log(totalc);
          }
</script>
        </body>
        </html>
