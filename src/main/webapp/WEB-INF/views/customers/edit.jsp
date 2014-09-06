<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf8"%>
<html>
<head>
    <title></title>
</head>
<body>
<form:form method="PUT" action="/customers/${customer.id}">
Firstname:<input type="text" value="${customer.firstname}" name="firstname" /><p>
    Lastname:<input type="text" value="${customer.lastname}" name="lastname" /><p>
    Age:<input type="text" value="${customer.age}" name="age" /><p>
    <input type="submit" value="Send">
    </form:form>
</body>
</html>
