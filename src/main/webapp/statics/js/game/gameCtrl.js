/**
 * Created by qinxq on 2016/11/6 20:59.
 */
var gameApp = angular.module("gameApp", ["gameService"]);
gameApp.controller("gameCtrl", ["$scope", "gameService", function (scope, gameService) {
    scope.test = function () {
        console.log("test angular javascript");
        gameService.test();
    }
}])