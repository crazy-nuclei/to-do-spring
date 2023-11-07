<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html> 
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"/>
		<title> Todos Page </title>
	</head>
	
	<body>
		Your Todos are : 
		
		<br><br>
		<table>

			<thead>
				<tr>
					<th>Id </th>
					<th> Description</th>
					<th> TargetDate</th>
					<th> Done ?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${todos}">
		    		<tr>
		    			<td>${item.id }</td>
		    			<td>${item.description }</td>
		    			<td>${item.targetDate }</td>
		    			<td>${item.done }</td>
		    		</tr>
				</c:forEach>
			</tbody>
		</table>
		<script type="text/javascript" src="webjars/jquery/3.6.0/jquery.min.js"></script>
		<script type="text/javascript" src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	</body>
</html>