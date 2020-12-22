<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SSM 框架整合</title>
</head>
<body>
<div>
    <button onclick="login();">登录</button>
</div>
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.min.js"></script>
<script type="text/javascript">
    function  login(){
        $.ajax({
            type: "post",
            url: "<%=request.getContextPath() %>/chackLogin",
            data:{name:"admin",pwd:"123456"},
            success: function (rsp) {
                window.location.href="<%=request.getContextPath() %>/";
            }
        });
    }
</script>
</body>
</html>