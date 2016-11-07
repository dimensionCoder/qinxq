<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>角色管理</title>
</head>
<body>
<jsp:include page="../component/globalMenu.jsp"/>
<div id="content" ng-app="realmApp" ng-controller="realmCtrl">
    <p ng-init="test()"></p>
</div>
<jsp:include page="../component/footer.jsp"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/realm/realmCtrl.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/realm/realmService.js"></script>
</body>
</html>