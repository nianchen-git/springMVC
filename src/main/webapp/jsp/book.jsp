<%--
  Created by IntelliJ IDEA.
  User: 86184
  Date: 2020/8/26
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/doAdd" method="post">
        <table>
            <tr>
                <td>书名：</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>作者：</td>
                <td><input type="text" name="author"></td>
            </tr>
            <tr>
                <td>价格：</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>是否上架：</td>
                <td>
                    <input type="radio" value="true" name="ispublic">是
                    <input type="radio" value="false" name="ispublic">否
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="添加">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
