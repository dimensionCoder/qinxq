/**
 * Created by qinxq on 2016/11/7 21:45.
 */
var loginApp = angular.module("loginService", []);
loginApp.service('loginService', ["$http",function ($http) {
    var service = {
        test: function () {
            console.log("test angular service");
        },
        login:function (user,callback) {
            $http({method:"POST",url:"user/login",data:user},function(data){
                callback(data);
            })
        }
    }
    return service;
}]);