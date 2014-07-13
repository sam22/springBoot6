<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Sample ESPN Sports Service - List Sports</h1>
	<br/>
	<h2>Raw Data Retrieved From Rest Service to Generate Page - <a href="http://api.espn.com/v1/sports?apikey=s6jqaabp8449btdemqm34qxt">Payload</a></h2>
 	<table table border="1">
 	<tr>
 		<td><h2>Name</h2></td>
 		<td><h2>ID</h2></td>
 		<td><h2>Teams</h2></td>
 		<td><h2>Athletes</h2></td>
 		<td><h2>Additional Links</h2></td>
 	</tr>
	<c:forEach items="${sportsListing.sports}" var="item" varStatus="loop">
	    <tr>
	    	<td>${item.name}</td>
	    	<td>${item.id}</td>
			<td>
				<table border="1" width="100%">
				<c:set var="leagueName" scope="session" value="${item.name}"/>
				<c:forEach items="${item.leagues}" var="leagues" varStatus="loop">
					<tr>
						<td><h3><a href="http://localhost:8080/sports/${leagueName}/${leagues.abbreviation}">${leagues.name}</a></h3></td>
					</tr>

					<tr>
						<td colspan="2">
							<table border ="1"  width="100%">
								<tr>
									<td>Base URL To Get Teams: </td>
									<td>http://api.espn.com/v1/sports/</td>
									<td><a href="http://localhost:8080/sports/${leagueName}/${leagues.abbreviation}">Get Teams</a>	</td>							
								</tr>
								<tr>
									<td>Parameter 1 from Payload: </td>
									<td>sports.name</td>
									<td>value: ${leagueName}</td>
								</tr>
								<tr>
									<td>Parameter 1 from Payload: </td>
									<td>sports.name.leagues[i].abbreviation</td>
									<td>value: ${leagues.abbreviation}</td>
								</tr>
								<tr>
									<td>Constructed URL: </td>
									<td>http://api.espn.com/v1/sports/${leagueName}/${leagues.abbreviation}/teams</td>
								</tr>
							</table>
							
						</td>
					</tr>
					<br/>

				 </c:forEach>
				 </table>
			</td>
			<td>
				<table border="1" width="100%">
				<c:set var="leagueName" scope="session" value="${item.name}"/>
				<c:forEach items="${item.leagues}" var="leagues" varStatus="loop">
					<tr>
						<td><h3><a href="http://localhost:8080/sports/${leagueName}/${leagues.abbreviation}">${leagues.name}</a></h3></td>
					</tr>

					<tr>
						<td colspan="2">
							<table border ="1"  width="100%">
								<tr>
									<td>Base URL To Get Teams: </td>
									<td>http://api.espn.com/v1/sports/</td>
									<td><a href="http://localhost:8080/athletes/${leagueName}/${leagues.abbreviation}">Get Athletes</a>	</td>							
								</tr>
								<tr>
									<td>Parameter 1 from Payload: </td>
									<td>sports.name</td>
									<td>value: ${leagueName}</td>
								</tr>
								<tr>
									<td>Parameter 1 from Payload: </td>
									<td>sports.name.leagues[i].abbreviation</td>
									<td>value: ${leagues.abbreviation}</td>
								</tr>
								<tr>
									<td>Constructed URL: </td>
									<td>http://api.espn.com/v1/athletes/${leagueName}/${leagues.abbreviation}/teams</td>
								</tr>
							</table>
							
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


</table>
</body>
</html>