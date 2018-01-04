<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>
<%
	String path = request.getContextPath();
	ArrayList<User> userList = (ArrayList<User>) request
			.getAttribute("userList");
	User user = (User) session.getAttribute("user");
%>

<%@page import="java.util.ArrayList"%>
<%@page import="dto.User"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J" />
		<link rel="stylesheet" href="<%=path%>/common/div.css" />
		<title>ユーザー管理</title>
		<script type="text/javascript">

		function check(){

			var id = document.forms["delete"]["id"];
			return confirm("ユーザー「"+id+"」を削除します。<br>よろしいですか。");
		}
		</script>
	</head>
	<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
		<%@include file="/common/header.jsp"%>
		<%@include file="/common/adminMenu.jsp"%>
		<div class="container">
		<h2 align="center">ユーザー管理</h2>
		<hr color="#000000" />
			<div class="clearfix">
				<div class="float-left" style="width: 20%;">
					<p></p>
				</div>
				<div align="center" class="float-left" style="width: 60%;">
					<table align="center">
						<tr>
							<th>ユーザー目録</th>
							<th>利用状態</th>
							<th>ユーザーメール</th>

						</tr>
						<%
							for (int i = 0; i < userList.size(); i++) {
								User userObj = userList.get(i);
						%>
						<tr>
							<td bgcolor="#B5B4FF" width="150"><%=userObj.getId()%></td>
							<td bgcolor="#B5B4FF" width="120" align="center">
							<%
					 		if (userObj.getAuthority().equals("3")) {
					 		%>
							【利用停止中】
							<%
								}else{
							%>
							【利用中】
							<%} %>
							</td>

							<td bgcolor="#B5B4FF" width="200"><%=userObj.getEmail()%></td>

							<%
								if (userObj.getAuthority().equals("2")) {
							%>
							<td>
							<form action="<%=path%>/userController" method="post"><input
								type="hidden" name="id" value="<%=userObj.getId()%>"> <input
								type="hidden" name="password" value="<%=userObj.getPassword()%>">
							<input type="hidden" name="email" value="<%=userObj.getEmail()%>">
							<input type="hidden" name="authority" value="3"> <input
								type="hidden" name="link" value="2"> <input type="hidden"
								name="uCmd" value="2"> <input type="submit" value="利用停止" /></form>
							</td>
							<%
								}
							%>
							<%
								if (userObj.getAuthority().equals("3")) {
							%>
							<td>
							<form action="<%=path%>/userController" method="post"><input
								type="hidden" name="id" value="<%=userObj.getId()%>"> <input
								type="hidden" name="password" value="<%=userObj.getPassword()%>">
							<input type="hidden" name="email" value="<%=userObj.getEmail()%>">
							<input type="hidden" name="authority" value="2"> <input
								type="hidden" name="link" value="2"> <input type="hidden"
								name="uCmd" value="2"> <input type="submit" value="停止解除" /></form>
							</td>
							<%
								}
							%>
							<%
								if (!userObj.getAuthority().equals("1")) {
							%>
							<td>
							<form name="delete" action="<%=path%>/userController" method="post" onsubmit="return check()">
							<input type="hidden" name="id" value="<%=userObj.getId()%>">
							<input type="hidden" name="password" value="<%=userObj.getPassword()%>">
							<input type="hidden" name="email" value="<%=userObj.getEmail()%>">
							<input type="hidden" name="authority"
								value="<%=userObj.getAuthority()%>"> <input type="hidden"
								name="uCmd" value="3"> <input type="hidden" name="link"
								value="2"> <input type="submit" value="ユーザ削除" />
							</form>
							</td>
							<%
								}
							%>
						</tr>
						<%
							}
						%>
					</table>
					<br>
				</div>
			<div class="float-left" style="width: 20%">
			<p></p>
			</div>
			</div>
		</div>
		<%@include file="/common/footer.jsp"%>
	</body>
</html>
