<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 14/12/2020
  Time: 7:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>View Variables</title>
    </head>
    <body>
        <h1>View Variables</h1>
        <%--Search all scopes from request to application--%>
        <%--Comes from the servlet--%>
        Var in request scope: ${message}
        <br/>
        <br/>
        Var from session scope "rectangle":
        <br/>
        Base: ${rectangle.base}
        <br/>
        Height: ${rectangle.height}
        <br/>
        Area: ${rectangle.area}
        <br/>
        <a href="../index.html"> Go to index</a>
    </body>
</html>
