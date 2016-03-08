<%-- 
    Document   : lister_films
    Created on : 7 mars 2016, 10:11:02
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
        <div class="contenu">        <h1>${titre}</h1>
            <c:forEach items="${mesFilms}" var="monFilm"> 
                 ${monFilm.titre} <a href="?page=detail_film&idFilm=${monFilm.id}">D&eacute;tail du film</a>
                <br/>
            </c:forEach>
        </div>
        <%-- <c:import url="_PIED.jsp"/> --%>
    </body>
</html>
