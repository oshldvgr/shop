<%--
  Created by IntelliJ IDEA.
  User: strec
  Date: 24.09.2019
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get product</title>
</head>
<body>
<form action="getProduct" method="GET">
    <input type="Long" name="id" placeholder="Enter product ID"/>
    <input type="Submit" value="Show"/>
</form>
<br>

<form action="showAllProducts" METHOD="GET">
    <input type="HIDDEN" name="Find all"/>
    <input type="Submit" value="Show all"/>
</form>
</body>
</html>
