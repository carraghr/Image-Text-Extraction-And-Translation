function getTranslation(){
	var source = document.getElementById("textSource").value;
	var langTo = document.getElementById("langFrom");
	var langToTran = langTo.options[langTo.selectedIndex].value;
	
	var langFrom = document.getElementById("langTo");
	var langFromTran = langFrom.options[langFrom.selectedIndex].value;
	console.log("he;ll");
	var xhttp = new XMLHttpRequest();
	xhttp.onload = function() {
        alert(http.responseText);
    }
	xhttp.onreadystatechange = function(){
		if(xhttp.readState === 4){
			document.getElementById(translatedText).innerHTML =xhttp.response;
		}
	}
	
	var url = "localhost:8081/translate?text="+source+"&langTo="+langToTran+"&langFrom="+langFromTran;
	
	xhttp.open('GET',url,true);
	xhttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	xhttp.setRequestHeader('Access-Control-Allow-Headers', '*');
	xhttp.setRequestHeader('Content-type', 'application/ecmascript');
	xhttp.setRequestHeader('Access-Control-Allow-Origin', '*');
	xhttp.send('');
	event.preventDefault();
}