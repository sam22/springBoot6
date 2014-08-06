<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="../../styles/style.css" type="text/css"></link>
</head>
<body>
<h1>Sample ESPN Sports Service - List Athletes for Sport and League</h1>

<h2>Raw Data Retrieved From Rest Service to Generate Page - <a href="http://localhost:8080/athletesPayload/${sport}/${la}">Payload</a></h2>
 	<table  cellspacing='0'>
 	<thead>
 	<tr>
 		<th>Id</th>
 		<th>First Name</th>
 		<th>Last Name</th>
 		<th>Links</th>
 	</tr>
 	</thead>
 	 	<tbody>
	<c:forEach items="${athletes.sports}" var="sports" varStatus="loop">
		<c:forEach items="${sports.leagues}" var="leagues" varStatus="loop2">
			<c:forEach items="${leagues.athletes}" var="athlete" varStatus="loop3">
				<tr  class="${loop3.index % 2 == 0 ? 'even' : 'odd'}">
				<td>${athlete.id}</td>
		    	<td>${athlete.firstName}</td>
		    	<td>${athlete.lastName}</td>
		    	<td>
					<a href="${athlete.links.api.athletes.href}">${athlete.links.api.athletes.href}</a><br/>
					<a href="${athlete.links.api.news.href}">${athlete.links.api.news.href}</a><br/>
					<a href="${athlete.links.api.notes.href}">${athlete.links.api.notes.href}</a><br/>
					<a href="${athlete.links.web.athletes.href}">${athlete.links.web.athletes.href}</a><br/>
					<a href="${athlete.links.mobile.athletes.href}">${athlete.links.mobile.athletes.href}</a><br/>
				</td>
		    	</tr>
	    	</c:forEach>
		</c:forEach>
 	</c:forEach>
   	</tbody>

</table>
</body>
</html>