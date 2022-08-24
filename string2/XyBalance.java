package string2;

/**
 * We'll say that a String is xy-balanced if for 
 * all the 'x' chars in the string, there exists a 'y' char 
 * somewhere later in the string. So "xxy" is balanced, 
 * but "xyx" is not. One 'y' can balance multiple 'x's. 
 * Return true if the given string is xy-balanced.
 * 
 * xyBalance("aaxbby") = true
 * xyBalance("aaxbb") = false
 * xyBalance("yaaxbb") = false
 * 
 *  
 *
 */

public class XyBalance {

	public static void main(String[] args) {
		System.out.println(xyBalance("aaxbby"));

	}

	public static boolean xyBalance(String str) {
		boolean flag = false;
		int idxX = 0;
		int idxY = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.substring(i,i+1).equals("x")){
				idxX = i+1;
			} else if(str.substring(i,i+1).equals("y")){
				idxY = i+1;
			}
		}
		if(idxX <= idxY){
			flag = true;
		}
		return flag;
		
		/*//codingbat solution
		// Find the rightmost y
		int y = -1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='y') 
				y = i;
		}
		// Look at the x's, return false if one is after y
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='x' && i > y) 
				return false;
		}
		return true;*/
	}

}
