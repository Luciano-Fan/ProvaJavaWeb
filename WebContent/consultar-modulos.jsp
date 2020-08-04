<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page import="br.com.rdevs.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Módulos do Treinamento</title>
</head>
<body>
	<br>
	<h3 style="text-align:center">Módulos do Treinamento</h3>
	<br>
	<table class="table" width="50%">
		<tr>
			<th>
				Nome
			</th>
			<th>
				| Instrutor Titular
			</th>
			<th>
				| Instrutor Auxiliar
			</th>
			<th>
				| Data de Inicio
			</th>
			
		</tr>
		
		<c:forEach var="modulo" items="${modulos}">
				<tr>
					<td><c:out value="${modulo.nome}"></c:out>  </td>
					<td>| <c:out value="${modulo.instrutorTitular}"></c:out>  </td>
					<td>| <c:out value="${modulo.instrutorAuxiliar}"></c:out> </td>
					<td>| <fmt:formatDate value="${modulo.dtInicio}" pattern="dd/MM/yyyy"/></td>
				</tr>
		</c:forEach>
	</table>
</body>
</html>