<html> 
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
		<title> Todo Page </title>
	</head>
	
	<body>
		<div class="container">
			<h2>Add Todo Details </h2>
			
			
			<pre>${errorMessage }</pre>
			<form method="post">
				Description: <input type="text" name="description"/>
				<input type="submit" class="btn btn-success" />
			</form>
		</div>
		<script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	</body>
	
</html>