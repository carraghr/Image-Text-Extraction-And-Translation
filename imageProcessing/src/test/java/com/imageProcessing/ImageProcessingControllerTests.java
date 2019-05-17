package com.imageProcessing;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.ResourceUtils;
import org.springframework.web.context.WebApplicationContext;

//@WebAppConfiguration
//@ContextConfiguration(classes = WebConfig.class)
//@RunWith(SpringRunner.class)
@SpringBootTest
public class ImageProcessingControllerTests {
	
	@Autowired
	//private WebApplicationContext webApplicationContext;
	
	@Test
	public void test() {
	//	File image = ResourceUtils.getFile("classpath:image1.png");
	//	byte[] data = FileUtils.readFileToByteArray(image);
	//	MockMultipartFile imageFile = new MockMultipartFile("file", image.getName(), "image/png", data);
		
	//	MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	//	mockMvc.perform(MockMvcRequestBuilders.multipart("/imageUpload").file(imageFile)).andExpect(status().isOk());
		
	}
	
/*
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
	    this.mockMvc = MockMvcBuilders.standaloneSetup(new ImageProcessingController()).build();
	}
	
	@Test
	public void contextLoads(){
	}
	
	@Test
	public void imageUpload() throws Exception{
		//ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		//URL resource = classLoader.getResource("image1.png");
		//File image = new File(resource.getPath());
		//File image = new File(getClass().getClassLoader().getResource("image1.png").getFile());
		//File image = ResourceUtils.getFile(this.getClass().getResource("/image1.png"));
		
		File image = ResourceUtils.getFile("classpath:image1.png");
		byte[] data = FileUtils.readFileToByteArray(image);
		MultipartFile imageFile = new MockMultipartFile("file", image.getName(), "image/png", data);
		
		mockMvc.perform(
				MockMvcRequestBuilders.multipart("/imageUpload").file(imageFile);
                .andDo(print())
                .andExpect(status().isOk());
                
	}
*/	
}
