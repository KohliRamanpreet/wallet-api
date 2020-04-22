<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="http://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="Style.css">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">MoneyClip</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#"><span
						class="glyphicon glyphicon-home"></span> Home</a></li>
				<li><a href="#"><span class="	glyphicon glyphicon-globe"></span>
						About Us</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-envelope"></span>
						Mail Us</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-earphone"></span>
						Call Us</a></li>
			</ul>
		</div>
	</nav>
	<div class="container-fluid bg-info">
		<div
			class="row ">
			<div class="col-md-12">
				<h1>
					<b>WELCOME</b>
				</h1>
				</div>
		</div>
	</div>



	<div class="modal-dialog text-center">
		<div class="col-sm-8 main-section">
			<div class="modal-content">
				<div class="col-12 user-img">
					<img src="img/person.png">
				</div>
				<div class="col-12 user-name">
					<h1> Sign-up</h1>
				</div>
				<div class="col-12 form-input">
					<form action="signup1">
					 <div class="form-group">
							<input type="text" class="form-control"
								placeholder="Enter UserName" id="userName" name="userName" required>
						</div>
					<div class="form-group">
							<input type="text" class="form-control"
								placeholder="Enter Full Name" id="fullName" name="fullName" required>
						</div>
						
						<div class="form-group">
							<input type="password" class="form-control"
								placeholder="Password" id="pass" name="pass" required>
						</div>
						<div class="form-group">
							<input type="number"  class="form-control"
								placeholder="Account Number" id="accNumber" name="accNumber" required>
						</div>
						<div class="form-group">
							<input type="email"  class="form-control"
								placeholder="E-mail" id="eMail"  name="eMail" required>
						<div class="form-group">
							<input type="number" size="10" class="form-control" name="pNumber"
								placeholder="Enter Phone Number" id="pNumber" required>
						</div>
					
					
					
					
					<input type="submit">
</form>
					
				</div>

			</div>
		</div>

	</div>




</body>
</html>