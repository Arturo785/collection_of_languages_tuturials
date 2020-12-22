<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 10/12/2020
  Time: 6:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>JSP con expresiones</title>
    </head>
    <body>

        Concatenacion <%=  "saludos " + "JSP" %>
        <br/>
        Operacion matematica <%= 2*3/2 %>
        <br/>
        Session id: <%= session.getId() %>
        <br/>
        <br/>
        <a href="index.jsp"> Inicio </a>
    </body>
</html>
