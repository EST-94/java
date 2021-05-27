<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
      <a href="showlist">lists</a>
      <a href="listCreate">create table</a>
      <a href="listdbInsert">data input</a>
	  <a href="listDel">delete table</a>
	  <a href="listsearch">search table (미구현)</a>
	  
    </section>
  </body>
</html>

