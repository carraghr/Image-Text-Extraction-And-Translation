package com.textTranslation;

public class TranslationJSON{
	private final String text;
	private final String langTo;
	private final String langFrom;
	private String translatedText;
	
	public TranslationJSON(String text, String langTo, String langFrom, String translatedText){
		this.text = text;
		this.langTo = langTo;
		this.langFrom = langFrom;
		this.translatedText = translatedText;
	}
	
	public String getText(){
		return text;
	}
	
	public String getLangTo(){
		return langTo;
	}
	public String getLangFrom(){
		return langFrom;
	}
	
	public String getTranslatedText(){
		return translatedText;
	}
}
