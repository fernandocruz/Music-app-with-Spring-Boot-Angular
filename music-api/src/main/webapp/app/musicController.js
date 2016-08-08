(function(angular) {
  var MusicController = function($scope, Music) {

    $scope.addMusic = function(newMusic) {
      new Music({
        name: newMusic.name,
        group: newMusic.group,
        duration: newMusic.duration
      }).$save();
      $scope.newMusic = new Music({
        name: "",
        group: "",
        duration: ""
      });
    };

    $scope.findByName = function(name) {
      var returnedMusics = Music.findByName({name:name}, function(response){
        $scope.musics = response
        $scope.name = ""
      });
    };

  };

  MusicController.$inject = ['$scope', 'Music'];
  angular.module("musicApp.controllers").controller("MusicController", MusicController);
}(angular));
