<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "org.hibernate.cfg.Configuration, org.hibernate.*,com.virtusa.project.services.database.DatabaseServices"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
</head>
<body>

<%
	session = request.getSession(false);
	out.print(session.getValue("adminId"));
	out.print(session.getValue("userType"));
	out.print(session.getValue("adminName"));
	out.print(session.getValue("adminId"));
%>
<table>
<th> <a href="admin/add_user.jsp">Add User</a><br/></th>
<th> <a href="admin/update_member_by_id.jsp">Update User Details</a><br/></th>
<th> <a href="admin/remove_user.jsp">Remove User</a><br/></th>
<th> <a href="admin/display_user.jsp">Display User Details</a><br/></th>
<th> <a href="admin/add_book.jsp">Add Book</a><br/></th>
<th> <a href="admin/update_book_by_id.jsp">Update Book Details</a><br/></th>
<th> <a href="admin/remove_book.jsp">Remove Book</a><br/></th>
<th> <a href="admin/display_book.jsp">Display Book Details</a><br/></th>
</table>



</body>
</html>