<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>
<%
	String path = request.getContextPath();
%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J" />
		<link rel="stylesheet" href="<%=path%>/common/div.css" />

		<!-- �T�[�u���b�g����n���ꂽ�f�[�^���擾���� -->

		<title>����o�^</title>

		<!-- header, footer�C���N���[�h -->
		<script type="text/javascript">
		function validateForm(){
			var id = document.forms["join"]["id"].value;
			var email = document.forms["join"]["email"].value;

			if(id==""){
				alert("���[�U�[������͂��ĉ������B");
				return false;
				}

			if(email==""){
				alert("���[������͂��ĉ������B");
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
				<h2 align="center">�p�X���[�h�T��</h2>
				</div>
			</div>
			<hr size="1" color="#000000"></hr>

			<h4 align="center">�o�^�������[�U�[���ƁA���[���A�h���X����͂��ĉ������B</h4>
			<h4 align="center">�p�X���[�h�͓o�^����Ă��郁�[���ɓ`������܂��B</h4>

			<br>
			<div align="center"><!-- �V�K�f�[�^�̓��� -->
			<form name="join" action="<%=request.getContextPath()%>/sendPassword"
				method="post" onsubmit="return validateForm()">
			<table align="center">
				<tr>
					<td bgcolor="#B5B4FF" width="150">���[�U�[��</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td bgcolor="#9190FF" width="150">Email</td>
					<td><input type="email" name="email" /></td>
				</tr>
			</table>
			<br>
			<input type="hidden" name="uCmd" value="1" /> <input type="hidden"
				name="link" value="1" /> <input type="submit" value="�o�^" /> <input
				type="button" onclick="location.href='<%=path%>/start'" value="�߂�" />
			</form>
			</div>
		</div>
		<%@include file="/common/footer.jsp"%>
	</body>
</html>