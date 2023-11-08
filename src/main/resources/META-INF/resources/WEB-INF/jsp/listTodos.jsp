<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html> 
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
		<title> Todos Page </title>
	</head>
	
	<body>
		<div class="container">
			<h3>Your Todos are : </h3>
			
			<br><br>
			<table class="table">
	
				<thead>
					<tr>
						<th> Description</th>
						<th> TargetDate</th>
						<th> Done ?</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${todos}">
			    		<tr>
			    			<td>${item.description }</td>
			    			<td>${item.targetDate }</td>
			    			<td>${item.done }</td>
			    			<td> <a href="delete-todo/${item.id }" class="btn btn-danger">Delete</a></td>
			    			<td> <a href="update-todo?id=${item.id }" class="btn btn-warning">Update</a></td>
			    		</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-todo" class="btn btn-success">ADD TODO</a>
		</div>
		<script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	</body>
</html>