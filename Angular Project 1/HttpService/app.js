/**
 * Created by shash on 10/25/2016.
 */
var mod = angular.module("mod",[]);
mod.controller("cont", fetchData);

function fetchData($scope, $http)
{
  $http.get('http://localhost:63342/Web%20Projects/Angular%20Project%201/HttpService/Database.json')
    .success(function(response){
    $scope.rec = response.records;

});
}

// $http.get is the request method to fetch data from any link. In this case there is a JSON file