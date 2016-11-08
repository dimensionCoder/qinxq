<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<jsp:include page="../component/globalMenu.jsp"/>
123123
12

<div id="content" ng-app="indexApp" ng-controller="indexCtrl">
    <p ng-init="test()"></p>
</div>
<jsp:include page="../component/footer.jsp"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/angular.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/index/indexCtrl.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/index/indexService.js"></script>
</body>
</html>
