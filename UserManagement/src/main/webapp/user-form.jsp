<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
	<title>Jsp page</title>
	
	<style>
	
	table, th, td {
  border: 1px solid;
   border-collapse: collapse;
 border-color:green;
}
	
	</style>
</head>

<body>

<h1 style="align:center"> User Management syatem </h1>
	
	<div>
	
	<form action="#" method="post" >
	
	<div  style="align:center">   
	<label>User Name </label>
	
	<input type="text" name="name"/><br><br>
<label>User Email</label>
<input type="email" name="email"/><br><br>

<label>User country</label>
<input type="text" name="country"/><br><br><br>

<input type="submit" value="submit">
	
	
	</form>
	
	</div>
	
	<center>
	<div>
	

	<table >
	<thead  >
	<tr>
	        <td> Sr.no </td>
	          <td> User Name </td>
	            <td> User email </td>
	              <td> User Country </td>
	              <td>  Edit   </td>
	              <td>  Delete  </td>
	        
	</tr>
	</thead>
	
	<tbody >
	
	<tr>
	<td>  </td>
	<td>  </td>
	<td>  </td>
	<td>  </td>
	<td>  </td>
	<td>  </td>
	
	</tr>
	
	</tbody>
	
	
	</table>
	
	
	</div>
	</center>
</body>

</html>