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
			var password = document.forms["join"]["password"].value;
			var passwordCheck = document.forms["join"]["passwordCheck"].value;
			var email = document.forms["join"]["email"].value;

			if(id==""){
				var check =confirm("ユーザー名を入力して下さい。");
				return false;
				}

			if(password==""){
				alert("パスワードを入力して下さい。");
				return false;
				}

			if(passwordCheck==""){
				alert("パスワード確認を入力して下さい。");
				return false;
				}

			if(password!=passwordCheck){
				alert("同じメールを入力して下さい");
				return false;
				}

			if(email==""){
				alert("メールを入力して下さい。");
				return false;
				}
			return confirm("ユーザー名「"+id+"」で登録します。\nよろしいですか？");
		}



	</script>
	</head>

	<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
		<%@include file="/common/header.jsp"%>
		<div class="container">
			<div class="clearfix">
				<div class="float-left w100">
				<h2 align="center">新規会員登録</h2>
				</div>
			</div>
			<hr size="1" color="#000000"></hr>
			<br>
			<div align="center"><!-- 新規データの入力 -->
			<form name="join" action="<%=request.getContextPath()%>/userController"
				method="post" onsubmit="return validateForm()">
			<table align="center">
				<tr>
					<td bgcolor="#B5B4FF" width="150">ユーザー名</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td bgcolor="A3A2FF" width="150">パスワード</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td bgcolor="#9190FF" width="150">パスワード確認</td>
					<td><input type="password" name="passwordCheck" /></td>
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