<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" href="../../styles/style.css" type="text/css"></link>
</head>
<body>
	<h1>Sample ESPN Sports Service - List Sports</h1>
	<br/>
	<h2>Raw Data Retrieved From Rest Service to Generate Page - <a href="http://localhost:8080/payload">Payload</a></h2>
 	<table cellspacing='0'>
 	<thead>
 	<tr>
 		<th><h2>Name</h2></th>
 		<th><h2>ID</h2></th>
 		<th><h2>Get Teams</h2></th>
 		<th><h2>Get Athletes</h2></th>
 		<th><h2>Additional Links</h2></th>
 	</tr>
 	</thead>
 	<tbody>
	<c:forEach items="${sportsListing.sports}" var="item" varStatus="loop">
	    <tr class="${loop.index % 2 == 0 ? 'even' : 'odd'}">
	    	<td>${item.name}</td>
	    	<td>${item.id}</td>
			<td>
				<table cellspacing='0' width="100%">
				<c:set var="leagueName" scope="session" value="${item.name}"/>
				<c:forEach items="${item.leagues}" var="leagues" varStatus="loop">
					<tr>
						<td>
							<h3>Get <a href="http://localhost:8080/sports/${leagueName}/${leagues.abbreviation}">${leagues.name}</a> Teams</h3><br/>
							<b>URL:</b> http://api.espn.com/v1/sports/${leagueName}/${leagues.abbreviation}  <br/>
							<b>URI Template:</b> http://api.espn.com/v1/sports/{sport}/{abbreviation}/teams
						</td>
					</tr>

				 </c:forEach>
				 </table>
			</td>
			<td>
				<table cellspacing='0' width="100%">
				<c:set var="leagueName" scope="session" value="${item.name}"/>
				<c:forEach items="${item.leagues}" var="leagues" varStatus="loop">
					<tr>
						<td><h3>Get <a href="http://localhost:8080/athletes/${leagueName}/${leagues.abbreviation}">${leagues.name}</a> Athletes</h3>
						<b>URL:</b> http://api.espn.com/v1/sports/${leagueName}/${leagues.abbreviation}/athletes <br/>
						<b>URI Template:</b> http://api.espn.com/v1/sports/{sport}/{abbreviation}/athletes
						</td>
					</tr>
					<br/>
				 </c:forEach>
				 </table>
			</td>
			<td>
				<a href="${item.links.api.news.href}">${item.links.api.news.href}</a><br/>
				<a href="${item.links.api.notes.href}">${item.links.api.notes.href}</a><br/>
				<a href="${item.links.api.headlines.href}">${item.links.api.headlines.href}</a><br/>
				<a href="${item.links.api.events.href}">${item.links.api.events.href}</a><br/>
			</td>
    	</tr>
 </c:forEach>
</tbody>

</table>
</body>
</html>