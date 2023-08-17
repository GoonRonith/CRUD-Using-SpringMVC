<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login Form</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <style>
  .red{
  color:red;
  }
  </style>
</head>
<body>

  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h1 class="text-center">Login Form</h1>
        <form action="loginProcess" method="post" >
          <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" placeholder="Enter your name" name="name" required>
          </div>
          <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" placeholder="Password" name="pwd" required>
            <span id="error"></span>
          </div> 
          <button type="submit" class="btn btn-primary">Log In</button>
        </form>
      </div>
    </div>
  </div>
	<h3 class="text-center">Don't have an account..<a href="registration">register</a></h3>
	
	
	<%String text=(String)request.getAttribute("msg");
       String errMsg=(String)request.getAttribute("errorMsg"); 		
    if(text != null){
    	%>
    	<script>
    	var text = '<%= text %>';
        alert(text);
    	</script>
    	<%
    }
    
    if(errMsg != null){
    	%>
    	<script>
    	var errMsg = '<%= errMsg %>';
      	let span=document.getElementById('error');
      	span.innerHTML=errMsg;
      	span.classList.add("red");
    	</script>
    	<%
    }
    %>	
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
