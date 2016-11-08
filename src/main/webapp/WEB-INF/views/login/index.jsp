<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<jsp:include page="../component/globalMenu.jsp"/>
    <div id="content" ng-app="loginApp" ng-controller="loginCtrl">
        <p>请输入用户名{{username}}</p>
        <input type="text" ng-model="username" placeholder="请输入用户名"/>
        <p>请输入密码</p>
        <input type="text" ng-model="password" placeholder="请输入密码">
        <br/>
        <input type="button" value="登录" ng-click="login()"/>
    </div>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/login/loginCtrl.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/login/loginService.js"></script>
</body>
</html>
