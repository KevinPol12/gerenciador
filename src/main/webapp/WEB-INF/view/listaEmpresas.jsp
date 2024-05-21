<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.alura.gerenciador.modelo.Empresa, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="logout-parcial.jsp"></c:import>

	Usuario logado: ${ loginUsuario.login } <br><br><br>
	
	<c:if test="${not empty empresa }">
		Empresa ${ empresa } registrada!
		
	</c:if>
	
	Lista de empresas: <br/>

<ul>
	<c:forEach items="${empresas}" var="empresa">
		
		<li> 
		${empresa.nombre} - <fmt:formatDate value="${empresa.fechaAbertura}" pattern="dd/MM/yyyy"/>
		<a href="/gerenciador/entrada?accion=MostrarEmpresa&id=${empresa.id}">Modificar</a>
		<a href="/gerenciador/entrada?accion=EliminarEmpresa&id=${empresa.id}">Eliminar</a>
		
		</li>
		
	</c:forEach>

</ul>

<c:import url="newEmpresaButton.jsp"></c:import>


</body>
</html>