<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$.ajax{
	
	
}
</script>
</head>
<body>

	<form action='<c:url  value="/memberT" />' method="post">
		<input type="text" name="id"> <input type="text" name="name">
		<button>등록</button>
		<button onclick=listup()>조회</button>
	</form>

</body>
</html>