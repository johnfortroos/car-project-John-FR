<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Luna es la mejor!</title>
</head>
<body>
<h1>Todos los productos </h1>
<table>
        <tr>
            <th>ID</th>
            <th>Descripcion</th>
            <th>Precio</th>
            <th>Comprar</th>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                
                <td><c:out value="${product.id}"></c:out></td>
                <td><c:out value="${product.name}"></c:out></td>
                <td><c:out value="${product.price}"></c:out></td>
                <td><a href="AddCarrito?id=${product.id}" >ADD al carrito</a></td>            
            
                
            </tr>
        </c:forEach>
    </table>
</body>
</html>