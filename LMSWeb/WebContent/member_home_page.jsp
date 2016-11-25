<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "org.hibernate.cfg.Configuration, org.hibernate.*,com.virtusa.project.services.database.DatabaseServices"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/tablecss.css"> 
<title>Admin</title>
</head>
<body>
<%-- <jsp:param value="" name="adminid"/> --%>
 <%
	session = request.getSession();
 	session.getValue("id");
%>
<table class="table-fill">
<th> <a href="issue_book.jsp">Issue Book</a><br/></th>
<th> <a href="return_book.jsp">Return Book</a><br/></th>
<th> <a href="view_book.jsp">view Book List</a><br/></th>
<th> <a href="view_book.jsp">Search Book List</a><br/></th>
<th> <a href="view_sort_by_id.jsp">Sort by id</a><br/></th>
<th> <a href="view_sort_by_name.jsp">Sort by name</a><br/></th>
<th> <a href="view_sort_by_rating.jsp">Sort by rating</a><br/></th>
<th> <a href="logout.jsp">Logout</a><br/></th>
</table>
</body>
</html>