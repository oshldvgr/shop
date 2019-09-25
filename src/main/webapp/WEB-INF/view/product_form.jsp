<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1> Add new product</h1>
<br>
<form:form action="processForm" modelAttribute="product" method="post">
    ID: <form:input path="id"/>
    <br>
    Title: <form:input path="title"/>
    <br>
    Cost: <form:input path="cost"/>
    <br>
    <form:hidden path="UUID" value="product.UUID"/>
    <input type="submit" value="Save"/>
</form:form>


</body>
</html>
