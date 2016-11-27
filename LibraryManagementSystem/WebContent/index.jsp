<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign-Up/Login Form</title>
<link
	href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="css/style.css">

<style>
	header {
	height: 0px;
	position: fixed;
	background: #505050;
	width: 100%;
}

.LMSa {
	float: left;
	margin-left: 5%;
}

.LMSa a {
	color: #00ffaa;
	font-size: 25px;
	margin-top: 10px;
	display: block;
	text-decoration: none;
}

.headerB {
	background: linear-gradient(to right, rgba(0, 0, 0, 1), rgba(0, 0, 0, 0));
}
</style>
</head>
<body>
<header class="headerB">
	<div class="LMSa">
		<a href="#">Library Management System</a>
	</div>
</header>
	<h1>.</h1>
	<div class="form">
		<ul class="tab-group">
			<li class="tab active"><a href="#signup">Admin</a></li>
			<li class="tab"><a href="#login">Member</a></li>
		</ul>
		<div class="tab-content">
			<div id="signup">
				<form action="login_authenticate_admin" method="post">
					<div class="field-wrap">
						<label> Admin ID<span class="req">*</span>
						</label> <input type="number" name="adminid" id="adminid" required
							autocomplete="off" />
					</div>
					<div class="field-wrap">
						<label> Password<span class="req">*</span>
						</label> <input type="password" name="adminpassword" id="adminpassword"
							required autocomplete="off" />
					</div>
					<p class="forgot">
						<a href="#">Forgot Password?</a>
					</p>
					<button class="button button-block" />
					Log In
					</button>
				</form>
			</div>
			<div id="login">
				<form action="login_authenticate_member" method="post">
					<div class="field-wrap">
						<label> Member ID<span class="req">*</span>
						</label> <input type="number" name="memberid" id="memberid" required
							autocomplete="off" />
					</div>
					<div class="field-wrap">
						<label> Password<span class="req">*</span>
						</label> <input type="password" name="memberpassword" id="memberpassword"
							required autocomplete="off" />
					</div>
					<p class="forgot">
						<a href="#">Forgot Password?</a>
					</p>
					<button class="button button-block" />
					Log In
					</button>
				</form>
			</div>
		</div>
		<!-- tab-content -->
	</div>
	<jsp:include page="footer.html"/>
	<!-- /form -->
	<script
		src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	<script src="js/index.js"></script>

</body>
</html>
