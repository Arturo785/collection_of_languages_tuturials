<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 13/12/2020
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Expresion language</title>
    </head>
    <body>
        <h1>Expression language variables implicitas</h1>
        <ul>
            <li> Nombre de la application: ${pageContext.request.contextPath} </li>
            <li> Navegador del cliente ${header["User-Agent"]} </li>
            <li> Id session: ${cookie.JSESSIONID.value} </li>
            <li> Web server ${pageContext.servletContext.serverInfo} </li>
            <li> Param from index ${param.usuario} </li>
            <li> Param from index ${param["usuario"]} </li>
        </ul>
    </body>
</html>
