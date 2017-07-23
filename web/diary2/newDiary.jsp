<%--
  Created by IntelliJ IDEA.
  User: handong
  Date: 2017/7/23
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>今日迹</title>
</head>
<style>
    /* table 样式 */
    table {
        border-top: 1px solid #ccc;
        border-left: 1px solid #ccc;
    }
    table td,
    table th {
        border-bottom: 1px solid #ccc;
        border-right: 1px solid #ccc;
        padding: 3px 5px;
    }
    table th {
        border-bottom: 2px solid #ccc;
        text-align: center;
    }

    /* blockquote 样式 */
    blockquote {
        display: block;
        border-left: 8px solid #d0e5f2;
        padding: 5px 10px;
        margin: 10px 0;
        line-height: 1.4;
        font-size: 100%;
        background-color: #f1f1f1;
    }

    /* code 样式 */
    code {
        display: inline-block;
        *display: inline;
        *zoom: 1;
        background-color: #f1f1f1;
        border-radius: 3px;
        padding: 3px 5px;
        margin: 0 3px;
    }
    pre code {
        display: block;
    }

    /* ul ol 样式 */
    ul, ol {
        margin: 10px 0 10px 20px;
    }
</style>
<body>
<div id="editor">
    <p>欢迎使用 <b>wangEditor</b> 富文本编辑器</p>
</div>
<button id="btn1">获取html</button>
<!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
<script type="text/javascript" src="../webTools/richTextEditor/wangEditor.min.js"></script>
<script type="text/javascript">
    var E = window.wangEditor
    var editor = new E('#editor')
    // 或者 var editor = new E( document.getElementById('#editor') )
    editor.create()
    document.getElementById('btn1').addEventListener('click', function () {
        // 读取 html
        alert(editor.txt.html())
    }, false)

    document.getElementById('btn2').addEventListener('click', function () {
        // 读取 text
        alert(editor.txt.text())
    }, false)
</script>

</body>
</html>
