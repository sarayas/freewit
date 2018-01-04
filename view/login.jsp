<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>
<%
	String path = request.getContextPath();
	ArrayList<Content> contentList = (ArrayList<Content>) request
			.getAttribute("contentList");
	ArrayList<Coment> comentList = (ArrayList<Coment>) request.getAttribute("comentList");
%>

<%@page import="java.util.ArrayList"%>
<%@page import="dto.Content"%>
<%@page import="dto.Coment"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J" />

		<link rel="stylesheet" href="<%=path%>/common/div.css" />
		<title>ログイン</title>

		<script type="text/javascript">
		function validationForm(){
		var id = document.forms["login"]["id"].value;
		var password = document.forms["login"]["password"].value;

		if(id==""){
			alert("ユーザー名を入力して下さい。");
			return false;
			}
		if(password==""){
			alert("パスワードを入力して下さい。");
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
					<h2 align="center">ログイン</h2>
				</div>
			</div>
			<hr size="1" color="#000000"></hr>
			<br>
			<div style="width: 60%; margin: 0 auto;" align="center"><!-- 新規データの入力 -->
				<form name="login" action="<%=request.getContextPath()%>/login" method="post" onsubmit="return validationForm()">
					<table align="center">
						<tr>
							<td bgcolor="#B5B4FF" width="100">ユーザー名</td>
							<td><input type="text" name="id" /></td>
						</tr>
						<tr>
							<td bgcolor="#B5B4FF" width="100"">パスワード</td>
							<td><input type="password" name="password" /></td>
						</tr>
					</table>
					<br>
					<a href="<%=path%>/view/join.jsp">新規会員登録はこちらへ</a><br />
					<a href="<%=path%>/view/passwordCheck.jsp">パスワードを忘れた方</a><br />
					<input class="btn-info" type="submit" value="ログイン">
				</form>
				<table class="table" bordercolor="#000000">
					<%
						for (int i = 0; i < contentList.size(); i++) {
							Content content = contentList.get(i);
					%>
					<tr>
						<th width="300" bgcolor="#B5B4FF">
						<p>作 成 者</p>
						</th>
						<th width="300" bgcolor="#B5B4FF" colspan="2">
						<p>作 成 日</p>
						</th>
					</tr>
					<tr>
						<th align="center"><%=content.getId()%>&nbsp;&nbsp;&nbsp;</th>
						<th colspan="2"><%=content.getDate()%></th>
					</tr>
					<tr>
						<th bgcolor="#B5B4FF">タイトル</th>
						<td colspan="2" bgcolor="#DAD9FF"><%=content.getTitle()%></td>
					</tr>
					<tr>
					</tr>
					<tr>
						<td colspan="3" align="center"><%if(!content.getFilename().equals("")){ %>
					<img src="<%=path %>/upload/<%= content.getFilename()%>"><br><%}%>
					<%=content.getContent() %>
					</td>
					</tr>
					<%for(int j=0; j<comentList.size(); j++){
					Coment coment = comentList.get(j);
					if(coment.getContentIdx().equals(content.getContentIdx())){
					%>
				<tr>
					<td width="20%" bgcolor="#D6C7ED"><%=coment.getId() %></td>
					<td width="60%" bgcolor="#E8D9FF"><%=coment.getContent() %></td>
					<td width="20%" bgcolor="#D6C7ED"><%=coment.getDate() %></td>
				</tr>

				<%	}
					}
					%>
					<tr><td colspan="3" bgcolor="#000000"></td></tr>
					<%
					}
						%>
				</table>
		</div>
		<%@include file="/common/footer.jsp"%></div>
	</body>
</html>
