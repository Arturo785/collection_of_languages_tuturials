<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 11/12/2020
  Time: 7:17
  To change this template use File | Settings | File Templates.
--%>

<%--Declaracion de JSP--%>
<%!
    /*Variable con su metodo*/
    private String usuario = "yo";
    private int contadorVisitas = 1;

    public String getUsuario(){
        return this.usuario;
    }

    public int getContadorVisitas(){
        return this.contadorVisitas;
    }
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1> Uso de declaraciones </h1>
        Valor de usuario por medio del atributo <%= this.getUsuario() %>
        <br/>
        Valor de visitas por medio del atributo <%= this.contadorVisitas++ %>
    </body>
</html>
