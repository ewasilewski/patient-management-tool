<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf8"%>
<html>
<head>
    <title></title>
</head>
<body>
<form:form method="POST" action="/customers">
    Firstname:<input type="text" name="firstname" /><p>
    Lastname:<input type="text" name="lastname" /><p>
    Age:<input type="text" name="age" /><p>
    <input type="submit" value="Send">
</form:form>
</body>
</html>
