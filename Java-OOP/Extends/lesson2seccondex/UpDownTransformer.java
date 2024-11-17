package lesson2seccondex;

public class UpDownTransformer extends TextTransformer{
	@Override
	public String transform(String text) {
		text = text.toLowerCase();
		char[] array = text.toCharArray();
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < array.length; i++) {
			if(i % 2 == 0) {
				result.append(Character.toUpperCase(array[i]));
			} else {
				result.append(array[i]);
			}
		}
		
		return result.toString();
	}
}
