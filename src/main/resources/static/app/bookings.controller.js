(function(){
    'use strict';


        angular.module('app')
        .controller('BookingsController',BookingsController);

    BookingsController.$inject= ['$http'];

    function BookingsController($http) {
        var vm = this;
        vm.getAll = getAll;
        vm.getAffordable = getAffordable;
        vm.deleteBooking = deleteBooking;

        vm.bookings = [];
        init();
        function init() {
                getAll();
        }

        function getAll(){
            var url = "/bookings/all";
            var bookingsPromise = $http.get(url);
            bookingsPromise.then(function(response){
                vm.bookings =response.data;
                console.log(vm.bookings);
            });
        }
        
        function getAffordable() {
            var url = "/bookings/affordable/"+200;
            var bookingsPromise = $http.get(url);
            bookingsPromise.then(function(response){
                vm.bookings  =response.data;
            });
            
        }

        function deleteBooking(id){
            var url = "/bookings/delete/"+id;
            $http.post(url).then(function (response) {
                vm.bookings = response.data;
            });
            
        }


    }
})();