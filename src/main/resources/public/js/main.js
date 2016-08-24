//Задаем наше приложение, без зависимостей
var app = angular.module("springDemo", []);

app.controller("AppCtrl", function($scope, $http){

    $scope.websites = [];

    $http.get('http://localhost:8080/api/stack').success(function(data){
        $scope.websites = data;
    })
});
