<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<c:url value="/entrada" var="linkEntradaServlet"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="logout-parcial.jsp"></c:import>


	Usuario logado: ${ loginUsuario.login } <br><br><br>

	<form action=" ${linkEntradaServlet}" method="post">
	
		Nombre Empresa <input type="text" name="nombre" value="${empresa.nombre }">
		Fecha Abertura <input type="text" name="fecha" 
		value="<fmt:formatDate value="${empresa.fechaAbertura}" pattern="dd/MM/yyyy"/>" >
		<input type="hidden" name="id" value="${empresa.id}">
		<input type="hidden" name="accion" value="ModificarEmpresa">
		
		<input type="submit">
		
	</form>

</body>
</html>