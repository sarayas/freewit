	<%@page pageEncoding="Windows-31J" contentType="text/html; charset=Windows-31J" %>

<div style="float: left; position: fixed; margin-left: 40;">
<ul>
	<h2>�T�C�g�}�b�v</h2>

		<h4><%=user.getId() %>�l�̃A�J�E���g�ł��B</h4>

	<li><a href="<%=request.getContextPath() %>/view/admin.jsp">�Ǘ��҃��j���[</a></li>
	<li><a href="<%=request.getContextPath() %>/selectAllUser">���[�U�Ǘ�</a></li>
	<li><a href="<%=request.getContextPath() %>/contentPage">�R���e���c�Ǘ�</a></li>
	<li><a href="<%=request.getContextPath() %>/view/contentInsert.jsp">�L���o�^</a></li>
	<li><a href="<%=request.getContextPath() %>/logout">���O�A�E�g</a></li>

</ul>
</div>
