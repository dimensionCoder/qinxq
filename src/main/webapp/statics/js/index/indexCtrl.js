/**
 * Created by qinxq on 2016/11/6.
 */
var indexApp=angular.module("indexApp",[]);
indexApp.controller("indexCtrl",["$scope",function (scope) {
    scope.test=function () {
        console.log("test angular javascript");
    }
}])