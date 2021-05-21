<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA_compatible" content="IE-edge">
    <title>Main</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/main.css">
  </head>
  <body>
    <section class = "wrap">
      <a href="testlist">lists</a>
      <a href="listdbInsert">data input</a>
      <a href="listCreate">create table</a>
      <a href="listFix">fix table</a>
	  <a href="listDel">delete table</a>
      
    </section>
  </body>
</html>

