package ap1;

/**
 * Given an array of strings, return a new array without the strings 
 * that are equal to the target string. One approach is to count the 
 * occurrences of the target string, make a new array of the correct 
 * length, and then copy over the correct strings.
 * 
 * wordsWithout({"a", "b", "c", "a"}, "a") = {"b", "c"}
 * wordsWithout({"a", "b", "c", "a"}, "b") = {"a", "c", "a"}
 * wordsWithout({"a", "b", "c", "a"}, "c") = {"a", "b", "a"}
 * 
 *  
 *
 */

public class WordsWithout {
	
	public static void main(String[] args) {
		String[] words = new String[]{"a", "b", "c", "a"};
		words = wordsWithout(words,"a");
		for(String s : words) System.out.print(s+" ");
	}
	
	public static String[] wordsWithout(String[] words, String target) {
		int notA = 0;
		for (int i = 0; i < words.length; i++){
			if(!words[i].equals(target)) notA++;
		}
		
		String[] arr = new String[notA];
		int pos = 0;
		for (int i = 0; i < words.length; i++) {
			if(!words[i].equals(target)) {
				arr[pos] = words[i];
				pos++;
			}
		}		
		return arr;
	}


}
