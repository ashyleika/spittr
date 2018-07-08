<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Spittle ${spittle.id}</title>
	</head>
	<body>
		<h2>Spittle ${spittle.id}</h2>
		<ul>
			<li>
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
		</ul>
	</body>
</html>