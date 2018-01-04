	<%@page pageEncoding="Windows-31J" contentType="text/html; charset=Windows-31J" %>

<div style="float: left; position: fixed; margin-left: 40;">
<ul>
	<h2>サイトマップ</h2>

		<h4><%=user.getId() %>様のアカウントです。</h4>

	<li><a href="<%=request.getContextPath() %>/view/admin.jsp">管理者メニュー</a></li>
	<li><a href="<%=request.getContextPath() %>/selectAllUser">ユーザ管理</a></li>
	<li><a href="<%=request.getContextPath() %>/contentPage">コンテンツ管理</a></li>
	<li><a href="<%=request.getContextPath() %>/view/contentInsert.jsp">広告登録</a></li>
	<li><a href="<%=request.getContextPath() %>/logout">ログアウト</a></li>

</ul>
</div>
