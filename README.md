# TiCrouton [![Titanium](http://www-static.appcelerator.com/badges/titanium-git-badge-sq.png)](http://www.appcelerator.com/titanium/)

## About
TiCrouton is a Titanium module for [Crouton](https://github.com/keyboardsurfer/Crouton) - a replacement for Android Toast notifications.

![demo](documentation/ticrouton.gif)

Check out the demo from the original library:

[![demo](http://developer.android.com/images/brand/en_generic_rgb_wo_60.png)](http://play.google.com/store/apps/details?id=de.keyboardsurfer.app.demo.crouton)

## Quick Start

### Installation [![gitTio](http://gitt.io/badge.png)](http://gitt.io/component/de.manumaticx.crouton)
Download the latest distribution ZIP-file and consult the [Titanium Documentation](http://docs.appcelerator.com/titanium/latest/#!/guide/Using_a_Module) on how install it, or simply use the [gitTio CLI](http://gitt.io/cli):

`$ gittio install de.manumaticx.crouton`

### Usage
```javascript
var Crouton = require('de.manumaticx.crouton');

// simple alert
Crouton.alert("Something went wrong! :-(");

// simple confirm
Crouton.confirm("Something was successful! :-)");

// simple info
Crouton.info("Something I want to let you know.");

```
There are some more examples in the [example](example/app.js).

## API

### Module

`.alert( text )`
* __text__: String

`.confirm( text )`
* __text__: String

`.info( text )`
* __text__: String

`.showText( text , style )`
* __text__: String
* __style__: int (one of _Crouton.STYLE_INFO_, _Crouton.STYLE_ALERT_, _Crouton.STYLE_CONFIRM_)

`.show( options)`
* __options__: Object
	* text
	* style
	* duration (as ms)
	* activity

`.makeText( text , style )`
* __text__: String
* __style__: int (one of _Crouton.STYLE_INFO_, _Crouton.STYLE_ALERT_, _Crouton.STYLE_CONFIRM_)

 _returns [Crouton](#crouton)_

`.make( options )`
* __options__: Object
	* text
	* style
	* duration (as ms)
	* activity

 _returns [Crouton](#crouton)_

`.hide( crouton )` hides a Crouton by reference
* __crouton__: [Crouton](#crouton)

`.cancelAllCroutons( )` cancels all pending Croutons


### Crouton

* `.show( )` shows the Crouton
* `.hide( )` hides the Crouton
* `.cancel( )` cancels the Crouton

## TODO

* ~~implement a Crouton Proxy~~
* ~~implement __make__ ans __makeText__ methods~~
* ~~implement __cancelAllCroutons__ and __hide__ methods~~
* implement Events
* add support for __customStyle__ and __customView__

## License
	The MIT License (MIT)

	Copyright (c) 2014 Manuel Lehner

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in
	all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
	THE SOFTWARE.
