package string1;

/**
 * Given a string of odd length, return the string 
 * length 3 from its middle, so "Candy" yields "and". 
 * The string length will be at least 3.
 * 
 * middleThree("Candy") = "and"
 * middleThree("and") = "and"
 * middleThree("solving") = "lvi"
 * 
 *  
 *
 */

public class MiddleThree {

	public static void main(String[] args) {
		System.out.println(middleThree("Candy"));
	}

	public static String middleThree(String str) {
		if(str.length() <= 3){
			return str;
		}
		if(str.length() % 2 != 0){
			int indexLen = (str.length()/2)-1;
			return str.substring (indexLen, indexLen+3);
		} else {
			return str;
		}
	}


}
