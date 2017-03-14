<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CARS</title>
</head>
<body>
<h1>Todos los cars </h1>
<table>
        <tr>
            <th>matriculaD</th>
            <th>modelo</th>
            <th>fecha matriculacion</th>
            <th>km</th>
            <th>precio</th>
        </tr>
        <c:forEach items="${Cars}" var="cars">
            <tr>
                
                <td><c:out value="${cars.matricula}"></c:out></td>
                
                <td><c:out value="${cars.fechaMatriculacion}"></c:out></td>
                <td><c:out value="${cars.km}"></c:out></td>
                <td><c:out value="${cars.modelo}"></c:out></td>
                <td><c:out value="${cars.precio}"></c:out></td>
                
                <td><a href="editCars?matricula=${cars.matricula}" >edit </a></td>            
            
                
            </tr>
        </c:forEach>
    </table>
    
			<a href ="add">--ADD--</a>		
</body>
</html>