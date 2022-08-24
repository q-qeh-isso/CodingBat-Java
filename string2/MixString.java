package string2;

/**
 * Given two strings, a and b, create a bigger string 
 * made of the first char of a, the first char of b, 
 * the second char of a, the second char of b, and so on. 
 * Any leftover chars go at the end of the result.
 * 
 * mixString("abc", "xyz") = "axbycz"
 * mixString("Hi", "There") = "HTihere"
 * mixString("xxxx", "There") = "xTxhxexre"
 * 
 *  
 *
 */

public class MixString {

	public static void main(String[] args) {
		System.out.println("mixString = " + mixString("Long", "So"));
	}

	public static String mixString(String a, String b){
		String big = (a.length() > b.length()) ? a : b;
		String res = "";
		
		for (int i = 0; i < big.length(); i++) {
			if(i < a.length()){
				res += a.charAt(i);
			}			
			if(i < b.length()){
				res += b.charAt(i);
			}
		}
		return res;
	}

}
