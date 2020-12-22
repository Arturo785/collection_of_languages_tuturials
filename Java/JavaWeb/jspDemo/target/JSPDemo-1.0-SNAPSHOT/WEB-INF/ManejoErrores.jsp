<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 12/12/2020
  Time: 2:13
  To change this template use File | Settings | File Templates.
--%>

<%@page isErrorPage="true" %>
<%@page import="java.io.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Manejo errores</title>
    </head>
    <body>
        <h1>Manejo de errores</h1>
        <br/>
        Ocurrio una excepcion <%= exception.getMessage() %>
        <br/>
        <textarea cols="30" rows="5">
            <% exception.printStackTrace(new PrintWriter(out)); %>
        </textarea>
    </body>
</html>
