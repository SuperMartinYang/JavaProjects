<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println(path);
System.out.println(basePath);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<style type="text/css">
  		input {
  			height: 30px;
  			width: 150px;
  		}
  		select {
  			height: 30px;
  			width: 150px;
  		}
  		p {
  			width: 100px;
  			align: center;
  		}
  		body {background-image: url("images/back40.gif");}
	</style>
  
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script type="text/javascript">
	function autoSubmit(){
 		document.getElementById("myForm").submit();
	}
	</script>
  <body>
  <!-- Message, Shape, Color, BGColor, X, Y, FTStyle, FTSize -->
    This is my JSP page. <br>
    <form id = "myForm" action="Ttt" method="GET" >
    	<p>click this out</p>
    	<p>Message:</p><input name="Message" value = "Hello world!" onChange="autoSubmit();" /><br />
    	<p>Shape:</p><select name="Shape" onChange="autoSubmit();">
    	<!--  OVAL, RECT and ROUNDRECT -->
    		<option value="OVAL">OVAL</option>
    		<option value="RECT">RECT</option>
    		<option value="ROUNDRECT">ROUNDRECT</option>
    	</select><br />
    	<p>Color:</p><select name="Color" onChange="autoSubmit();">
    	<!-- black, blue, cyan, darkGray, gray, green, lightGray, magenta, orange, pink, red, white, yellow -->
    		<option value = "black">black</option>
    		<option value = "blue">blue</option>
    		<option value = "cyan">cyan</option>
    		<option value = "darkGray">darkGray</option>
    		<option value = "green">green</option>
    		<option value = "lightGray">lightGray</option>
    		<option value = "magenta">magenta</option>
    		<option value = "orange">orange</option>
    		<option value = "pink">pink</option>
    		<option value = "red">red</option>
    		<option value = "white">white</option>
    		<option value = "yellow">yellow</option>
    	</select><br />
    	<p>BGColor:</p><select name="BGColor" onChange="autoSubmit();">
    	<!-- black, blue, cyan, darkGray, gray, green, lightGray, magenta, orange, pink, red, white, yellow -->
    		<option value = "black">black</option>
    		<option value = "blue">blue</option>
    		<option value = "cyan">cyan</option>
    		<option value = "darkGray">darkGray</option>
    		<option value = "green">green</option>
    		<option value = "lightGray">lightGray</option>
    		<option value = "magenta">magenta</option>
    		<option value = "orange">orange</option>
    		<option value = "pink">pink</option>
    		<option value = "red">red</option>
    		<option value = "white">white</option>
    		<option value = "yellow">yellow</option>
    	</select><br />
    	
    	<p>X:</p><input name="X" value = "100" onChange="autoSubmit();"/><br />
    	<p>Y:</p><input name="Y" value = "100"/><br />
    	<p>FTSytle:</p><select name="FTStyle" onChange="autoSubmit();">
    	<!-- REGULAR, BOLD, ITALIC, and BOLD ITALIC  -->
    		<option value ="REGULAR">REGULAR</option>
    		<option value ="BOLD">BOLD</option>
    		<option value ="ITALIC">ITALIC</option>
    		<option value ="BOLD ITALIC">BOLD ITALIC</option>
    	</select><br />
    	<p>FTSize:</p><input name="FTSize" value= "10" onChange="autoSubmit();"/><br /><br>
		<button type="submit">show banner</button>
    </form>
    
    <!-- applet is always 150x300 pixels  -->
    <applet name="graphView" code= "ShowShape.class" width = "150px" height = "300px" hspace = "0" vspace = "0" align = "middle">
    	
	</applet>
  </body>
</html>
