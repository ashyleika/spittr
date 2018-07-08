<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Spittles</title>
	</head>
	<body>
		<h2>Last Spittles</h2>
		<ul>
			<c:forEach items="${spittles}" var="spittle">
				<li id="spittle_<c:out value="spittle.id"/>">
					<div>
						<c:out value="${spittle.id}"/>
					</div>
					<div class="spittleMessage">
						<c:out value="${spittle.message}"/>
					</div>
					<div>
						<span class="spittleTime"><c:out value="${spittle.time}"/></span>
						<span class="spittleLocation">
							(<c:out value="${spittle.latitude}"/>,
							<c:out value="${spittle.longitude}"/>)
						</span>
					</div>
				</li>	
			</c:forEach>
		</ul>
	</body>
</html>