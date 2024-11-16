package lesson5JavaStart;

import java.util.Scanner;

public class FourthEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] ones = new String[]{
		            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
		            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
		        };
		 
		String[] tens = new String[]{
		            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
		        };

		String[] thousands = new String[]{"", "thousand", "million"};
		        
		System.out.println("How much money do you have?");
        String amountStr = sc.nextLine();
        
        amountStr = amountStr.replace(",", ".");
        double amount = Double.parseDouble(amountStr);
     
        int dollars = (int) amount;
        int cents = (int) Math.round((amount - dollars) * 100);
        
        String result = "";
        if (dollars == 0) {
            result = "zero dollars";
        } else {
        int chunkCount = 0;
        while (dollars > 0) {
            int chunk = dollars % 1000;
            if (chunk > 0) {
                String chunkResult = "";
                if (chunk >= 100) {
                    chunkResult += ones[chunk / 100] + " hundred ";
                    chunk %= 100;
                }
                if (chunk >= 20) {
                    chunkResult += tens[chunk / 10] + " ";
                    chunk %= 10;
                }
                if (chunk > 0) {
                    chunkResult += ones[chunk] + " ";
                }
                result = chunkResult.trim() + " " + thousands[chunkCount] + " " + result;
            }
            dollars /= 1000;
            chunkCount++;
        }
        	result = result.trim() + " dollars";
        }
        
        if (cents > 0) {
            String centsResult = "";
            if (cents >= 20) {
                centsResult += tens[cents / 10] + " ";
                cents %= 10;
            }
            if (cents > 0) {
                centsResult += ones[cents] + " ";
            }
            result += " " + centsResult.trim() + " cents";
        }
        
        System.out.println("You have: " + result.trim());
	}
}
