<%--
  Created by IntelliJ IDEA.
  User: Jerry
  Date: 14-3-12
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
        <form action="/qr/generate" method="post">
            <table>
                <tr>
                    <td>CONTENT :</td>
                    <td><input value="" name="contents"/></td>
                </tr>
                <tr>
                    <td>SIZE :</td>
                    <td>
                        <select name="size">
                            <option value="S">S</option>
                            <option value="M">M</option>
                            <option value="L">L</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="提交"/></td>
                </tr>
            </table>
        </form>
</body>
</html>
