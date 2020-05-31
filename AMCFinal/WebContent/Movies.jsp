<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import= "model.Movie"%>
<!DOCTYPE html>
<html>


<%

	String userName= (String)session.getAttribute("userName");
	//int custID= (int)session.getAttribute("customerID");
	Movie rogers= (Movie)request.getAttribute("rogers");
	Movie angels= (Movie)request.getAttribute("angels");
	Movie doctor= (Movie)request.getAttribute("doctor");
	Movie ford= (Movie)request.getAttribute("ford");
	Movie frozen= (Movie)request.getAttribute("frozen");
	Movie joker= (Movie)request.getAttribute("joker");
	Movie last= (Movie)request.getAttribute("christmas");
	Movie midway= (Movie)request.getAttribute("midway");
	Movie playing= (Movie)request.getAttribute("playing");
	Movie liar= (Movie)request.getAttribute("liar");

%>


<head>
<meta charset="ISO-8859-1">
<link href="./style/style.css" type="text/css" rel="stylesheet">
<title>AMC Theaters: Movies</title>
<style>
.container {
  position: relative;
  width: 50%;
}



.overlay {
  position: absolute;
  bottom: 0;
  left: 0;
  right: 0;
  background-color: #008CBA;
  overflow: hidden;
  width: 120%;
  height: 100%;
  -webkit-transform: scale(0);
  -ms-transform: scale(0);
  transform: scale(0);
  -webkit-transition: .3s ease;
  transition: .3s ease;
}

.container:hover .overlay {
  -webkit-transform: scale(1);
  -ms-transform: scale(1);
  transform: scale(1);
}

.text {
  color: white;
  font-size: 20px;
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
  text-align: center;
}
</style>
</head>

<body>
<h1><center>AMC Theaters</center></h1>

<header>

<nav>
<ul>
<li><a href="MovieServlet">Movies</a></li>
<li id="username">Welcome <%= userName %>!</li>
<li><a href="ReadCartServlet" id="cartLogo"><img src="images/cart2.png" alt="" id="cartLogo"/></a></li>
</ul>
</nav>
</header>
<br>
<h2>Featured Movies</h2>
 
<table width="100%" border="0">
  <tr> 
 <div class="container">  
 	<td><img src="images/frozen.jpeg" alt=""/><br><label><%=frozen.getMovieName()%> <br> <%= frozen.getRunningTime() %> |
	<%=frozen.getRating() %><br>Released <%=frozen.getReleaseDate() %></label></td>	
	
	<td><img src="images/angels.jpg" alt=""/><br><label><%=angels.getMovieName()%> <br> <%= angels.getRunningTime() %> |
	<%=angels.getRating() %><br>Released <%=angels.getReleaseDate() %></label></td>	
	
	<td><img src="images/ford.jpg" alt=""/><br><label><%=ford.getMovieName()%> <br> <%= ford.getRunningTime() %> |
	<%=ford.getRating() %><br>Released <%=ford.getReleaseDate() %></label></td>	
	
	<td><img src="images/christmas.jpg" alt=""/><br><label><%=last.getMovieName()%> <br> <%= last.getRunningTime() %> |
	<%=last.getRating() %><br>Released <%=last.getReleaseDate() %></label></td>	
	
	<td><img src="images/tomHanks.jpeg" alt="" /><br><label><%=rogers.getMovieName()%> <br> <%= rogers.getRunningTime() %> |
	<%=rogers.getRating() %><br>Released <%=rogers.getReleaseDate() %></label></td>	
 </div>
  </tr>
</table>
<br><br>
<p>----------------------------------------------------------------------------------------------------------------</p>
<br><br>
<table width="100%" border="0">
  <tr> 
 <div class="container">  
  	<td><img src="images/midway.jpg" alt=""/><br><label><%=midway.getMovieName()%> <br> <%= midway.getRunningTime() %> |
	<%=midway.getRating() %><br>Released <%=midway.getReleaseDate() %></label></td>	
	
	<td><img src="images/joker.jpg" alt=""/><br><label><%=joker.getMovieName()%> <br> <%= joker.getRunningTime() %> |
	<%=joker.getRating() %><br>Released <%=joker.getReleaseDate() %></label></td>
		
	<td><img src="images/liar.jpg" alt=""/><br><label><%=liar.getMovieName()%> <br> <%= liar.getRunningTime() %> |
	<%=liar.getRating() %><br>Released <%=liar.getReleaseDate() %></label></td>	
	
	<td><img src="images/fire.jpg" alt=""/><br><label><%=playing.getMovieName()%> <br> <%= playing.getRunningTime() %> |
	<%=playing.getRating() %><br>Released <%=playing.getReleaseDate() %></label></td>	
	
	<td><img src="images/doctor.png" alt="" /><br><label><%=doctor.getMovieName()%> <br> <%= doctor.getRunningTime() %> |
	<%=doctor.getRating() %><br>Released <%=doctor.getReleaseDate() %></label></td>	
 </div>
  </tr>
</table>


<br><br>
<form action="Ticket.jsp" >
<input type="submit" name="submit" value="Get Tickets">
</form>

</body>
</html>