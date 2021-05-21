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
      <form action="searchdbDel" method = "GET">
      CURRENT TABLE<br>
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
        
        search your target table, input target index no. and press 'search'.<br><br>
        <input type="submit" value="search">        
      </form>
      ${delbutton}      
    </section>    
  </body>
</html>