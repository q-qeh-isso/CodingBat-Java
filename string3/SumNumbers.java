package string3;

/**
 * Given a string, return the sum of the numbers appearing in the string, 
 * ignoring all other characters. A number is a series of 1 or more digit 
 * chars in a row. (Note: Character.isDigit(char) tests if a char is 
 * one of the chars '0', '1', .. '9'. Integer.parseInt(string) 
 * converts a string to an int.)
 * 
 * sumNumbers("abc123xyz") = 123
 * sumNumbers("aa11b33") = 44
 * sumNumbers("7 11") = 18
 * 
 *  
 *
 */


public class SumNumbers {

	public static void main(String[] args) {
		System.out.println(sumNumbers("abc123xyz"));
	}

	public static int sumNumbers(String str) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			if(Character.isDigit(str.charAt(i))){
				for (int j = i; j < str.length(); j++) {
					if(Character.isDigit(str.charAt(j))){
						count++;
					} else {
						break;
					}
				}
				res += Integer.parseInt(str.substring(i, i+count));
				i+=count;
			}
		}

		return res;
	}


}
