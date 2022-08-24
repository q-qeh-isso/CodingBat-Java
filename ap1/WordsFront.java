package ap1;

/**
 * Given an array of strings, return a new array containing the 
 * first N strings. N will be in the range 1..length.
 * 
 * wordsFront({"a", "b", "c", "d"}, 1) = {"a"}
 * wordsFront({"a", "b", "c", "d"}, 2) = {"a", "b"}
 * wordsFront({"a", "b", "c", "d"}, 3) = {"a", "b", "c"}
 * 
 *  
 *
 */

public class WordsFront {

	public static void main(String[] args) {
		String[] words = new String[]{"a", "bb", "b", "ccc"};
		words = wordsFront(words,1);
		for(String s : words) System.out.print(s+" ");
	}
	
	public static String[] wordsFront(String[] words, int n) {
		int count = 0;
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = words[i];
		}
		
		return arr;
	}
	
	
}
