# TiCrouton [![Titanium](http://www-static.appcelerator.com/badges/titanium-git-badge-sq.png)](http://www.appcelerator.com/titanium/)

## About
TiCrouton is a Titanium module for [Crouton](https://github.com/keyboardsurfer/Crouton) - a replacement for Android Toast notifications.

![demo](http://s20.postimg.org/m3l53940d/ticrouton.gif)

Check out the demo from the original library:

[![demo](http://developer.android.com/images/brand/en_generic_rgb_wo_60.png)](http://play.google.com/store/apps/details?id=de.keyboardsurfer.app.demo.crouton)

## Quick Start

### Installation [![gitTio](http://gitt.io/badge.png)](http://gitt.io/component/de.manumaticx.crouton)
Download the latest distribution ZIP-file and consult the [Titanium Documentation](http://docs.appcelerator.com/titanium/latest/#!/guide/Using_a_Module) on how install it, or simply use the [gitTio CLI](http://gitt.io/cli):

`$ gittio install de.manumaticx.crouton`

### Usage
```javascript
var Crouton = require('de.manumaticx.crouton');

Crouton.showText("Whooop!", Crouton.STYLE_INFO);

// OR

Crouton.show({
	text: "An error occured. Please try again.",
	style: Crouton.STYLE_ALERT,
	duration: 5000 // 5 seconds
});
```

### Methods

#### _.showText( text , style)_
* __text__: String
* __style__: int (one of _Crouton.STYLE_INFO_, _Crouton.STYLE_ALERT_, _Crouton.STYLE_CONFIRM_)

#### _.show( options)_
* __options__: Object
	* text
	* style
	* duration (as ms)

## TODO

* implement a Crouton Proxy
* implement __make__ ans __makeText__ methods (same as _show_ and _showText_ but returns a reference to a Crouton Proxy, so you can add EventListeners or call _.hide()_ on a Crouton )
* implement __cancelAllCroutons__ and __hide__ methods
* support for __customStyle__ and __customView__

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
