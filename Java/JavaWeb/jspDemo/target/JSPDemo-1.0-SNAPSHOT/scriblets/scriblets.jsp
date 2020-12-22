<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 11/12/2020
  Time: 3:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Ejmeplo scriplets</title>
    </head>
    <body>
        <h1>JSP con scriplets</h1>
        <br/>
        <%--Scriplet para el navegador--%>
        <%
            out.print("Saludos desde un Scriplet");
        %>
        <%
            String nombreApp = request.getContextPath();
            out.print(nombreApp);
        %>

        <br/>

        <%--Not good practice--%>

        <%
            if(session != null && session.isNew()){
        %>
        la session es nueva
        <%
            } else{
        %>
        La session no es nueva
        <%  } %>

        <br/>
        <a href="indexScriplets.jsp">Index</a>

    </body>
</html>
