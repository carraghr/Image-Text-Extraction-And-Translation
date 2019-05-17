package com.textTranslation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Value;

public class Translator {

	private static final String translateApiURL = "https://script.google.com/macros/s/AKfycbxGTgm-B_ELcbuPcs9qhgNa0Rzb9Hvj333Ef4QQBkvYux6tL6w/exec";
	
	public static String translate(String text, String langTo, String langFrom){
		StringBuilder completeURL = new StringBuilder();
		completeURL.append(translateApiURL);
		try {
			completeURL.append("?q=" + URLEncoder.encode(text,"UTF-8"));
		} catch (UnsupportedEncodingException e1) {
			return "Error Encoding text!";
		}
		completeURL.append("&target="+langTo);
		completeURL.append("&source="+langFrom);
		
		URL url;
		HttpURLConnection connection;
		StringBuilder response = new StringBuilder();
		BufferedReader in = null;
		
		try{
			url = new URL(completeURL.toString());
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("User-Agent", "Mozilla/5.0");
			
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			
			String inputLine;
			while((inputLine=in.readLine()) != null){
				response.append(inputLine);
			}
			in.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response.toString();
	}
}
