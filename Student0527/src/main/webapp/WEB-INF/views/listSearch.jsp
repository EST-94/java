<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA_compatible" content="IE-edge">
    <title>SEARCH</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/insert.css">
  </head>
  <body>
    <section class = "wrap">
      <form action="senddbSearch" method="GET">
      search infos with some names
        <label> input name :
          <input type="text" name="name" placeholder="name"><br>
        </label>
        <input type="submit" value="complete">
      </form>
    </section>
     <section class = "wrap">
      <table>
        <thead>
          <tr>
            <th>index</th><th>name</th><th>gender</th><th>address</th><th>category</th><th>fix</th>
          </tr>
          	${list} 
        </tbody>
      </table>
    </section>
  </body>
</html>
