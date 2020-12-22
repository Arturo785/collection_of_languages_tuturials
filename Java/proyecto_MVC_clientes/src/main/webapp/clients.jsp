<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 16/12/2020
  Time: 3:11
  To change this template use File | Settings | File Templates.
--%>

<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/c982b46e00.js" crossorigin="anonymous"></script>

        <title>Clients control</title>
    </head>
    <body>
        <%--Header--%>
        <jsp:include page="WEB-INF/pages/commons/header.jsp"/>
        <%--Buttons of navigation--%>
        <jsp:include page="WEB-INF/pages/commons/bottonsNavigation.jsp"/>

        <%--List of clients--%>
        <jsp:include page="WEB-INF/pages/client/clientsList.jsp"/>


        <%--Footer--%>
        <jsp:include page="WEB-INF/pages/commons/footer.jsp"/>


        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </body>
</html>
