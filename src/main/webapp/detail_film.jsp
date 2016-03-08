<%-- 
    Document   : detail_film
    Created on : 7 mars 2016, 12:20:12
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Streaming</title>
        <%--  <c:import url="_CSS.jsp"/> --%>
    </head>
    <body>
       <%-- <c:import url="_TITRE.jsp"/>
        <c:import url="_MENU.jsp"/> --%>
        <div class="contenu">        <h1> Titre : ${monFilm.titre} </h1><br/>
            Ann&eacute;e de Production : ${monFilm.annee} <br/>
            Synopsis : ${monFilm.synopsis} <br/>
            Pays de Production : ${monFilm.pays} <br/>
            Genre : ${monFilm.genre} <br/>
        </div>
        <%-- <c:import url="_PIED.jsp"/> --%>
    </body>
</html>
