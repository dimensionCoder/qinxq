<%--
  Created by qinxq on 2016/11/6 18:24
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小游戏</title>
</head>
<body>
<jsp:include page="../component/globalMenu.jsp"/>
<div id="content" ng-app="gameApp" ng-controller="gameCtrl">
    <p ng-init="test()"></p>
</div>
<jsp:include page="../component/footer.jsp"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/game/gameCtrl.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/game/gameService.js"></script>
</body>
</html>
