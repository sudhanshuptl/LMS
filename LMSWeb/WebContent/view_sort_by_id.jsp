<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.virtusa.project.services.book.BookServices" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
	<meta charset="utf-8" />
	<title>Table Style</title>
	<link rel="stylesheet" href="css/tablecss.css"> 
	<meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
</head>

<body>
<table >
<th> <a href="issue_book.jsp">Issue Book</a><br/></th>
<th> <a href="return_book.jsp">Return Book</a><br/></th>
<th> <a href="view_book.jsp">view Book List</a><br/></th>
<th> <a href="view_book.jsp">Search Book List</a><br/></th>
<th> <a href="view_sort_by_id.jsp">Sort by id</a><br/></th>
<th> <a href="view_sort_by_name.jsp">Sort by name</a><br/></th>
<th> <a href="view_sort_by_rating.jsp">Sort by rating</a><br/></th>
<th> <a href="logout.jsp">Logout</a><br/></th>
</table>
<div class="table-title">
<h3>Data Table</h3>
</div>
<table class="table-fill">
<thead>
<tr>
<th class="text-left">BookID</th>
<th class="text-left">Name</th>
<th class="text-left">Edition</th>
<th class="text-left">Rating</th>
<th class="text-left">IssuedBy</th>
</tr>
</thead>
<tbody class="table-hover">
<%
	BookServices bookServices = new BookServices();
	out.println(bookServices.sortBooksById());
%>
</tbody>
</table>
  
</body>
</html>