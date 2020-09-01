<%--
  Created by IntelliJ IDEA.
  User: 86184
  Date: 2020/8/31
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/addStudent" method="post">
        <table>
            <tr>
                <td>学生编号：</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>学生姓名：</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>学生邮箱：</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>学生年龄：</td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
