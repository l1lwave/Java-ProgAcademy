package lesson6JavaStart;

public class FifthEx {

	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		
		getMaxPolindrome(a, b);
		
	}
	
	public static void getMaxPolindrome(int a, int b) {
		int result;
		int maxNumber1 = 0;
		int maxNumber2 = 0;
		int maxResult = 0;
				
		for(int i = a; i < 1000; i++) {
			for (int j = b; j < 1000; j++) {
				result = i * j;
				String strNumber = String.valueOf(result);
				if(isPolindrome(strNumber)) {
					if(result > maxResult) {
						maxNumber1 = i;
						maxNumber2 = j;
						maxResult = result;
						
					}
				}
			}
		}
		
		System.out.println(maxNumber1 + " * " + maxNumber2 + " = " + maxResult);
	}
	
	public static boolean isPolindrome(String str) {
		int i = 0;
        int j = 0;
        
       	for(;i < str.length() / 2;) {
            char leftSymbol = str.charAt(i);
            char rightSymbol = str.charAt(str.length() - j - 1);

            if (leftSymbol != rightSymbol) {
                return false;
            }

            i++;
            j++;
        }
       	
       	return true;
	}

}
