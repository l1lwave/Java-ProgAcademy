package lesson2seccondex;

public class InverseTransformer extends TextTransformer{
	@Override
	public String transform(String text) {
		char[] array = text.toCharArray();
		String result = "";
		
		for (int i = array.length - 1; i >= 0; i--) {
			result = result + array[i];
		}
		
		return result;
	}
}
