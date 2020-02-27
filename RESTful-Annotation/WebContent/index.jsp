<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Fuat Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>


<!-- http://localhost:8080/RESTfulJersey/rest/member/entry
Actionun amaci yukaridaki adreslerden birine gitmek-->

<div class="container">
  <h2>FORM</h2>
  <form action="rest/member/entry" method="post">  <!-- Method post yani postla gondericez.. -->
    <div class="form-group">
      <label for="Username">Username:</label>
      <input type="Username" class="form-control" id="Username" placeholder="Enter Username" name="Username">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
    </div>
    <button type="submit" class="btn btn-primary">Send</button>
  </form>
</div>


<!-- 
<form action="rest/member/entry" method="post">
	
	<input type="text" name="userName">
	<input type="submit" value="Send">
</form>
-->
</body>
</html>