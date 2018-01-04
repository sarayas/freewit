<%@page pageEncoding="Windows-31J"
	contentType="text/html; charset=Windows-31J"%>
<%
	String path = request.getContextPath();
	ArrayList<Content> contentList = (ArrayList<Content>) request.getAttribute("contentList");
	ArrayList<String> followList = (ArrayList<String>) session.getAttribute("followList");
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
		<title>全てのコンテンツ</title>
		<script type="text/javascript">

		function check(){
			return confirm("コンテンツを削除します。\nよろしいですか。");
		}
		</script>
		</head>
	<body style="background-image: linear-gradient(to top, #D7D2FF 0%, white 100%);">
	<form action="">
	<select name="customers" onchange="showCustomer(this.value)">
	<option value="">Select a customer:</option>
	<option value="sarayas">sarayas</option>
	<option value="sarayaszero ">sarayaszero</option>
	<option value="admin">admin</option>
	</select>
	</form>

	<div id="txtHint">Customer info will be listed here...</div>

	<script>
		function showCustomer(str) {
		  var xhttp;
		  if (str == "") {
		    document.getElementById("txtHint").innerHTML = "";
		    return;
		  }
		  xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		      document.getElementById("txtHint").innerHTML = this.responseText;
		    }
		  };
		  xhttp.open("GET", "/freewit/start", true);
		  xhttp.send();
		}
	</script>

	</body>
</html>
