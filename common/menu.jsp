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
		<div id="flip" >���j���[</div>
	<div id="panel">

		<h2>�T�C�g�}�b�v</h2>

		<h4><%=user.getId() %>�̃A�J�E���g�ł��B</h4>

		<p><a href="<%=request.getContextPath() %>/contentPage">�S�ẴR���e���c</a></p>
		<p><a href="<%=request.getContextPath() %>/privatePage">�l�y�[�W</a></p>
		<p><a href="<%=request.getContextPath() %>/view/follow.jsp">�t�H���[�Ǘ�</a></p>
		<p><a href="<%=request.getContextPath() %>/view/userModi.jsp">�l���C��</a></p>
		<p><a href="<%=request.getContextPath() %>/view/contentInsert.jsp">���e</a></p>
		<p><a href="<%=request.getContextPath() %>/logout">���O�A�E�g</a></p>

	</div>

</div>
