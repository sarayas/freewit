<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>
<%
	String path = request.getContextPath();
	ArrayList<String> followList = (ArrayList<String>) session
			.getAttribute("followList");
	User user = (User) session.getAttribute("user");
%>

<%@page import="java.util.ArrayList"%>
<%@page import="dto.User"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J" />
		<link rel="stylesheet" href="<%=path%>/common/div.css" />
		<title>アカウント情報変更</title>

		<script type="text/javascript">
		function validationForm(){
			var email = document.forms["usermodi"]["email"].value;
			var password = document.forms["usermodi"]["password"].value;
			var passwordCheck = document.forms["usermodi"]["passwordCheck"].value;

			if(email==""){
				alert("メールを入力して下さい。");
				return false;
				}
			if(password==""){
				alert("パスワードを入力して下さい。");
				return false;
				}
			if(password!=passwordCheck){
				alert("同じパスワードを入力して下さい。");
				return false;
				}
			}

		</script>
	</head>
	<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
		<%@include file="/common/header.jsp"%>
		<%@include file="/common/menu.jsp"%>
		<div class="container">
			<h2 align="center">アカウント情報変更</h2>
			<hr color="#000000" />
			<div class="clearfix">
				<div class="float-left" style="width: 20%;">
					<p></p>
				</div>
					<div align="center" class="float-left" style="width: 60%;">
						<form name="usermodi" action="<%=request.getContextPath()%>/userController" onsubmit="return validationForm()" method="post" ><br>
							<table align="center">
								<tr>
									<th></th>
									<th>＜＜変更情報＞＞</th>
								</tr>
								<tr>
									<td bgcolor="#B5B4FF" width="200">ユーザー名</td>
									<td><%=user.getId()%></td>
								</tr>
								<tr>
									<td bgcolor="#9190FF" width="200">E-Mail</td>
									<td><input type="email" name="email" /></td>
								</tr>
								<tr>
									<td bgcolor=A3A2FF width="200">パースワード</td>
									<td><input type="password" name="password" /></td>
								</tr>
								<tr>
									<td bgcolor=A3A2FF width="200">パースワード確認</td>
									<td><input type="password" name="passwordCheck" /></td>
								</tr>
							</table>
							<input type="hidden" name="id" value="<%=user.getId()%>"></input> <br />
							<input type="hidden" name="uCmd" value="2"></input> <br />
							<input type="hidden" name="link" value="3"></input> <br />
							<input type="hidden" name="authority" value="2"></input> <br />
							<input type="submit" value="変更完了">
						</form>
					</div>
				<div class="float-left" style="width: 20%">フォローしたユーザー
				<%
					for (int i = 0; i < followList.size(); i++) {
				%>
				<p><%=followList.get(i)%></p>
				<%
					}
				%>
				</div>
			</div>
		</div>
		<%@include file="/common/footer.jsp"%>
	</body>
</html>
