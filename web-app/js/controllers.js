'use strict';

/* Controllers */

angular.module('quoteApp').controller('QuoteCtrl',
  function QuoteCtrl($scope, $http){

      var loadQuote = function() {
          $http.get('quote/jsonRandom').then(function (res) {
                $scope.quote = res.data;
            }
          );
      }

      $scope.refresh = loadQuote;

      loadQuote();
  }

)
