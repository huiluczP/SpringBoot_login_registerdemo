<%--
  Created by IntelliJ IDEA.
  User: MEC
  Date: 2019/5/29
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <!-- Bootstrap 3.3.6 -->
    <link href="//cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/login.css"/>
    <script language="JavaScript" type="text/javascript">
        function check(){
            var name=document.getElementById("name");
            var pwd=document.getElementById("password");
            if(name.value==""){
                alert("用户名不能为空");
                return false;
            }
            else if(pwd.value==""){
                alert("密码不能为空");
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
        <h3 class="text-center">用户登录</h3>
    </div>
    <h3 style="color: red" class="text-center">${warning}</h3>
    <div class="panel panel-default main">
        <div class="panel-body">
            <form action="/login" method="post" onsubmit="return check()">
                <div class="col-sm-8">
                    <input type="text" id="name" name="name" class="form-control" placeholder="用户名"/></br>
                </div>
                <div class="col-sm-8">
                    <input type="password" id="password" name="password" class="form-control" placeholder="密码"/></br>
                </div>
                <div class="col-sm-8">
                    <button class="btn btn-primary">登录</button>
                </div>
            </form>

            <div class="text_right">
                <a href="/register">注册新用户</a>
            </div>
        </div>
    </div>
</body>
</html>
