<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf8"%>
<html>
<head>
    <title></title>
</head>
<body>
<table border="1">
    <tr>
        <th>ID: ${customer.id}</th>
        <th>Firstname: ${customer.firstname}</th>
        <th>Lastname: ${customer.lastname}</th>
        <th>Age: ${customer.age}</th>
    </tr>
</table>
</body>
</html>
