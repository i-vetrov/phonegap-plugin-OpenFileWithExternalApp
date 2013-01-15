/**
 * That file is available under *either* the terms of the modified BSD license *or* the
 * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.
 *
 * Copyright (c) Ivan Vetrau 2012
 */

package com.phonegap.plugins.OpenFileWithExternalApp;

import java.io.File;

import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;

public class OpenFileWithExternalApp extends Plugin {

  public PluginResult execute(String action, JSONArray args, String callbackId) {
		
		try {
			
			String fileName = args.getString(0);
			
			Intent intent = new Intent();
			
		    intent.setAction(android.content.Intent.ACTION_VIEW);
		    
			File fileToOpen = new File(Environment.getExternalStorageDirectory().getPath() 
					+ "/download/" + fileName);
			
			MimeTypeMap mime = MimeTypeMap.getSingleton();
			
			String extension = fileToOpen.getName().substring(fileToOpen.getName().lastIndexOf(".")
					+ 1).toLowerCase();
			
			String type = mime.getMimeTypeFromExtension(extension);
			
			intent.setAction(Intent.ACTION_VIEW);
			
			Uri uri = Uri.fromFile(fileToOpen);
			
			intent.setDataAndType(uri, type);
			
			this.ctx.startActivity(intent);
		}
		
		catch (JSONException e) {
			
			e.printStackTrace();
			
		}
		
		PluginResult mPlugin = new PluginResult(PluginResult.Status.NO_RESULT);
		
		return  mPlugin;	
	}
}