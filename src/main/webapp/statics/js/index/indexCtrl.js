/**
 * Created by qinxq on 2016/11/6.
 */
var indexApp=angular.module("indexApp",["indexService"]);
indexApp.controller("indexCtrl",["$scope","indexService",function (scope,indexService) {
    scope.test=function () {
        console.log("test angular javascript");
        indexService.test();
    }
}])