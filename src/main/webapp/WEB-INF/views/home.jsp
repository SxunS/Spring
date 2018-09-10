<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" session="false" %>
    <h1><s:message code="spitter.welcome"/></h1>
<%--<h1>Welcome to Spitter</h1>--%>
    <a href="<c:url value="/spittle"/>">Spittles</a>
    <a href="<c:url value="/spittle/register"/>">Register1</a>

