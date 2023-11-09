<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户注册</title>
    <style type="text/css">
        div {
            width: 300px;
            height: 200px;
            margin-left: auto;
            margin-right: auto;
        }
    </style>
</head>
<body>
<div>
    <form action="goreg" method="post">
        <table border="1">
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="username" ></td>
            </tr>
            <tr>
                <td>密&emsp;码:</td>
                <td><input type="password" name="userpwd" ></td>
            </tr>
            <tr>
                <td colspan="2" style="text-align: center;"><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
