
<%--Al ser dinamicos cada uno tiene su propio servelt asi que es necesario que tenga todos sus datos--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <br/>
        Inclusion de contenido dinamico desde un JSP publico
        <br/>
        Nombre de la app: <%= request.getContextPath() %>
    </body>
</html>
