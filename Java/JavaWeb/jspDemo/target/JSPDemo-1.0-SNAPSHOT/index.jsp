<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 10/12/2020
  Time: 4:02
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Uso de JSP</title>
</head>
<body>
    <h1>Uso de JSP</h1>
        <ul>
            <li> <%  out.print("Hola mundo con scriplets"); %> </li>
            <li> ${"Hola mundo con expression language (EL)"} </li>
            <li> <%= "Hola mundo con expresiones " %> </li>
            <li> <c:out value="Hola mundo con JSTL" /> </li>
        </ul>

    <br/>
    <a href="expresiones.jsp">Link a expresiones</a>
    <br/>
    <br/>
    <a href="scriblets/scriblets.jsp"> Link a scriplets</a>
    <br/>
    <br/>
    <a href="declaraciones/declaracionesIndex.jsp"> Link a declaraciones</a>
    <br/>
    <br/>
    <a href="documentosJSP/JspDocument.jspx"> Link a JSPX</a>
    <br/>
    <br/>
    <a href="reporteExcel/ReporteExcel.jsp"> Link a Excel JSP</a>

    <h4>Formulario HTML</h4>
    <form
        name="form1"
        action="procesaFormulario.jsp"<%--Not a good practice--%>
    >
        Usuario: <input type="text" name="userKey">
        <br>
        Password <input type="password" name="passwordKey">
        <br>
        <input type="submit" value="Enviar">
    </form>

</body>
</html>
