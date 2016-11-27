<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.virtusa.project.services.admin.AdminServices,com.virtusa.project.ui.service.UiServices"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<meta charset="utf-8" />
<title>Table Style</title>
<link rel="stylesheet" href="../css/tablecss.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="../css/style.css">
<meta name="viewport"
	content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
</head>

<body>
<jsp:include page="/IsValidAdmin" flush="true"/>
	<jsp:include page="admin_header.html"></jsp:include>
	<h1>.</h1>
	<div class="table-title"></div>
	<table class="table-fill">
		<thead>
			<tr>
				<th class="text-left">UserID</th>
				<th class="text-left">Name</th>
				<th class="text-left">Phone</th>
			</tr>
		</thead>
		<tbody class="table-hover">
			<%
				UiServices uiServices = new UiServices();
				out.print(uiServices.displayUserDetails());
			%>
		</tbody>
	</table>
	<jsp:include page="footer.html"></jsp:include>
</body>
</html>