package string2;

/**
 * Return a version of the given string, where for every 
 * star (*) in the string the star and the chars immediately 
 * to its left and right are gone. So "ab*cd" yields "ad" 
 * and "ab**cd" also yields "ad".
 * 
 * starOut("ab*cd") = "ad"
 * starOut("ab**cd") = "ad"
 * starOut("sm*eilly") = "silly"
 * 
 *  
 *
 */

public class StarOut {

	public static void main(String[] args) {
		System.out.println(starOut("sm*eilly"));
	}

	public static String starOut(String str) {
		String res = "";
		
		if(str.length() <= 3 && str.contains("*")){
			return "";
		} else if(str.length() <= 3 && !str.contains("*")){
			return str;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if( str.charAt(i) == '*' ) continue;
			if( i < str.length()-1 && str.charAt(i+1) == '*' ) continue;
			if( i != 0 && str.charAt(i-1) == '*' ) continue;		

			res += ""+str.charAt(i);
		}

		return res;
	}


}
