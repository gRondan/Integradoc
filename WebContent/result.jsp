<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8"%>
    <%@ page import="backend.DataCollector" %>
    <%@ page import="backend.Match" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="css/style.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
</head>
<body>
      <div id="wrapper" class="outer">
        <div class="middle">
            <div class="inner" style="background: rgba(0,0,0, 0.5); padding:5%">
                <div>
                    <!-- Section: intro -->
                    <div class="vertical-align col-lg-12">
                        <div class="slogan">
                            <h1> IntegraDoc </h1>
                            <h4> Resultado </h4>
							 <% 
								int teamSelected = Integer.parseInt(request.getParameter("team"));
								//out.println("teamSelected "+teamSelected);
								Match match = null;
								DataCollector dataCollector = new DataCollector();
								try{
									switch(teamSelected){
									case 1:
										match = dataCollector.getMatchData("66");
										//out.println(match.getHomeTeamName()+match.getResult().getGoalsHomeTeam()+match.getAwayTeamName()+match.getResult().getGoalsAwayTeam());
										break;
									case 2:
										match = dataCollector.getMatchData("65");
										//out.println(match.getHomeTeamName()+match.getResult().getGoalsHomeTeam()+match.getAwayTeamName()+match.getResult().getGoalsAwayTeam());
										break;
									case 3:
										match = dataCollector.getMatchData("64");
										//out.println(match.getHomeTeamName()+match.getResult().getGoalsHomeTeam()+match.getAwayTeamName()+match.getResult().getGoalsAwayTeam());
										break;
									case 4:
										match = dataCollector.getMatchData("57");
										//out.println(match.getHomeTeamName()+match.getResult().getGoalsHomeTeam()+match.getAwayTeamName()+match.getResult().getGoalsAwayTeam());
										break;
									}
									%><table class="table table-dark">
										  <thead>
										    <tr>
										      <th scope="col">Equipo</th>
										      <th scope="col">Goles</th>
										    </tr>
										  </thead>
										  <tbody>
										    <tr>
										      <td><%= match.getHomeTeamName()%></td>
										      <td><%=match.getResult().getGoalsHomeTeam()%></td>
										    </tr>
										    <tr>
										      <td><%=match.getAwayTeamName()%></td>
										      <td><%=match.getResult().getGoalsAwayTeam()%></td>
										    </tr>
										  </tbody>
										</table>
							<%			
								}catch(Exception ex){
									%><h4> No es posible obtener el resultado en este momento </h4><% 
								}
							%>    
							<form action="index.jsp">
							<input type="submit" class="btn btn-primary btn-lg submit-button" value="Volver">
							</form>                   
                        	
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
      
</body>
</html>
