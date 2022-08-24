package string2;

/**
 * Returns true if for every '*' (star) in the string, if there are 
 * chars both immediately before and after the star, they are the same.
 * 
 * sameStarChar("xy*yzz") = true
 * sameStarChar("xy*zzz") = false
 * sameStarChar("*xa*az") = true
 * 
 *  
 *
 */

public class SameStarChar {

	public static void main(String[] args) {
		System.out.println(sameStarChar("*"));
	}

	public static boolean sameStarChar(String str) {

		String before = "";
		String after = "";

		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '*'){
				if(i == 0){
					before = "";
				} else {
					before = str.substring(i-1, i);
				}

				if(i == str.length()-1){
					after = "";
				} else {
					after = str.substring(i+1, i+2);
				}
			}
			if( !(before.equals(after)) && !(before.equals("") || after.equals("")) ){
				return false;
			}
		}

		return true;
		
		/*for (int i=1; i<str.length()-1; i++) {
			if (str.charAt(i) == '*') {
				if (str.charAt(i-1) != str.charAt(i+1)) return false;
			}
		}
		return true;*/


	}

}
