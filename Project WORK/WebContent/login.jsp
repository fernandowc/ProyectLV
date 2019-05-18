<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="js/bootstrap.min.js" type="text/css" rel="stylesheet" />
<link href="css/signin.css" rel="stylesheet" type="text/css">
<head>
<title>ServitecV3 - Login</title>

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
</head>
<body class="text-center">


	<form class="form-signin" >
		<img class="mb-4" src="image/profileLogin.png"
			alt="" width="100" height="100">
		<h1 class="h3 mb-3 font-weight-normal">Servitec V3</h1>
		<label for="inputEmail" class="sr-only">Email address</label> <input
			type="email" id="inputEmail" class="form-control"
			placeholder="Email address" required autofocus> <label
			for="inputPassword" class="sr-only">Password</label> <input
			type="password" id="inputPassword" class="form-control"
			placeholder="Password" required>
		<div class="checkbox mb-3">
			<label> <input type="checkbox" value="remember-me">
				Remember me
			</label>
		</div>
		<button class="btn btn-lg btn-dark btn-block" type="submit">Sign
			in</button>
			
			<jsp:include page="includes/footer.jsp"></jsp:include>
		
	</form>

</body>
</html>