<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Product</title>
</head>
<body>
<h1>${pageTitle}</h1>
<br>
Title: ${product.title}
<br>
Id: ${product.id}
<br>
Cost: ${product.cost}
<br>

<br>
<a href="${pageContext.request.contextPath}/">Return to the main page</a>
</body>
</html>
