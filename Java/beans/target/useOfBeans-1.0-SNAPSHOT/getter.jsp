<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 13/12/2020
  Time: 3:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Obtener valores</title>
    </head>
    <body>
        <h1>Leyendo valores</h1>
        <%--If exists uses it otherwise creates a new one--%>
        <jsp:useBean id="rectangle" class="beans.Rectangle" scope="session" />
        <br/>
        <br/>
        Valor base: <jsp:getProperty name="rectangle" property="base"/>
        <br/>
        Valor height: <jsp:getProperty name="rectangle" property="height"/>
        <br/>
        Area: <jsp:getProperty name="rectangle" property="area"/>
        <br/>
        <a href="index.jsp"> Inicio</a>
    </body>
</html>
