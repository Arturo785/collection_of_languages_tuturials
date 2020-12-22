<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 13/12/2020
  Time: 3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1>Jsp que modifica</h1>
        <jsp:useBean id="rectangle" class="beans.Rectangle" scope="session" />
        Modificamos los atributos
        <br/>
        <br/>
        <%
            int baseValue = 5;
            int heightValue = 10;
        %>
        <jsp:setProperty name="rectangle" property="base" value="<%=baseValue%>"/>
        <jsp:setProperty name="rectangle" property="height" value="<%=heightValue%>"/>
        <a href="index.jsp"> Inicio</a>
    </body>
</html>
