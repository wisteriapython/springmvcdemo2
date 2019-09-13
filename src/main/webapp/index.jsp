<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<body>
<h2>登录</h2>
<form action="login" method="post">
    用户名：<input type="text" name="userName">
    密码：<input type="text" name="userPass">
    <input type="submit" value="登录">
</form>
<div id="content">aaaa</div>
<input id="btn1" type="button" value="doAjax"/>
</body>
<script>
    $(function(){
        $("#btn1").click(function(){
            $.ajax({
                url:"doAjax",
                type:"POST",
                success:function(data){
                    $("#content").text(data)
                }
            })
        });
    })
</script>
</html>
