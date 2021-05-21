<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA_compatible" content="IE-edge">
    <title>INSERT</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/fixer.css">
  </head>
  <body>
    <section class = "wrap">
      <form action="senddbFix" method="GET">
      CURRENT TABLE<br><br>
       <table>
        <thead>
          <tr>
            <th>index</th><th>name</th><th>middlescore</th><th>finalscore</th>
          </tr>
          	${list} 
        </thead>
        </table>
        <br> TARGETINFO
        <label> target index :
          <input type="text" name="taIdx" placeholder="index"><br>
        </label>

        <br>NEW INPUTS<br>
        <label> input name :
          <input type="text" name="name" placeholder="name"><br>
        </label>
        <label> input middle :
          <input type="text" name="midscore" placeholder="score"><br>
        </label>
        <label> input finals :
          <input type="text" name="finscore" placeholder="score"><br>
        </label>
        <input type="submit" value="complete">
      </form>
    </section>
  </body>
</html>