<html>
<head>
<title>Home</title>
</head>
<body>
<h2>Welcome Home!</h2>
	<p>
		It is now
		<%= new java.util.Date() %></p>
	<p>
		You are coming from 
		<%= request.getRemoteAddr()  %></p>
<a href="index.jsp" id="login">Go To Login Page</a>
</body>
</html>
