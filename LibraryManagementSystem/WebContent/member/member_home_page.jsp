<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "org.hibernate.cfg.Configuration, org.hibernate.*,com.virtusa.project.services.database.DatabaseServices"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
<style>
	h2{
	text-align: center;
	padding-top: 200px;
	}
</style>
</head>
<body>
<jsp:include page="/isValidMember" />
<%-- <jsp:param value="" name="adminid"/> --%>
<%--  <%
	session = request.getSession(false);
	out.print(session.getValue("memberId"));
	out.print(session.getValue("userType"));
	out.print(session.getValue("memberName"));
	out.print(session.getValue("memberId"));
	out.println(request.getAttribute("ack"));
%> --%>
<jsp:include page="member_header.html"></jsp:include>

<%
	String acknowledgeMessage = null;
	session = request.getSession(false);
	/* out.print(session.getValue("adminId"));
	out.print(session.getValue("userType"));
	out.print(session.getValue("adminName"));
	out.print(session.getValue("adminId")); */
	acknowledgeMessage = (String)(session.getAttribute("ack")+"");
	if(acknowledgeMessage == null){
		acknowledgeMessage = " ";
	}
%>
<h2><%= acknowledgeMessage %></h2>
<jsp:include page="footer.html"></jsp:include>
</body>
</html>