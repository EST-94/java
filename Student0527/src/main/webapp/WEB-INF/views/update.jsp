<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>new data insert</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/insert.css'>
</head>
<body>
    <section class="wrap">
        <form action="update_send">
            <input type="hidden" name="idx" value="${idx }" />
            <label> name : 
                <input type="text" name="name" placeholder="이름" value="${name }" />
            </label>
            <label> gender : 
                <input type="text" name="gender" placeholder="성별" value="${gender }" />
            </label>
            <label> address : 
                <input type="text" name="address" placeholder="주소" value="${address }" />
            </label>
            <label> category : 
                <input type="text" name="category" placeholder="부서" value="${category }" />
            </label>
            <input type="submit" value="complete" />
        </form>
    </section>
</body>
</html>