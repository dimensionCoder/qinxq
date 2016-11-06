/**
 * Created by qinxq on 2016/11/6 20:57.
 */
var gameApp = angular.module("gameService", []);
gameApp.service('gameService', function () {
    var service = {
        test: function () {
            console.log("test angular service");
        },
    }
    return service;
});