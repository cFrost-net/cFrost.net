var browserName = navigator.appName;
if(browserName != "Netscape") {
    window.location.href="nohtml5.html";
}

function setStyle(id, styleType, style) {
    var item = document.getElementById(id);
    if(styleType == 'clear') {
        item.style.cssText = null;
    }else if(styleType == 'inline') {
        item.style.cssText = style;
    }
}