<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA_compatible" content="IE-edge">
    <title>UPDATE</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/insert.css">
  </head>
  <body>
    <section class = "wrap">
      <form action="testupdate_send" method="GET">
        <label> target idx :
          <input type="text" name="idx" placeholder="idx"><br><br>
        </label>
        <label> input name :
          <input type="text" name="name" placeholder="name"><br>
        </label>
        <label> input midSc :
          <input type="text" name="midscore" placeholder="midscore"><br>
        </label>
        <label> input finSc :
          <input type="text" name="finscore" placeholder="finscore"><br>
        </label>
        <input type="submit" value="complete">
      </form>
      
      <form action=" " method="GET">
      <input type = "submit" value = "back to main page"> 
      </form>
    </section>
  </body>
</html>