package string1;

/**
 * Given a string of even length, return a string 
 * made of the middle two chars, so the string "string" 
 * yields "ri". The string length will be at least 2.
 * 
 * middleTwo("string") = "ri"
 * middleTwo("code") = "od"
 * middleTwo("Practice") = "ct"
 * 
 *  
 *
 */

public class MiddleTwo {

	public static void main(String[] args) {
		System.out.println(middleTwo("string"));
	}

	public static String middleTwo(String str) {
		/*if(str.length() <= 2){
		    return str;
		}*/
		if(str.length() % 2 == 0){
			int strLen = (str.length()/2)-1;
			return str.substring(strLen,strLen+2);
		} else {
			return str;
		}
	}


}
