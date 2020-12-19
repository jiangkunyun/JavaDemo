<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSM 框架整合</title>
</head>
<body>
    <div>${user.id}：${user.username}</div>

    <div>ajax获取数据：<span id="ajaxSpan"></span></div>

    <script src="http://libs.baidu.com/jquery/1.9.0/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $.ajax({
                type: "GET",
                url: "<%=request.getContextPath() %>/getAllUser",
                dataType: "json",
                success: function (rsp) {
                    $('#ajaxSpan').html(JSON.stringify(rsp));
                }
            });
        });
    </script>
</body>
</html>