<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 12/12/2020
  Time: 3:36
  To change this template use File | Settings | File Templates.
--%>

<%--Al ser dinamicos cada uno tiene su propio servelt asi que es necesario que tenga todos sus datos--%>

<%
    String colorFondo = request.getParameter("colorFondo");
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body bgcolor="<%=colorFondo%>">
        <br/>
        Hola desde un JSP privado
    </body>
</html>
