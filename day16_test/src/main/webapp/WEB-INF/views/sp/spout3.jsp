<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
th,td{
   color: black;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="700px" align="center" >
<tr><th>판매일</th><th>일자별 총 판매액</th></tr>
<c:forEach items="${list}" var="dto">
<tr>
<td>${dto.saledate}</td>
<td>${dto.ptot}</td>
</tr>
</c:forEach>
</table>
</body>
</html>