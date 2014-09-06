<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf8"%>
<html>
<head>
    <title></title>
</head>
<body>
<a href="/customers/new">New</a>
<table border="1">
    <c:forEach items="${customerList}" var="customer">
    <tr>
        <td>ID: ${customer.id}</td>
        <td>Firstname: ${customer.firstname}</td>
        <td>Lastname: ${customer.lastname}</td>
        <td>Age: ${customer.age}</td>
        <td><form:form method="DELETE" action="/customers/${customer.id}"><input type="submit" value="Delete"></form:form></td>
        <td><a href="/customers/${customer.id}/edit">Update</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
