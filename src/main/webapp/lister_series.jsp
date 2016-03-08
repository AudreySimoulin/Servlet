<%-- 
    Document   : lister_series
    Created on : 8 mars 2016, 11:33:28
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<body>
    <div class="contenu">        <h1>${titre}</h1>
        <c:forEach items="${mesSeries}" var="maSerie"> 
            ${maSerie.titre} <a href="?page=detail_serie&idSerie=${maSerie.id}">D&eacute;tail de la S&eacute;rie</a>
            <br/>
        </c:forEach>
    </div>
</body>

