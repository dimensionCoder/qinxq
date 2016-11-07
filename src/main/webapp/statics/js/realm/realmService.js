/**
 * Created by qinxq on 2016/11/7 23:19.
 */
var realmApp = angular.module("realmService", []);
realmApp.service('realmService', function () {
    var service = {
        test: function () {
            console.log("test angular service");
        },
    }
    return service;
});