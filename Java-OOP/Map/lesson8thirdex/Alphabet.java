package lesson8thirdex;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {
	private Map<Character, String[]> ascii = new HashMap<>();

	public Alphabet() {
		super();
		ascii.put('A', new String[]{
                "  *  ",
                " * * ",
                "*****",
                "*   *",
                "*   *"
        });
		ascii.put('B', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*   *",
                "**** "
        });
		ascii.put('C', new String[]{
                " ****",
                "*    ",
                "*    ",
                "*    ",
                " ****"
        });
		ascii.put('D', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "*   *",
                "**** "
        });
		ascii.put('E', new String[]{
                "*****",
                "*    ",
                "*****",
                "*    ",
                "*****"
        });
		ascii.put('F', new String[]{
                "*****",
                "*    ",
                "*****",
                "*    ",
                "*    "
        });
		ascii.put('G', new String[]{
                " ****",
                "*    ",
                "* ***",
                "*   *",
                " *** "
        });
		ascii.put('H', new String[]{
                "*   *",
                "*   *",
                "*****",
                "*   *",
                "*   *"
        });
		ascii.put('I', new String[]{
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  "
        });
		ascii.put('J', new String[]{
                "  ** ",
                "   * ",
                "   * ",
                " * * ",
                "  ** "
        });
		ascii.put('K', new String[]{
                "*   *",
                "*  * ",
                "***  ",
                "*  * ",
                "*   *"
        });
		ascii.put('L', new String[]{
                "*    ",
                "*    ",
                "*    ",
                "*    ",
                "*****"
        });
		ascii.put('M', new String[]{
                "*   *",
                "** **",
                "* * *",
                "*   *",
                "*   *"
        });
		ascii.put('N', new String[]{
                "*   *",
                "**  *",
                "* * *",
                "*  **",
                "*   *"
        });
		ascii.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
		ascii.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });
		ascii.put('Q', new String[]{
				" *** ",
                "*   *",
                "*   *",
                "*  **",
                " ** *"
        });
		ascii.put('R', new String[]{
				"**** ",
                "*   *",
                "**** ",
                "* *  ",
                "*  **"
        });
		ascii.put('S', new String[]{
				" ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
		ascii.put('T', new String[]{
				"*****",
                "  *  ",
                "  *  ",
                "  *  ",
                "  *  "
        });
		ascii.put('U', new String[]{
				"*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });
		ascii.put('V', new String[]{
				"*   *",
                "*   *",
                "*   * ",
                " * * ",
                "  *  "
        });
		ascii.put('W', new String[]{
				"*   *",
                "*   *",
                "* * *",
                "** **",
                "*   *"
        });
		ascii.put('X', new String[]{
				"*   *",
                " * * ",
                "  *  ",
                " * * ",
                "*   *"
        });
		ascii.put('Y', new String[]{
				"*   *",
                " * * ",
                "  *  ",
                "  *  ",
                "  *  "
        });
		ascii.put('Z', new String[]{
				"*****",
                "   * ",
                "  *  ",
                " *   ",
                "*****"
        });
		ascii.put(' ', new String[]{
				"  ",
                "  ",
                "  ",
                "  ",
                "  "
        });
	}

    public String print(String text) {
        StringBuilder sb = new StringBuilder();
        text = text.toUpperCase();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < text.length(); j++) {
                char letter = text.charAt(j);
                String[] art = ascii.get(letter);

                if (art != null) {
                    sb.append(art[i]);
                } else {
                    sb.append("     ");
                }
                sb.append("  ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
	
}
