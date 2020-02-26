<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- http://localhost:8080/RESTfulJersey/rest/member/userName
Actionun amaci yukaridaki adreslerden birine gitmek-->

<form action="rest/member/userName" method="post">
	<!-- Method post yani postla gondericez.. -->
	<input type="text" name="userName">
	<input type="submit" name="Send">
</form>

</body>
</html>