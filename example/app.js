var win = Ti.UI.createWindow({
	backgroundColor:'white',
	layout: 'vertical',
	exitOnClose: true
});

// require the module
var Crouton = require('de.manumaticx.crouton');

var button_info = Ti.UI.createButton({
    title: 'INFO',
    top: 50
});
button_info.addEventListener('click', function(){
    // show a Crouton and forget about it
    Crouton.showText("This is a Crouton with built-in INFO style", Crouton.STYLE_INFO);
});
win.add(button_info);

var button_alert = Ti.UI.createButton({
    title: 'ALERT'
});
button_alert.addEventListener('click', function(){
    // show a Crouton and forget about it
    Crouton.showText("This is a Crouton with built-in ALERT style", Crouton.STYLE_ALERT);
});
win.add(button_alert);

var button_confirm = Ti.UI.createButton({
    title: 'CONFIRM'
});
button_confirm.addEventListener('click', function(){
    // show a Crouton and forget about it
    Crouton.showText("This is a Crouton with built-in CONFIRM style", Crouton.STYLE_CONFIRM);
});
win.add(button_confirm);

win.open();