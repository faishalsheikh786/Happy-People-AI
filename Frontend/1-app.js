// Define AngularJS Module
var app = angular.module('myApp', []);

// Controller Definition
app.controller('MainController', ['$scope', function($scope) {
  $scope.message = "Welcome from the Controller!";
}]);

// Directive Definition
app.directive('myDirective', function() {
  return {
    restrict: 'E',
    template: '<p>This is a message from the custom directive.</p>'
  };
});
