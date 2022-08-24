package warmup2;

/**
 * Given a non-empty string like "Code" return a 
 * string like "CCoCodCode".
 * 
 * stringSplosion("Code") = "CCoCodCode"
 * stringSplosion("abc") = "aababc"
 * stringSplosion("ab") = "aab"
 * 
 *  
 *
 */

public class StringSplosion {
	
	public static void main(String[] args) {
		System.out.println(stringSplosion("Code"));
	}

	public static String stringSplosion(String str) {
		String tempStr = "";
		for(int i = 0; i < str.length(); i++){
			tempStr += str.substring(0, i+1);
		}
		return tempStr;
	}


}
