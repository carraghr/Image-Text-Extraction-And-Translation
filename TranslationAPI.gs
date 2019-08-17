var mock = {
  parameter:{
    q:'Unable to translate text',
    source:'en',
    target:'en'
  }
};

function doGet(e){
  e = e || mock;
  
  var sourceText = ''
  if(e.parameter.q){
    sourceText = e.parameter.q;
  }
  
  var sourceLang = '';
  if(e.parameter.source){
    sourceLang = e.parameter.source;
  }
  
  var targetLang = '';
  if(e.parameter.target){
    targetLang = e.parameter.target;
  }
  
  var translatedText = LanguageApp.translate(sourceText, sourceLang, targetLang, {contentType: 'html'});

  return ContentService.createTextOutput(translatedText).setMimeType(ContentService.MimeType.JSON);
}
