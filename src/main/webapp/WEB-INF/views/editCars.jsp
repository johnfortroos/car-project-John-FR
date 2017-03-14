<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>


<title>edit person</title>
</head>
<body>

	<form:form modelAttribute="cars">
	
		<form:label path="matricula">matricula</form:label>
		<form:input path="matricula" />
		<p>

			<form:label path="fechaMatriculacion">fechaMatriculacion</form:label>
			<form:input path="fechaMatriculacion" />
		<p>


			<form:label path="km">km</form:label>
			<form:input path="km" />
		<p>


			<form:label path="modelo">modelo</form:label>
			<form:input path="modelo" />
		<p>


			<form:label path="precio">precio</form:label>
			<form:input path="precio" />
		<p>

			<button type="submit">
				<i aria-hidden="true"></i> save
			</button>

			<button id="modifyPersonButton" type="button">
				<i  aria-hidden="true"></i>
				modificar
			</button>
	</form:form>





</body>

</html>