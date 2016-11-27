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


</head>

<body>
<jsp:include page="/IsValidAdmin" flush="true"/>
<jsp:include page="admin_header.html"></jsp:include>

	<h1>
		<font color="#FF00FF" size="100">.</font>
	</h1>
	<div class="form">

		<ul class="tab-group">
			<li class="tab active"><a href="#signup">New Book</a></li>
		</ul>

		<div class="tab-content">
			<div id="signup">

				<form action="../add_book" method="post">

					<div class="field-wrap">
						<label> Book Name<span class="req" name="bookName">*</span>
						</label> <input type="text" name="bookName" required autocomplete="off" />
					</div>

					<div class="field-wrap">
						<label> Author<span class="req" name="Author">*</span>
						</label> <input type="text" name= "authorName"required autocomplete="onblur" />
					</div>

					<div class="field-wrap">
						<label> Edition<span class="req" name="edition">*</span>
						</label> <input type="number" name="edition" required autocomplete="on" min="1" />
					</div>


					<!--<p class="forgot"><a href="#">Forgot Password?</a></p>-->

					<button class="button button-block" />
					Add Book
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

<jsp:include page="footer.html"></jsp:include>
</body>
</html>

<!-- pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" -->