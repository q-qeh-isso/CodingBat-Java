package ap1;

/**
 * Given an array of strings, return a new List (e.g. an ArrayList) 
 * where all the strings of the given length are omitted. 
 * See wordsWithout() below which is more difficult 
 * because it uses arrays.
 * 
 * wordsWithoutList({"a", "bb", "b", "ccc"}, 1) = {"bb", "ccc"}
 * wordsWithoutList({"a", "bb", "b", "ccc"}, 3) = {"a", "bb", "b"}
 * wordsWithoutList({"a", "bb", "b", "ccc"}, 4) = {"a", "bb", "b", "ccc"}
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
	
	public static void main(String[] args) {
		String[] words = new String[]{"a", "bb", "b", "ccc"};
		List<String> list = wordsWithoutList(words,1);
		for(String s: list) System.out.print(s+" ");
	}
	
	public static List wordsWithoutList(String[] words, int len) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if(words[i].length() != len) list.add(words[i]);
		}
		return list;
	}


}
