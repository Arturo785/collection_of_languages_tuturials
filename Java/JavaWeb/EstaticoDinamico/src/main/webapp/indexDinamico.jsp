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
        <title>Inclusion dinamica</title>
    </head>
    <body>
        <h1>Inclusion dinamica</h1>
        <br/>
        <jsp:include page="paginasDinamicas/recursoPublico.jsp" />
        <br/>
        <jsp:include page="WEB-INF/RecursoPrivado.jsp" >
            <jsp:param name="colorFondo" value="yellow"/>
        </jsp:include>

    </body>
</html>
