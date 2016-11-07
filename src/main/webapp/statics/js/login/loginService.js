/**
 * Created by qinxq on 2016/11/7 21:45.
 */
var loginApp = angular.module("loginService", []);
loginApp.service('loginService', function () {
    var service = {
        test: function () {
            console.log("test angular service");
        },
    }
    return service;
});