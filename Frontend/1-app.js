var app = angular.module('myApp', []);

app.controller('MainController', ['$scope', function($scope) {
  $scope.message = "Welcome from the Controller!";
}]);

app.directive('myDirective', function() {
  return {
    restrict: 'E',
    template: '<p>This is a message from the custom directive.</p>'
  };
});
