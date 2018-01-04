<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>

<!-- エラメッセージと、戻る画面の判断を為の変数を取得 -->
<%
String path = request.getContextPath();
String message = (String)request.getAttribute("message");
%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J" />
		<link rel="stylesheet" href="<%=path %>/common/div.css"/>
		<title>チェックページ</title>

		<!-- header, footerインクルード -->
	</head>
<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
<%@include file="/common/header.jsp"%>
	<div class="container">
		<br></br>
		<h2 align="center"><%=message %></h2>
		<br>

		<h4 align="center"><a href="<%=request.getContextPath()%>/logout">[ログイン画面へ]</a></h4>
		</div>
<%@include file="/common/footer.jsp"%>
	</body>
</html>
