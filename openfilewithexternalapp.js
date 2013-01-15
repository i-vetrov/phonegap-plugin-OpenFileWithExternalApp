/**
 * Plugin is available under *either* the terms of the modified BSD license *or* the
 * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.
 *
 * Copyright (c) Ivan Vetrau 2012
 */

var OpenFileWithExternalApp = function() {
};

OpenFileWithExternalApp.prototype.openFile = function(fileName, successCallback, errorCallback){
  
	 if (errorCallback == null) { errorCallback = function() {}}

	    if (typeof errorCallback != "function")  {
	        console.log("Failure: failure parameter not a function");
	        return
	    }

	    if (typeof successCallback != "function") {
	        console.log("Failure: success callback parameter must be a function");
	        return
	    }

	    cordova.exec(successCallback, errorCallback, 'OpenFileWithExternalApp', 'Open', [fileName]);
}


OpenFileWithExternalApp.prototype.openLink = function(link){
	navigator.app.loadUrl(link, { openExternal:true } );
}

if(!window.plugins) {
    window.plugins = {};
}
if (!window.plugins.openExternalApp) {
    window.plugins.openExternalApp = new OpenFileWithExternalApp();
}
