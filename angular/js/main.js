//Задаем наше приложение, без зависимостей
var app = angular.module("angularDemo", []);

//Добавление нового фильтра
app.filter('reverse', function () {
    return function (text) {
        return text.split("").reverse().join("");
    }
});

app.controller("MyController", function ($scope) {

    $scope.data = {
        message: ""
    };

    //Метод возращает перевернутое значение
    $scope.reversedMessage = function (message) {
        return message.split("").reverse().join("");
    }

});