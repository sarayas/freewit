<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>
<%
	String path = request.getContextPath();
	ArrayList<Content> contentList = (ArrayList<Content>) request
			.getAttribute("contentList");
	ArrayList<String> followList = (ArrayList<String>) session
			.getAttribute("followList");
	ArrayList<Coment> comentList = (ArrayList<Coment>) request.getAttribute("comentList");
	User user = (User) session.getAttribute("user");
%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Content"%>
<%@page import="dto.User"%>
<%@page import="dto.Coment"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=Windows-31J" />

		<link rel="stylesheet" href="<%=path%>/common/div.css" />
		<title>個人ページ</title>
		<script type="text/javascript">

		function check(){
			return confirm("コンテンツを削除します。\nよろしいですか。");
		}
		</script>
		</head>
	<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
		<%@include file="/common/header.jsp"%>
		<%@include file="/common/menu.jsp"%>
		<div class="container">
			<h2 align="center">タイムライン</h2>
			<hr color="#000000" />
			<div class="clearfix">
				<div class="float-left"style="width: 20%;">
					<p></p>
				</div>
				<div align="center" class="float-left" style="width: 60%;">
					<table bordercolor="#000000">
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
							<th align="center"><%=content.getId()%></th>
							<th colspan="2"><%=content.getDate()%></th>
						</tr>
						<tr>
							<th bgcolor=#B5B4FF>タイトル</th>
							<td colspan="2" bgcolor="#DAD9FF"><%=content.getTitle()%></td>
						</tr>
						<tr>
						<td colspan="3" align="center"><%if(!content.getFilename().equals("")){ %>
					<img src="<%=path %>/upload/<%= content.getFilename()%>"><br><%}%>
					<%=content.getContent() %>
					</td>
						</tr>

						<%
							if (user.getId().equals(content.getId())) {
						%>
						<tr>
							<td align="center" colspan="3">
					<div class="clearfix">
						<div class="float-left w50">
							<form action="<%=path%>/view/contentModi.jsp" method="post" ><input
								type="hidden" name="idx" value="<%=content.getContentIdx()%>">
							<input type="submit" value="コンテンツ修正"></form>
						</div>
						<div class="float-left w50">
							<form name="delete" action="<%=path%>/contentController" method="post" enctype="multipart/form-data" onsubmit="return check()">
							<input type="hidden" name="idx" value="<%=content.getContentIdx()%>">
							<input type="hidden" name="cCmd" value="3">
							<input type="submit" value="コンテンツ削除"></form>
						</div>
					</div>
					</td>
						</tr>
						<tr>
					<td><%=user.getId() %></td>
					<td>
				<form action="<%=path %>/comentController" method="post">
					<textarea name="coment" cols="55"></textarea>
					<input type="hidden" name="contentIdx" value="<%=content.getContentIdx() %>"/>
					<input type="hidden" name="id" value="<%=user.getId() %>"/>
					<input type="hidden" name="cCmd" value="1"/>
					</td>
					<td><input type="submit" value="コメントを残す"></td>
				</form>
				</tr>
						<%
							}
					for(int j=0; j<comentList.size(); j++){
					Coment coment = comentList.get(j);
					if(coment.getContentIdx().equals(content.getContentIdx())){
					%>
				<tr>
					<td width="20%" bgcolor="#D6C7ED"><%=coment.getId() %></td>
					<td width="60%" bgcolor="#E8D9FF"><%=coment.getContent() %></td>
					<td width="20%" bgcolor="#D6C7ED"><%=coment.getDate() %>

					<%if(user.getId().equals(coment.getId())){ %>
				<form action="<%=path %>/comentController" method="post">
					<input type="hidden" name="contentIdx" value="<%=content.getContentIdx() %>"/>
					<input type="hidden" name="id" value="<%=user.getId() %>"/>
					<input type="hidden" name="coment" value="<%=coment.getContent() %>"/>
					<input type="hidden" name="cCmd" value="2"/>
					<input type="submit" value="削除">
					</form>
					<%} %>
					</td>
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

