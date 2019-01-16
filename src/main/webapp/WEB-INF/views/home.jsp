<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<%-- 컨트롤러에서 전달할 데이터를 받기위해 ${컨트롤러에서 전달한 이름}을 사용한다. --%>
<P>  The time on the server is ${serverTime}. </P> 
<!--jsp에서 컨트롤러로 데이터를 전달하려면 form 태그를 이용  -->
<form method="post" action="<%=request.getContextPath() %>/">  <!-- action="/" 정확히 지정해 주면 기존 데이터 값은 저장안되고 새로운 데이터만 저장됨 -->
	<!-- 전달하려는 데이터가 있는 태그의 속성 name을 입력한다. -->
	<input type="text" name="name">
	<button>제출</button>     <!--자동으로 submit으로 됨 -->
</form>
</body>
</html>
