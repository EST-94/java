<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA_compatible" content="IE-edge">
    <title>lists</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/list.css">
  </head>
  <body>
    <section class = "wrap">
      <table>
        <thead>
          <tr>
            <th>index</th><th>name</th><th>middlescore</th><th>finalscore</th>
          </tr>
          	${list} 
        </tbody>
      </table>
    </section>
  </body>
</html>