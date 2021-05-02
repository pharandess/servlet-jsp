<%@ page import="java.util.*" %>
<html>
<body>
	
	<h1> Beer Recommendationd JSP </h1>
	<p>	
	<%
		ArrayList<String> styles =(ArrayList) request.getAttribute("styles");
		
		for(String str:styles){
			out.print("<br>try: " + str);
		}
	
	%>	

</body>
</html>