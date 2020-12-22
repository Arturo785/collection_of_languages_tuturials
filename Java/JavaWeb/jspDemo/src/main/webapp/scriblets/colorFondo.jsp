<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 11/12/2020
  Time: 4:36
  To change this template use File | Settings | File Templates.
--%>
<%
    String fondo = request.getParameter("colorFondo");
    if(fondo == null || fondo.trim().equals("")){
        fondo = "white";
    }
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body bgcolor="<%=fondo%>">
        <br/>
        Color de fondo aplicado: <%= fondo %>
        <br/>
        <a href="indexScriplets.jsp">Index</a>
    </body>
</html>
