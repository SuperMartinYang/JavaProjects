<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="BadgeServlet" method="post">
		Message: <input type="text" name="msg" /> <br /> <input type="submit"
			value="Submit" />
	</form>


	The reason many of you cannot find class path is because something wrong with following path (compiled files location).
	Check whether you applet class/jar existed in the following path. <br />
	Absolute Path is:
	<%=getServletContext().getRealPath("/")%> <br />
	<applet code="MyBadgeApplet.class" width=1000 height=800>
		<param name="msg" value="${Params.getMsg()}" />
	</applet>

</body>
</html>