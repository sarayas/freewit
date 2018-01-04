	<%@page pageEncoding="Windows-31J" contentType="text/html; charset=Windows-31J" %>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("#flip").click(function(){
        $("#panel").slideToggle("slow");
    });
});
</script>

<style>
#panel, #flip {
    padding: 5px;
    text-align: center;
    background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);
    border: solid 1px #c3c3c3;
}

#panel {
    padding: 50px;
    display: none;
}
</style>

<div style="float: left; position: fixed; margin-left: 30; margin-top: 0;">
		<div id="flip" >メニュー</div>
	<div id="panel">

		<h2>サイトマップ</h2>

		<h4><%=user.getId() %>のアカウントです。</h4>

		<p><a href="<%=request.getContextPath() %>/contentPage">全てのコンテンツ</a></p>
		<p><a href="<%=request.getContextPath() %>/privatePage">個人ページ</a></p>
		<p><a href="<%=request.getContextPath() %>/view/follow.jsp">フォロー管理</a></p>
		<p><a href="<%=request.getContextPath() %>/view/userModi.jsp">個人情報修正</a></p>
		<p><a href="<%=request.getContextPath() %>/view/contentInsert.jsp">投稿</a></p>
		<p><a href="<%=request.getContextPath() %>/logout">ログアウト</a></p>

	</div>

</div>
