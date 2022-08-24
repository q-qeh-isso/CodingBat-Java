package string2;

/**
 * Given a string and a non-empty word string, return a 
 * version of the original String where all chars have 
 * been replaced by pluses ("+"), except for appearances 
 * of the word string which are preserved unchanged.
 * 
 * plusOut("12xy34", "xy") = "++xy++"
 * plusOut("12xy34", "1") = "1+++++"
 * plusOut("12xy34xyabcxy", "xy") = "++xy++xy+++xy"
 * 
 *  
 *
 */

public class PlusOut {

	public static void main(String[] args) {
		System.out.println(plusOut("abXYabcXYZ", "abc"));
	}

	public static String plusOut(String str, String word) {
		String res = "";
		for (int i = 0; i<str.length(); i++) {
			//int strLen = str.length();
			//int wordLen = word.length()+i;
			if( str.length() >= i+word.length() && str.substring(i, i+word.length()).equals(word) ){
				res += word;
				//-1 para contar com iteracao do proprio loop
				i=i+word.length() - 1;
			} else {
				res += "+";
			}

		}
		return res;
		/*String res = "";
		for (int i = 0; i<str.length(); i++) {
			int strLen = str.length();
			int wordLen = word.length()+i;
			if(i < str.length()-1){
				System.out.println(str.substring(i, i+word.length()));
			}
			if( str.length() >= i+word.length() && str.substring(i, i+word.length()).equals(word) ){
				res += word;
				i=i+word.length() - 1;
			} else {
				res += "+";
			}

		}
		return res;*/

	}



}
