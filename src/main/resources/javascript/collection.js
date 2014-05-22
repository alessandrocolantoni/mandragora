function updateCollection(url) {
    if (window.XMLHttpRequest) { // Non-IE browsers
        req = new XMLHttpRequest();
        req.onreadystatechange = processStateChange;
        try {
            req.open("GET", url, true);
        } catch (e) {
            alert(e);
        }
        req.send(null);
    } else if (window.ActiveXObject) { // IE
        req = new ActiveXObject("Microsoft.XMLHTTP");
        if (req) {
            req.onreadystatechange = processStateChange;
            req.open("GET", url, true);
            req.send();
        }
    }
}



function processStateChange() {
    if (req.readyState == 4) { // Complete
        if (req.status == 200) { // OK response
            //document.getElementById("theTable").innerHTML = req.responseText;
            //var xmlDoc = req.responseXML;
            var xmlDoc = req.responseXML.documentElement;

            //var id = xmlDoc.getAttribute('id');

            var id = (xmlDoc.getElementsByTagName("div")[0]).getAttribute('id');
            document.getElementById(id).innerHTML = xmlDoc.innerHTML

        } else {
            alert("Problem: " + req.statusText);
        }
    }
}


