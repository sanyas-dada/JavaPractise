<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu list of food</title>
</head>
<body>

   <c:forEach var="items" items="${foodItems}">
   
     ${items}
   </c:forEach>


</body>
</html>