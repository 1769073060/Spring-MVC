<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.3.1.min.js"></script>
    <script>
        function a1(){
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"name":$("#name").val()},
                success:function (data) {
                    console.log(data)
                    if (data.toString()=='OK'){
                            $("#userInfo").css('color','green');
                    }else{
                        $("#userInfo").css('color','red');
                    }
                    $("#userInfo").html(data);
                }
            })
        }
        function a2() {
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data: {"pwd":$("#pwd").val()},
                success:function(data){
                    console.log(data)
                }
            })
        }

    </script>

</head>
<body>
账号:<input type="text" id="name" name="name" onblur="a1()">
<span id="userInfo"></span>
密码:<input type="text" id="pwd" name="pwd" onblur="a2()">
<span id="pwdInfo"></span>
</body>
</html>
