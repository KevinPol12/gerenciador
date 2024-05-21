<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<c:url value="/entrada" var="linkEntradaServlet"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="entrada?accion=Logout">Salir</a>

	Usuario logado: ${ loginUsuario.login } <br><br><br>

	<form action=" ${linkEntradaServlet}" method="post">
		Nombre Empresa <input type="text" name="nombre">
		Fecha Abertura <input type="text" name="fecha">
		<input type="hidden" name="accion" value="NuevaEmpresa">
		
		<input type="submit">
		
	</form>

</body>
</html>