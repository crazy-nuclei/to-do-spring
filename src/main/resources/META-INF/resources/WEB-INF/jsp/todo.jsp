<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html> 
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
		<title> Todo Page </title>
	</head>
	
	<body>
		<div class="container">
			<h2>Add Todo Details </h2>
			
			
			<pre>${errorMessage }</pre>
			<form:form method="post" modelAttribute="todo">
				Description: <form:input type="text" path="description" required="required"/>
							 <form:errors path="description"/>
				<form:input type="hidden" path="id" />
				<form:input type="hidden" path="username" />
				<form:input type="hidden" path="targetDate" />
				<form:input type="hidden" path="done" />
				<input type="submit" class="btn btn-success" />
			</form:form>
		</div>
		<script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	</body>
	
</html>