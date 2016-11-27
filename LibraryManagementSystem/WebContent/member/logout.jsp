<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Admin Service</title>
<link
	href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">


<link rel="stylesheet" href="../css/style.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	Successfully Logged out
	<%
	session = request.getSession(false);
	session.invalidate();
%>
	<script>
		window.location
				.replace("http://localhost:9091/LibraryManagementSystem/index.jsp")
	</script>
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

	<script src="../js/index.js"></script>
	<jsp:include page="footer.html"></jsp:include>
</body>
</html>