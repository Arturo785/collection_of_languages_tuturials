<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 12/12/2020
  Time: 1:31
  To change this template use File | Settings | File Templates.
--%>

<%@page import="utils.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%@page errorPage="../WEB-INF/ManejoErrores.jsp" %>
<%--Inside WEB-INF is private to the user--%>

<%
    String nameFile = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename="+nameFile);
%>

<html>
    <head>
        <title>Reporte excel</title>
    </head>

    <body>
        <h1>Reporte excel</h1>
        <br/>
        <table>
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos Java</td>
                <td>Aprender la sintaxis basica</td>
                <td> <%= Conversiones.format(new Date()) %> </td>
            </tr>
            <tr>
                <td>2. Programacion con JAVA</td>
                <td>Aprender programación con JAVA OPP</td>
          <%--      <td> <%= Conversiones.format(new Date()) %> </td>--%>
                <%--Made to generate an error--%>
                <td> <%= Conversiones.format("500") %> </td>
            </tr>
        </table>
    </body>

</html>
