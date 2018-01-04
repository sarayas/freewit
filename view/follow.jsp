<%@page pageEncoding="Windows-31J" contentType="text/html; charset=Windows-31J" %>
<% String path = request.getContextPath();
ArrayList<String> followList = (ArrayList<String>)session.getAttribute("followList");
User user = (User)session.getAttribute("user");
%>

<%@page import="java.util.ArrayList"%>
<%@page import="dto.User"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J"/>
<link rel="stylesheet" href="<%=path %>/common/div.css"/>
<title>フォロー管理</title>
</head>
<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
	<%@include file="/common/header.jsp"%>
	<%@include file="/common/menu.jsp"%>
	<div class="container">
	<h2 align="center">フォロー管理</h2>
<hr color="#000000"/>
	<div class="clearfix">
		<div class="float-left" style="width: 20%;">
		<p></p>
		</div>
		<div align="center" class="float-left" style="width: 60%;">
				<table align="center">
				<%for(int i=0; i<followList.size(); i++){ %>
					<tr>
						<td bgcolor="#B5B4FF" width="200"><%=followList.get(i)%></td>
						<td><form action="<%=path %>/followController" method="post">
						<input type="hidden" name="follow" value="<%=followList.get(i) %>"/>
						<input type="hidden" name="fCmd" value="2"/>
						<input type="submit" value="フォロー解除">
						</form>
						</td>
					</tr>
					<%} %>
				</table>
			<br>
		</div>
		<div class="float-left" style="width: 20%">
		フォローしたユーザーA
		<%for(int i=0; i<followList.size(); i++){ %>
		<p><%=followList.get(i) %></p>
		<%} %>
		</div>
	</div>
</div>

<%@include file="/common/footer.jsp"%>

</body>
</html>
