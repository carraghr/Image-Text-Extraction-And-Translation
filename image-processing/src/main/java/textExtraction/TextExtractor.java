package textExtraction;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class TextExtractor {
	private static Tesseract instance;
	
	public static Tesseract getInstance() {
		if(instance == null){
			instance = new Tesseract();
			File tessDataFolder = LoadLibs.extractTessResources("tessdata");
			instance.setDatapath(tessDataFolder.getAbsolutePath());
		}
		return instance;
	}
	
	public static String getText(final File imageFile){
		String text;
		try {
			if(TextExtractor.getInstance() != null) {
				text = TextExtractor.getInstance().doOCR(imageFile);
			}else {
				text = "TextExtractor getInstance error!";
			}
		}catch(TesseractException e) {
			text = e.getMessage();
			e.printStackTrace();
		}
		return text;
	}
}