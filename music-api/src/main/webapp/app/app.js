(function(angular) {
	  angular.module("musicApp.controllers", []);
	  angular.module("musicApp.services", []);
	  angular.module("musicApp", ["ngResource", "musicApp.controllers", "musicApp.services"]);
	}(angular));