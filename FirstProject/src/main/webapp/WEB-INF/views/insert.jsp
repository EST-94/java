<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>inputs</title>
</head>
<body>
<form style="width : 100%; padding : 20px;" action="insertStu2_action">
	<input type = "text" name = "name" placeholder = "urname?" style = "width:90%; margin: 10px;"/>
	<input type = "text" name = "midscore" placeholder = "urmidscore?" style = "width:90%; margin: 10px;"/>
	<input type = "text" name = "finscore" placeholder = "urfinscore?" style = "width:90%; margin: 10px;"/>
	<input type = "submit" value="complete!"/>

	</form>
<h1>
</h1>

<P>  ${textValue} </P>
</body>
</html>
