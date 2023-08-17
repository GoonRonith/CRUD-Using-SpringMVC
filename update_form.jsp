<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ page import="Login.Enitites.*" %>  

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Update player</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<%Players player=(Players)request.getAttribute("player"); %>
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h1 class="text-center">Update Player</h1>
        <form action="handle-update" method="post" >
        <div class="form-group">
            
            <input type="text" class="form-control" id="name" value="<%= player.getId() %>" name="id" readonly hidden>
          </div>
          <div class="form-group">
            <label for="name">Player Name</label>
            <input type="text" class="form-control" id="name" value="<%= player.getName() %>" name="name" readonly>
          </div>
          <div class="form-group">
            <label for="email">Current Team</label>
            <input type="text" class="form-control" id="email" aria-describedby="emailHelp" value="<%=player.getTeam()%>" name="team" required>
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
          </div>
          <div class="form-group">
            <label for="password">Position</label>
            <input type="text" class="form-control" id="password" value="<%= player.getPosition()%>" name="position" required>
          </div>
            
          <button type="submit" class="btn btn-primary">Add</button>
        </form>
      </div>
    </div>
  </div>
	
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
