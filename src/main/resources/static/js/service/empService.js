'use strict';
//自定义服务
App.factory('EmpService', ['$http', '$q', function ($http, $q) {

    return {

        fetchAllEmps: function () {
            return $http.get('http://localhost:8099/cms/emp/list')
                .then(
                    function (response) {
                        return response.data.data;
                    },
                    function (errResponse) {
                        return $q.reject(errResponse);
                    }
                );
        },

        createEmp: function (emp) {
            return $http.post('http://localhost:8099/cms/emp/save', emp)
                .then(
                    function (response) {
                        return response.data.data;
                    },
                    function (errResponse) {
                        return $q.reject(errResponse);
                    }
                );
        },

        updateEmp: function (emp) {
            return $http.post('http://localhost:8099/cms/emp/save', emp)
                .then(
                    function (response) {
                        return response.data.data;
                    },
                    function (errResponse) {
                        return $q.reject(errResponse);
                    }
                );
        },

        deleteEmp: function (empId) {
            return $http.delete('http://localhost:8099/cms/emp/del/' + empId)
                .then(
                    function (response) {
                        return response.data.msg;
                    },
                    function (errResponse) {
                        return $q.reject(errResponse);
                    }
                );
        }

    };

}]);
