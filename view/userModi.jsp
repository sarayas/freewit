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
		<title>�A�J�E���g���ύX</title>

		<script type="text/javascript">
		function validationForm(){
			var email = document.forms["usermodi"]["email"].value;
			var password = document.forms["usermodi"]["password"].value;
			var passwordCheck = document.forms["usermodi"]["passwordCheck"].value;

			if(email==""){
				alert("���[������͂��ĉ������B");
				return false;
				}
			if(password==""){
				alert("�p�X���[�h����͂��ĉ������B");
				return false;
				}
			if(password!=passwordCheck){
				alert("�����p�X���[�h����͂��ĉ������B");
				return false;
				}
			}

		</script>
	</head>
	<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
		<%@include file="/common/header.jsp"%>
		<%@include file="/common/menu.jsp"%>
		<div class="container">
			<h2 align="center">�A�J�E���g���ύX</h2>
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
									<th>�����ύX��񁄁�</th>
								</tr>
								<tr>
									<td bgcolor="#B5B4FF" width="200">���[�U�[��</td>
									<td><%=user.getId()%></td>
								</tr>
								<tr>
									<td bgcolor="#9190FF" width="200">E-Mail</td>
									<td><input type="email" name="email" /></td>
								</tr>
								<tr>
									<td bgcolor=A3A2FF width="200">�p�[�X���[�h</td>
									<td><input type="password" name="password" /></td>
								</tr>
								<tr>
									<td bgcolor=A3A2FF width="200">�p�[�X���[�h�m�F</td>
									<td><input type="password" name="passwordCheck" /></td>
								</tr>
							</table>
							<input type="hidden" name="id" value="<%=user.getId()%>"></input> <br />
							<input type="hidden" name="uCmd" value="2"></input> <br />
							<input type="hidden" name="link" value="3"></input> <br />
							<input type="hidden" name="authority" value="2"></input> <br />
							<input type="submit" value="�ύX����">
						</form>
					</div>
				<div class="float-left" style="width: 20%">�t�H���[�������[�U�[
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
