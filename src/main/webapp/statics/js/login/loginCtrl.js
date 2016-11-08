/**
 * Created by qinxq on 2016/11/7 21:46.
 */
var myApp = angular.module("loginApp", ["loginService"]);
myApp.controller("loginCtrl", ["$scope", "loginService", function (scope, loginService) {
    scope.test = function () {
        console.log("test angular javascript");
        loginService.test();
    }
    scope.login=function () {
        var user={username:scope.username,password:scope.password};
        loginService.login(user,function (data) {
            console.log(data);
        })
    }
}])