<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Signup Form</title>
  <style>
  .red{
  color: red;
  }
  </style>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h1 class="text-center">Signup Form</h1>
        <form action="registration" method="post" >
          <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" placeholder="Enter your name" name="name" required>
          </div>
          <div class="form-group">
            <label for="email">Email address</label>
            <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter email" name="email" required>
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
          </div>
          <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" placeholder="Password" name="pwd" required>
          </div>
            
          <button type="submit" class="btn btn-primary">Sign up</button>
        </form>
      </div>
    </div>
  </div>
	<h3 class="text-center">Already have an account..<a href="login
	
	">Log in</a></h3>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
   <% String message=(String) request.getAttribute("message"); 
   if(message != null){
	   %>
	   <div class="error-message" id="errorMessage">
       <h3 class="text-center red"><%= message %></h3>
   		</div>
	   <%
   }
   
   
   %>
   
   <script>
   function showErrorMessage() {
       var errorMessage = document.getElementById('errorMessage');
       errorMessage.style.display = 'block'; // Show the error message

       setTimeout(function() {
           errorMessage.style.display = 'none'; // Hide the error message
       }, 3000); // 3000 milliseconds = 3 seconds
   }
   
   window.onload = showErrorMessage;
   
   </script>
</body>
</html>
