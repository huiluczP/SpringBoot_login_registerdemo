<%--
  Created by IntelliJ IDEA.
  User: MEC
  Date: 2019/5/29
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <!-- Bootstrap 3.3.6 -->
    <link href="//cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/login.css"/>
    <script language="JavaScript" type="text/javascript">
        function check(){
            var name=document.getElementById("name");
            var pwd=document.getElementById("password");
            var email=document.getElementById("email");
            if(name.value==""){
                alert("用户名不能为空");
                return false;
            }
            else if(pwd.value==""){
                alert("密码不能为空");
                return false;
            }
            else if(email.value.indexOf("@")==-1){
                alert("邮箱格式错误");
                return false;
            }
        }
    </script>
    <style>
        body{
            padding: 50px;
        }
        .main{
            display: block;
            height: auto;
            max-width: 60%;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<div class="page-header">
    <h3 class="text-center">用户注册</h3>
</div>
<h3 style="color: red" class="text-center">${warning}</h3>
<div class="panel panel-default main">
    <div class="panel-body">
        <form action="/register" method="post" onsubmit="return check()">
            <div class="col-sm-8">
                <input type="text" id="name" name="name" class="form-control" placeholder="用户名"/></br>
            </div>
            <div class="col-sm-8">
                <input type="password" id="password" name="password" class="form-control" placeholder="密码"/></br>
            </div>
            <div class="col-sm-8">
                <input type="text" id="email" name="email" class="form-control" placeholder="邮箱"/></br>
            </div>
            <div class="col-sm-8">
                <button class="btn btn-primary" type="submit">注册</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
