package string2;

/**
 * Given two strings, word and a separator sep, return a 
 * big string made of count occurrences of the word, 
 * separated by the separator string.
 * 
 * repeatSeparator("Word", "X", 3) = "WordXWordXWord"
 * repeatSeparator("This", "And", 2) = "ThisAndThis"
 * repeatSeparator("This", "And", 1) = "This"
 * 
 *  
 *
 */

public class RepeatSeparator {
	
	public static void main(String[] args) {
		System.out.println(repeatSeparator("This","And",2));
	}
	
	public static String repeatSeparator(String word, String sep, int count) {
		String res = "";
		for (int i = 0; i < count; i++) {
			if(i != count-1){
				res += word+sep;
			} else {
				res += word;
			}
		}
		return res;
	}


}
