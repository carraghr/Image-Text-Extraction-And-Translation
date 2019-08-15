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
			text = TextExtractor.getInstance().doOCR(imageFile);
		}catch(TesseractException e) {
			text = "Error Processing Image";
			e.printStackTrace();
		}
		return text;
	}
}