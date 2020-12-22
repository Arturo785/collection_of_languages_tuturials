<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 14/12/2020
  Time: 5:24
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>JSTL core</title>
    </head>
    <body>
        <h1>JSTL core (JSP STANDARD TAG LIBRARY)</h1>
        <%--Manupulacion de variables--%>
        <c:set var="nombre" value="Jorge"/>
        <%--Deslegar el valor--%>
        Variable nombre: <c:out value="${nombre}"/>
        <br/>
        <br/>
        Variable con HTML <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <br/>
        <br/>
        <%--Uso de if--%>
        <c:set var="bandera" value="true"/>

        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br/>
        <br/>
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br/>
                    Opcion 1 selec
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br/>
                    Opcion 2 selec
                </c:when>
                <c:otherwise>
                    <br/>
                    Opcion nula
                </c:otherwise>
            </c:choose>
        </c:if>

    </body>
</html>
