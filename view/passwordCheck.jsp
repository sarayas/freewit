<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>
<%
	String path = request.getContextPath();
%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J" />
		<link rel="stylesheet" href="<%=path%>/common/div.css" />

		<!-- サーブレットから渡されたデータを取得する -->

		<title>会員登録</title>

		<!-- header, footerインクルード -->
		<script type="text/javascript">
		function validateForm(){
			var id = document.forms["join"]["id"].value;
			var email = document.forms["join"]["email"].value;

			if(id==""){
				alert("ユーザー名を入力して下さい。");
				return false;
				}

			if(email==""){
				alert("メールを入力して下さい。");
				return false;
				}
		}



	</script>
	</head>

	<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
		<%@include file="/common/header.jsp"%>
		<div class="container">
			<div class="clearfix">
				<div class="float-left w100">
				<h2 align="center">パスワード探し</h2>
				</div>
			</div>
			<hr size="1" color="#000000"></hr>

			<h4 align="center">登録したユーザー名と、メールアドレスを入力して下さい。</h4>
			<h4 align="center">パスワードは登録されているメールに伝送されます。</h4>

			<br>
			<div align="center"><!-- 新規データの入力 -->
			<form name="join" action="<%=request.getContextPath()%>/sendPassword"
				method="post" onsubmit="return validateForm()">
			<table align="center">
				<tr>
					<td bgcolor="#B5B4FF" width="150">ユーザー名</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td bgcolor="#9190FF" width="150">Email</td>
					<td><input type="email" name="email" /></td>
				</tr>
			</table>
			<br>
			<input type="hidden" name="uCmd" value="1" /> <input type="hidden"
				name="link" value="1" /> <input type="submit" value="登録" /> <input
				type="button" onclick="location.href='<%=path%>/start'" value="戻る" />
			</form>
			</div>
		</div>
		<%@include file="/common/footer.jsp"%>
	</body>
</html>