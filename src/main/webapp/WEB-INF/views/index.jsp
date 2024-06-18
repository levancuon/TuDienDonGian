<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/18/2024
  Time: 12:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Từ điển</h2>
<h3>Nhập từ cần tra</h3>
<form action="/dictionary/search" method="post">
<input type="text" placeholder="Nhập từ" name="word">
    <button>Tra</button>
</form>
Nghĩa là : ${mean}
</body>
</html>
