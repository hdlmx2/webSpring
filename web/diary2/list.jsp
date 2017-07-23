<%--
  Created by IntelliJ IDEA.
  User: handong
  Date: 2017/7/22
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        h2 {
            color: green;
        }
    </style>
</head>
<body>
<h2>日记</h2>
<p>ID：${diary.diaryId}</p>
<p>Title：${diary.title}</p>
<p>Context：${diary.diaryBody}</p>
<p>Time：${diary.createTime}</p>
</body>
</html>
