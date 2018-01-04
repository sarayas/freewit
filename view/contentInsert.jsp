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
		<title>コンテンツ登録</title>
		<script type="text/javascript">
			function validationForm(){
				var title = document.forms["content"]["title"].value;
				var content = document.forms["content"]["content"].value;
				if(title==""){
					alert("タイトルを入力して下さい。");
					return false;
					}

				if(content==""){
					alert("本文を入力して下さい。");
					return false;
					}
			}
		</script>
	</head>
	<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
		<%@include file="/common/header.jsp"%>
		<div class="container">
		<%
			if (user.getAuthority().equals("1")) {
		%>
		<%@include file="/common/adminMenu.jsp"%>
		<div class="container">
			<h2 align="center">広告登録</h2>
			<%
				} else {
			%> <%@include file="/common/menu.jsp"%>

			<h2 align="center">投稿</h2>
			<%
				}
			%>

			<hr color="#000000" />
			<div class="clearfix">
				<div class="float-left" style="width: 20%;">
				<p></p>
				</div>
				<div align="center" class="float-left" style="width: 60%;">
					<form name="content"
						action="<%=request.getContextPath()%>/contentController" method="post"
						onsubmit="return validationForm()" enctype="multipart/form-data"><br>
						<table align="center">
							<tr>
								<th bgcolor="#B5B4FF" width="100">作成者</th>
								<th><%=user.getId()%></th>
							</tr>
							<tr>
								<th bgcolor="#B5B4FF" width="100">タイトル</th>
								<td><textarea name="title" cols="50" rows="1"></textarea></td>
							</tr>
							<tr>
								<th bgcolor="#B5B4FF" width="100">本文</th>
								<td><textarea name="content" cols="50" rows="10"></textarea></td>
							</tr>
							<tr>
								<th bgcolor="#B5B4FF" width="100">本文</th>
								<td><input type="file" name="attachFile" size="40" /></td>
							</tr>
						</table>
					<input type="hidden" name="cCmd" value="1"></input> <input type="submit"
						value="投稿">
					</form>
				</div>
				<div class="float-left" style="width: 20%">フォローしたユーザー <%
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
