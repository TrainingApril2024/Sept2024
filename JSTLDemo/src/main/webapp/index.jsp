<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<html>
<body>

<c:out value="${1+2}"></c:out>
<c:set var="temp" value="${5}"></c:set>
<c:if test="${temp>10}">
	<h1> temp is greater than 10</h1>
</c:if>
</body>
</html>
