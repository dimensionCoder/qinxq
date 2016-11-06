/**
 * Created by qinxq on 2016/11/6.
 */
var indexApp=angular.module("indexService",[]);
indexApp.service('indexService', function() {
    var service={
        test:function(){
            console.log("test angular service");
        },
    }
    return service;
});