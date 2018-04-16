<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="css/style.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html;">
<title>Home</title>
</head>
<body>
        <!-- <form action = "result.jsp" method = "POST" target = "_blank">
         <input type = "checkbox" name = "RealMadrid" /> Real Madrid
         <input type = "checkbox" name = "BayernMunich"  /> Bayern Munich
         <input type = "checkbox" name = "Liverpool"  /> Liverpool
         <input type = "checkbox" name = "Roma"  /> Roma
         <input type = "submit" value = "Select Team" />
      </form>-->
      <div id="wrapper" class="outer">
        <div class="middle">
            <div class="inner" style="background: rgba(0,0,0, 0.5); padding:5%">
                <div>
                    <!-- Section: intro -->
                    <div class="vertical-align col-lg-12">
                        <div class="slogan">
                            <h1> IntegraDoc </h1>
                            <h4> Seleccione equipo </h4>
                        </div>
                        <!-- /Section: intro <button id="showMap" class="float-left submit-button" >Home</button>-->
                        <div class="col-lg-12 text-center">
                               <form action="result.jsp">
		  <select name="team" class= dropdown-custom>
			    <option value="1">Manchester United</option>
			    <option value="2">Manchester City</option>
			    <option value="3">Liverpool</option>
			    <option value="4">Arsenal</option>
			  </select>
			  <input type="submit" class="btn btn-primary btn-lg submit-button" value="Ver Resultado">
	</form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
      
</body>
</html>