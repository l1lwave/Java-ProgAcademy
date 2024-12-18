package lesson2seccondex;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSaver {
	private TextTransformer transformer;
	private File file;
	
	
	public TextSaver(TextTransformer transformer, File file) {
		super();
		this.transformer = transformer;
		this.file = file;
	}

	public TextSaver() {
		super();
	}

	
	public TextTransformer getTransformer() {
		return transformer;
	}

	public void setTransformer(TextTransformer transformer) {
		this.transformer = transformer;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void saveTextToFile(String text) {
		text = this.transformer.transform(text);
		
		File file = this.file;
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.print(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "TextSaver [transformer=" + transformer + ", file=" + file + "]";
	}
	
}
