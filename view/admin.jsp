<%@page pageEncoding="UTF-8" contentType="text/html; charset=Windows-31J" %>
<% String path = request.getContextPath(); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J"/>
<link rel="stylesheet" href="<%=path %>/common/div.css"/>
<title>管理者ページ</title>
</head>
<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">

<%@include file="/common/header.jsp"%>

<div class="container">
<h2 align="center">管理者メニュー</h2>


<hr color="#000000"/>
	<div class="clearfix">
		<div class="float-left" style="width: 20%;">
		<p></p>
		</div>
		<div align="center" class="float-left" style="width: 60%;">
			 <h3><a href="<%=path %>/selectAllUser">ユーザー管理</a></h3>
			<h3><a href="<%=path %>/contentPage">コンテンツ管理</a></h3>
			<h3><a href="<%=path %>/view/contentInsert.jsp">広告登録</a></h3>
			<h3><a href="<%=path %>/logout">ログアウト</a></h3>

		</div>
		<div class="float-left" style="width: 20%">
		<p></p>
		</div>
	</div>


</div>
<%@include file="/common/footer.jsp"%>


</body>
</html>
