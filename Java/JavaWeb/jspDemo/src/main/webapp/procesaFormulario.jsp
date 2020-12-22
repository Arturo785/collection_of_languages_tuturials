<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 10/12/2020
  Time: 6:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario</title>
</head>
<body>

    <h1>Formulario enviado</h1>

    Usuario: <%= request.getParameter("userKey") %>
    <br/>
    Password: <%= request.getParameter("passwordKey") %>
    <br/>
    <br/>
    <a href="index.jsp"> Inicio </a>

</body>
</html>
