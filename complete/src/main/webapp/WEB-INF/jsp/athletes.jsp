<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h1>Sample ESPN Sports Service - List Athletes for Sport and League</h1>
 	<table border="1">
 	<tr>
 		<td>Id</td>
 		<td>First Name</td>
 		<td>Last Name</td>
 		<td>Links</td>
 	</tr>
	<c:forEach items="${athletes.sports}" var="sports" varStatus="loop">
		<c:forEach items="${sports.leagues}" var="leagues" varStatus="loop">
			<c:forEach items="${leagues.athletes}" var="athlete" varStatus="loop">
				<tr>
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


</table>
</body>
</html>