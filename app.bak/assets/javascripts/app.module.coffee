
define [
    'require',
    'angular',
    'angular-cookies',
    'jquery',
#    'app/video.factory',
#    'app/upload.service',
#    'app/format.service',
#    'app/landing.controller',
#    'app/video.controller',
#    'app/upload.controller',
#    'app/admin.controller',
#    'app/user-video.controller',
#    'app/channel.controller',
#    'app/search.controller',
#    'app/video-list.directive',
#    'app/video-scroll.directive',
#    'app/update-video.directive',
#    'app/share-video.directive',
#    'app/video-channel.directive',
#    'app/update-artifact.directive',
#    'app/download-video.directive',
#    'app/download-artifact.directive'
  ], ->
  return angular.module('eAppearance', ['ngCookies'], ['$compileProvider', ($compileProvider) ->
    $compileProvider.aHrefSanitizationWhitelist /^\s*(https?|ftp|mailto|tel|file|blob):/])
#    .factory 'VideoFactory', require('app/video.factory')
#    .service 'UploadService', require('app/upload.service')
#    .service 'FormatService', require('app/format.service')
#    .controller 'LandingController', require('app/landing.controller')
#    .controller 'VideoController', require('app/video.controller')
#    .controller 'UploadController', require('app/upload.controller')
#    .controller 'AdminController', require('app/admin.controller')
#    .controller 'UserVideoController', require('app/user-video.controller')
#    .controller 'ChannelController', require('app/channel.controller')
#    .controller 'SearchController', require('app/search.controller')
#    .directive 'videoList', require('app/video-list.directive')
#    .directive 'videoScroll', require('app/video-scroll.directive')
#    .directive 'updateVideo', require('app/update-video.directive')
#    .directive 'shareVideo', require('app/share-video.directive')
#    .directive 'addVideoChannel', require('app/video-channel.directive')
#    .directive 'updateArtifact', require('app/update-artifact.directive')
#    .directive 'downloadVideo', require('app/download-video.directive')
#    .directive 'downloadArtifact', require('app/download-artifact.directive')
    .run ["$rootScope", "$cookies", "$http", ($rootScope, $cookies, $http) ->
      
      # Used for testing bug, should be moved if possible
#      unless window.VideoApp
#        window.VideoApp =
#          VIDEO_SERVICE_URL: ''
      
#      oauthContext = ''
#      token = ''
#      cookieName = window.VideoApp.COOKIE_NAME
#      if cookieName and $cookies[cookieName]
#        startIndex = $cookies[cookieName].lastIndexOf('oauth=')
#        endIndex = $cookies[cookieName].lastIndexOf('}"')
#        oauth = $cookies[cookieName].substring(startIndex + 6, endIndex + 1) if startIndex != -1 and endIndex != -1
#        oauthContext = JSON.parse(oauth)
#
#        if oauthContext
#          token = oauthContext.tokenKey
#          token = token.replace('"', '')
#          $rootScope.oauthContext = oauthContext
#
#      $rootScope.showMoreUploadOverlay = false
#
#      $rootScope.showMoreUpload = ->
#        $rootScope.showMoreUploadOverlay = true
#
#      $rootScope.closeMoreUpload = ->
#        $rootScope.showMoreUploadOverlay = false

      ## check permission for a user
#      console.log(oauthContext)
#      $rootScope.view_teachscape_and_district_channels = false
#      $rootScope.edit_my_channels = false
#      $rootScope.edit_district_channels = false
#      $rootScope.edit_custom_keywords = false
#      $rootScope.edit_metadata_for_videos_of_organization = false

#      for item in oauthContext.tokenScopes
#        switch item.permission
#          when 'view_teachscape_and_district_channels'
#            $rootScope.view_teachscape_and_district_channels = true
#          when 'edit_my_channels'
#            $rootScope.edit_my_channels = true
#          when 'edit_district_channels'
#            $rootScope.edit_district_channels = true
#          when 'edit_custom_keywords'
#            $rootScope.edit_custom_keywords = true
#          when 'edit_metadata_for_videos_of_organization'
#            $rootScope.edit_metadata_for_videos_of_organization = true

      ##

      #### DEV TOKEN FOR LOCAL DEVELOPMENT
#      if window.VideoApp.DEV_AUTH and window.VideoApp.DEV_AUTH == true
#        token = window.VideoApp.DEV_TOKEN if window.VideoApp.DEV_TOKEN
#      ####
#
#      if token
#        window.VideoApp.TOKEN = token
#        $http.defaults.headers.common.Authorization = "Bearer #{token}"
#      $rootScope.searchTermLink = ''
#      $rootScope.enterUrl = (event, url) ->
#        if event.which == 13
#          window.location = url
      
    ]
