<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Homepage</title>
  <style >
body {
  margin: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background-color: #f0f0f0;
}

.container {
  text-align: center;
}

.button-wrapper {
  display: flex;
  gap: 20px;
  justify-content: center;
 	align-items: center;
}

.big-button {
  flex: 1;
  padding: 15px 30px;
  font-size: 18px;
  background-color: #3498db;
  color: #ffffff;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  width: 100px;
  height: 80px;
}

.title {
  text-align: center;
}

.page-title {
  font-size: 36px;
  color: #333;
}

.big-button:hover {
  background-color: #2980b9;
}

  
  </style>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="title">
    <h1 class="page-title">CRUD OPERATION USINIG SPRING MVC AND ORM</h1>
  </div>
<div class="container">
 <div class="button-wrapper">
 <a href="registration"><button type="submit" class="btn btn-primary big-button">Register</button></a>
<a href="login"><button type="submit" class="btn btn-primary  big-button">Login</button></a>
</div>
</div>

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>


