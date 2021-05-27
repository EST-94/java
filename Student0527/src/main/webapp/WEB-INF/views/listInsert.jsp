<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA_compatible" content="IE-edge">
    <title>INSERT</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/insert.css">
  </head>
  <body>
    <section class = "wrap">
      <form action="senddbInsert" method="GET">
        <label> input name :
          <input type="text" name="name" placeholder="name"><br>
        </label>
        <label> input gender :
          <input type="text" name="gender" placeholder="gender"><br>
        </label>
        <label> input address :
          <input type="text" name="address" placeholder="address"><br>
        </label>
         <label> input category :
          <input type="text" name="category" placeholder="category"><br>
        </label>
        <input type="submit" value="complete">
      </form>
    </section>
  </body>
</html>
