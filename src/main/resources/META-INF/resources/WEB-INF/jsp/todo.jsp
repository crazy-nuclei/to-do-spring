<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html> 
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
		<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet"/>
		<title> Todo Page </title>
	</head>
	
	<body>
		<div class='container'>
			<h2>Add Todo Details </h2>
			
			
			<form:form method="post" modelAttribute="todo">
				
				<fieldset class="mb-3" >
					<form:label path="description">Description</form:label>
					<form:input type="text" path="description" required="required"/>
					<form:errors path="description" cssClass="text-warning"/>
				</fieldset>
				
				<fieldset class="mb-3" >
					<form:label path="targetDate">Target Date</form:label>
					<form:input type="text" path="targetDate" required="required"/>
					<form:errors path="targetDate" cssClass="text-warning"/>
				</fieldset>
				
				<form:input type="hidden" path="id" />
				<form:input type="hidden" path="username" />
				<form:input type="hidden" path="done" />
				<input type="submit" class="btn btn-success" />
			</form:form>
		</div>
		<script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
		<script>
		    $(document).ready(function () {
		        $('#targetDate').datepicker({
		            format: 'dd-mm-yyyy'
		        });
		    });
		</script>
	</body>
	
</html>