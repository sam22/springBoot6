<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="../../styles/style.css" type="text/css"></link>
</head>
<body>
<h1>Sample ESPN Sports Service - List Teams for Sport and League</h1>

<h2>Raw Data Retrieved From Rest Service to Generate Page - <a href="http://localhost:8080/teamsPayload/${sport}/${la}">Payload</a></h2>

 	<table  cellspacing='0'>
 	 	<thead>
 	<tr>
 		<th>Id</th>
 		<th>Location</th>
 		<th>Name</th>
 		<th>Links</th>
 	</tr>
 	 	</thead>
 	 	<tbody>
	<c:forEach items="${sportsTeams.sports}" var="sports" varStatus="loop">
		<c:forEach items="${sports.leagues}" var="leagues" varStatus="loop2">
			<c:forEach items="${leagues.teams}" var="team" varStatus="loop3">
				<tr   class="${loop3.index % 2 == 0 ? 'even' : 'odd'}">
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
   	</tbody>

</table>
</body>
</html>