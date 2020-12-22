<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 12/12/2020
  Time: 3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <h1>Ejemplo de inclusion estatica</h1>
        <br/>
        <ul>
            <%--De forma estatica--%>
            <l> <%@include file="paginas/noticias1.html" %> </l>
            <l> <%@include file="paginas/noticias2.jsp" %> </l>
        </ul>

        <br/>
        <a href="indexDinamico.jsp" > Ir a index dinamico</a>

    </body>
</html>
