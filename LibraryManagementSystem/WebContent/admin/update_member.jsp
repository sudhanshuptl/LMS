<%@page
	import="com.virtusa.project.services.book.BookServices,org.hibernate.Session,org.hibernate.SessionFactory,org.hibernate.Transaction,org.hibernate.cfg.Configuration"%>
<%@page
	import="com.virtusa.project.books.Book,com.virtusa.project.services.database.*,com.virtusa.project.users.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.virtusa.project.services.admin.AdminServices"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Service</title>
<link
	href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">


<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" href="css/style.css">


</head>

<body>
<jsp:include page="/IsValidAdmin" flush="true"/>
<jsp:include page="admin_header.html"></jsp:include>
	<%
	    String memberString = (String)request.getAttribute("memberString");
		String[] memberStringArray = memberString.split(" ");
		String memberName = memberStringArray[0];
		String password = memberStringArray[1];
		long phoneNumber = Long.parseLong(memberStringArray[2]);
	%>

	<h1>
		<font color="#FF00FF" size="100">.</font>
	</h1>
	<div class="form">

		<ul class="tab-group">
			<li class="tab active"><a href="#signup">Update Member</a></li>
		</ul>

		<div class="tab-content">
			<div id="signup">

				<form action="update_userdetails" method="post">
				<input type="hidden" name="memberId" value=<%= request.getParameter("memberId") %>>

					<div class="field-wrap">
						<!-- <label> Book Name<span class="req" name="bookName">*</span> -->
						User Name </label> <input type="text" name="userName" value=<%=memberName%> />
					</div>

					<div class="field-wrap">
						<!-- <label> Author<span class="req" name="Author">*</span> -->
						Password </label> <input type="password" name="password" value=<%=password%> />
					</div>

					<div class="field-wrap">
						<!-- <label> Edition<span class="req" name="edition">*</span> -->
						Phone Number </label> <input type="number" name="phoneNumber" value=<%=phoneNumber%> />
					</div>


					<!--<p class="forgot"><a href="#">Forgot Password?</a></p>-->

					<button class="button button-block" />
					Update
					</button>

				</form>

			</div>
		</div>
		<!-- tab-content -->

	</div>
	<!-- /form -->
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

	<script src="../js/index.js"></script>
	<script src="js/index.js"></script>
	<jsp:include page="footer.html"></jsp:include>
</body>
</html>

<!-- pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" -->