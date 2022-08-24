package warmup2;

/**
 * Given 2 strings, a and b, return the number of 
 * the positions where they contain the same 
 * length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
 * since the "xx", "aa", and "az" substrings appear 
 * in the same place in both strings.
 * 
 * stringMatch("xxcaazz", "xxbaaz") = 3
 * stringMatch("abc", "abc") = 2
 * stringMatch("abc", "axc") = 0
 * 
 *  
 *
 */

public class StringMatch {

	public static void main(String[] args) {
		System.out.println(stringMatch("xxcaazz", "xxbaaz"));
	}

	public static int stringMatch(String a, String b) {
		int count = 0;

		if(a.length() <= 1){
			return count;
		}

		if(a.length() > b.length()){
			for(int i = 0; i < b.length()-1; i++){
				if( a.substring(i,i+2).equals(b.substring(i,i+2)) ){
					count++;
				}  
			}
		} else {
			for(int i = 0; i < a.length()-1; i++){
				if( b.substring(i,i+2).equals(a.substring(i,i+2)) ){
					count++;
				}  
			}
		}
		return count;

		/*// Figure which string is shorter.
		int len = Math.min(a.length(), b.length());
		int count = 0;

		// Look at both substrings starting at i
		for (int i=0; i<len-1; i++) {
			String aSub = a.substring(i, i+2);
			String bSub = b.substring(i, i+2);
			if (aSub.equals(bSub)) {  // Use .equals() with strings
				count++;
			}
		}

		return count;*/

	}

}
