(function(angular) {
  var MusicFactory = function($resource) {
    return $resource('/musics/:id', {
      id: '@id'
    }, {
      findByName: {
        url:"/musics/name/",
        method: "GET",
        params:{name:"@name"},
        isArray: true
      }
    });
  };

  MusicFactory.$inject = ['$resource'];
  angular.module("musicApp.services").factory("Music", MusicFactory);
}(angular));
