<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of products</title>
</head>
<body>
<h1> List of products</h1>
<ul>
    <c:forEach var="product" items="${productList}">
        <li>Title: ${product.title}
            <br>
            Cost: ${product.cost}
            <br>
            ID: ${product.id}
        </li>
    </c:forEach>
</ul>
</body>
</html>
