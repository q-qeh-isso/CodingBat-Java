package string2;

/**
 * Given a string and a non-empty word string, return a string made of 
 * each char just before and just after every appearance of the word 
 * in the string. Ignore cases where there is no char before or after 
 * the word, and a char may be included twice if it is between two words.
 * 
 * wordEnds("abcXY123XYijk", "XY") = "c13i"
 * wordEnds("XY123XY", "XY") = "13"
 * wordEnds("XY1XY", "XY") = "11"
 * 
 *  
 *
 */

public class WordEnds {

	public static void main(String[] args) {
		System.out.println(wordEnds("abc1abc1abc", "abc"));
	}

	public static String wordEnds(String str, String word) {
		int strLen = str.length();
		int wordLen = word.length();
		String res = "";
		
		for(int i = 0; i<strLen-wordLen+1; i++){
			String temp = str.substring(i,i+wordLen);
			String firstIf = (i>0) ? str.substring(i-1, i) : "";
			String secIf = (i<strLen-wordLen) ? str.substring(i+wordLen, i+wordLen+1) : "";
			
			if(i > 0 && temp.equals(word)){
				System.out.println("res = " + str.substring(i-1, i));
				res += str.substring(i-1, i);
			}
			if(i < strLen-wordLen && temp.equals(word)){
				res += str.substring(i+wordLen, i+wordLen+1);
			}
		}
		return res;
		
	}


}
