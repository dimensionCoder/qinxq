/**
 * Created by qinxq on 2016/11/7 23:20.
 */
var myApp = angular.module("realmApp", ["realmService"]);
myApp.controller("realmCtrl", ["$scope", "realmService", function (scope, realmService) {
    scope.test = function () {
        console.log("test angular javascript");
        realmService.test();
    }
}])