package com.imageProcessing;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import textExtraction.TextExtractor;

import org.springframework.web.multipart.MultipartFile;

@Controller
public class ImageProcessingController {
	
	@Value("$spring.application.fileLocation")
	private String tempFileLocation;
	
	@PostMapping("/imageUpload")
	public TextResponse handleImageFileUpload(@RequestParam("file") MultipartFile file){
		TextResponse textExtracted;
		if(file.isEmpty()){
			textExtracted = new TextResponse("File is empty, Please upload file containing data");
		}else {
			String filename = file.getOriginalFilename();
			try {
				File tempFile = File.createTempFile(tempFileLocation,filename.substring(filename.lastIndexOf(".")+1));
				tempFile.deleteOnExit();
				file.transferTo(tempFile);
				textExtracted = new TextResponse(TextExtractor.getText(tempFile));;
				tempFile.delete();
			} catch(IOException e) {
				e.printStackTrace();
				textExtracted = new TextResponse("Error processing image");
			}			
		}
		return textExtracted;
	}
}
