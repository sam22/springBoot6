<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h1>Sample ESPN Sports Service - List Teams for Sport and League</h1>
 	<table border="1">
 	<tr>
 		<td>Id</td>
 		<td>Location</td>
 		<td>Name</td>
 		<td>Links</td>
 	</tr>
	<c:forEach items="${sportsTeams.sports}" var="sports" varStatus="loop">
		<c:forEach items="${sports.leagues}" var="leagues" varStatus="loop">
			<c:forEach items="${leagues.teams}" var="team" varStatus="loop">
				<tr>
				<td>${team.id}</td>
		    	<td>${team.location}</td>
		    	<td>${team.name}</td>
		    	<td>
					<a href="${team.links.api.teams.href}">${team.links.api.teams.href}</a><br/>
					<a href="${team.links.api.news.href}">  ${team.links.api.news.href}</a><br/>
					<a href="${team.links.api.notes.href}"> ${team.links.api.notes.href}</a><br/>
					<a href="${team.links.web.teams.href}"> ${team.links.web.teams.href}</a><br/>
					<a href="${team.links.mobile.teams.href}"> ${team.links.mobile.teams.href}</a><br/>
				</td>
		    	</tr>
	    	</c:forEach>
		</c:forEach>
 	</c:forEach>


</table>
</body>
</html>