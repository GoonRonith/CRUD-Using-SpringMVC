<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.util.*,Login.Enitites.* "   %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashbord</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
 <style>
 #mid{
 display:flex;
 justify-content: center;
 align-items: center;
 }
 </style>
</head>
<body>

<% List<Players> players=(List<Players>)request.getAttribute("players"); %>
<table width='80%' border="4" class="table table-striped table-bordered table-hover">
<tr>
<th>Player name</th>
<th>Player Current team</th>
<th>Player Position</th>
<th>Operation</th>
</tr>

<% for(Players player:players){
	%>
	<tr>
	<td><%= player.getName() %></td>
	
	<td><%= player.getTeam() %></td>
	<td><%= player.getPosition() %></td>
	<td><a href="delete/<%= player.getId() %>"><button type="submit" class="btn btn-primary">Delete</button></a>
	<a href="update/<%= player.getId() %>"><button type="submit" class="btn btn-primary">Update</button></a>
	</td>
	
	</tr>
	<% 
}
	%>





</table>



 <div id="mid"><a href="add"><button type="submit" class="btn btn-primary">Add Player</button></a>&nbsp;
 <a href="logout"><button type="submit" class="btn btn-primary">Log out</button></a>
 </div>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>