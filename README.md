phonegap-plugin-OpenFileWithExternalApp
=======================================

A plugin that opens file in external app using its extention.

## Adding the plugin to your project ##

1. To install the plugin, move 'openfilewithexternalapp.js' to your project's www folder and include a reference to it in your html files. 
2. Create a folder called 'com/phonegap/plugins/openfilewithexternalapp' within your project's src/ folder.
3. And copy the java file into that new folder.
4. Add the following to res/xml/plugins.xml file `<plugin name="OpenFileWithExternalApp" value="com.phonegap.plugins.openfilewithexternalapp.OpenFileWithExternalApp"/>`

## Using the plugin ##

The plugin creates the object 'window.plugins.openFileWithExternalApp' with method 'openFile(filePath, successCallback, errorCallback)' where 'filePath' is the absolute file path including the name of file. Usualy you can get filePath like this:
    
    fileEntry.file(function(file){
    
      window.plugins.openFileWithExternalApp.openFile(file.fullPath, successCallback, errorCallback);
    
    });


The other method 'openLink(link)' open URL in external browser.

Bug reports and your suggestions are welcome!

## Licence ##

The MIT License

Copyright (c) 2012 Ivan Vetrau

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
