package com.textExtraction;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;

import textExtraction.TextExtractor;

@SpringBootTest
public class TextExtractorTests {
	
	@Before
	public void setup() {

	}
	
	@Test
	public void contextLoads(){
	}
	
	@Test
	public void frenchImage() throws Exception{
		File imageFile =ResourceUtils.getFile("classpath:image1.png");
		String goal = TextExtractor.getText(imageFile).trim();
		assertEquals(goal,"CETTE ALARME EST\nLOCALE SEULEMENT,\nEN CAS DE FEU SIGNALER");
	}
}
