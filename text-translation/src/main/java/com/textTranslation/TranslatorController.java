package com.textTranslation;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "")
public class TranslatorController {
	
	
	@GetMapping("/translate")
    public TranslationJSON translate(@RequestParam(value="text", defaultValue="No text inputed") String text, 
								@RequestParam(value="langTo", defaultValue="en") String langTo, 
								@RequestParam(value="langFrom", defaultValue="en") String langFrom){
		
		String translatedText =  Translator.translate(text,langTo,langFrom);
        return new TranslationJSON(text,langTo,langFrom,translatedText);
    }
	//http://localhost:8081/translate?text=hello&langTo=fr&langFrom=en
}
