'use strict';

/* Controllers */

function QuoteCtrl($scope, $http){
    $http.get('/quote/jsonRandom').success(function(data){
        $scope.quote = data;
        }
    );

    $scope.refresh = function(){
        $http.get('/quote/jsonRandom').success(function(data){
                $scope.quote = data;
            }
        );
    }
}
