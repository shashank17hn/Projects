/**
 * Created by shash on 10/23/2016.
 */

var mod = angular.module("clockMod", []);

mod.controller("clockCont", showTime);

function showTime($scope) {

    var curTime = new Date();

    $scope.TimeValue= curTime.toTimeString();
    $scope.updateTime = function () {

        var curTime = new Date();
        $scope.TimeValue= curTime.toTimeString();

    }

}