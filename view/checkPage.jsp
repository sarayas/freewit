<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>

<!-- �G�����b�Z�[�W�ƁA�߂��ʂ̔��f���ׂ̕ϐ����擾 -->
<%
String path = request.getContextPath();
String message = (String)request.getAttribute("message");
%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J" />
		<link rel="stylesheet" href="<%=path %>/common/div.css"/>
		<title>�`�F�b�N�y�[�W</title>

		<!-- header, footer�C���N���[�h -->
	</head>
<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
<%@include file="/common/header.jsp"%>
	<div class="container">
		<br></br>
		<h2 align="center"><%=message %></h2>
		<br>

		<h4 align="center"><a href="<%=request.getContextPath()%>/logout">[���O�C����ʂ�]</a></h4>
		</div>
<%@include file="/common/footer.jsp"%>
	</body>
</html>
