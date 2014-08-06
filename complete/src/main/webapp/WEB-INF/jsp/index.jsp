<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="../../styles/style.css" type="text/css"></link>
</head>
<body>
	<h1>Sample ESPN Index Service</h1>
 	<table cellspacing='0'>
 	<thead>
 	<tr>
 		<th colspan="3">Index Service</td>
 	</tr>
 	</thead>
 	<tbody>
 	 <tr>
 		<td><h2>Description</h2></td>
 		<td><h2>URL</h2></td>
 		<td><h2>Rest Example</h2></td>
 	</tr>
    <tr>
    	<td>Get Sports</td>
    	<td><a href="${index}">${index}</a></td>
    	<td><a href="${sports}">${sports}</a></td>
   	</tr>
   	<tbody>
</table>
</body>
</html>