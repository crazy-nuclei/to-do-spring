<html> 
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
		<title> Login Page </title>
	</head>
	
	<body>
		<div class="container">
			<h2>Welcome to Login Page </h2>
			
			
			<pre>${errorMessage }</pre>
			<form method="post">
				Name: <input type="text" name="name"/>
				Password: <input type="password" name="password" />
				<input type="submit" />
			</form>
		</div>
		<script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	</body>
	
</html>