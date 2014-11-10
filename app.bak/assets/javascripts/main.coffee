require.config
  paths:
#    app: './app'
    angular: '../lib/angularjs/angular'
    'angular-cookies': '../lib/angularjs/angular-cookies'
    jquery: '../lib/jquery/jquery'
  shim:
    angular:
      exports: 'angular'
    'angular-cookies':
      deps: ['angular']

define ['jquery', 'angular', 'app.module'], ($, angular, app) ->

  'use strict'

  if document.readyState in ['interactive', 'complete']
    try
      angular.bootstrap(document, ['eAppearance'])
    catch error
      console.log error
  else
    $ ->
      try
        angular.bootstrap(document, ['eAppearance'])
      catch error
        console.log error
