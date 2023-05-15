var app = angular.module('calculatorApp', []);
app.controller('calculatorCtrl', function($scope) {
  $scope.calculate = function() {
    var num1 = parseFloat($scope.num1);
    var num2 = parseFloat($scope.num2);
    var operator = $scope.operator;
    switch(operator) {
      case '+':
        $scope.result = num1 + num2;
        break;
      case '-':
        $scope.result = num1 - num2;
        break;
      case '*':
        $scope.result = num1 * num2;
        break;
      case '/':
        $scope.result = num1 / num2;
        break;
      default:
        $scope.result = "";
    }
  };
});