package string2;

/**
 * Given a string, return a string where for every 
 * char in the original, there are two chars.
 * 
 * doubleChar("The") - "TThhee"
 * doubleChar("AAbb") - "AAAAbbbb"
 * doubleChar("Hi-There") - "HHii--TThheerree"
 * 
 *  
 *
 */

public class DoubleChar {

	public static void main(String[] args) {
		System.out.println(doubleChar("The"));

	}

	public static String doubleChar(String str) {
		String res = "";
		for(int i = 0; i<str.length(); i++){	
			res = res + str.charAt(i) + str.charAt(i);
			//res = res + str.substring(i, i+1) + str.substring(i, i+1);
		}
		return res;
	}

}
