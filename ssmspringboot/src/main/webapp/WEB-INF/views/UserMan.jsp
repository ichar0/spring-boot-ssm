<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>hhhhhhhhh</h1>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${user}" var="u" varStatus="st">
        <tr>
            <td>${u.id}</td>
            <td>${u.name}</td>
        </tr>
    </c:forEach>
</table>