package ap1;

/**
 * Start with two arrays of strings, A and B, each with its elements 
 * in alphabetical order and without duplicates. Return a new array 
 * containing the first N elements from the two arrays. 
 * The result array should be in alphabetical order and without 
 * duplicates. A and B will both have a length which is N or more. 
 * The best "linear" solution makes a single pass over A and B, 
 * taking advantage of the fact that they are in alphabetical order, 
 * copying elements directly to the new array.
 * 
 * mergeTwo({"a", "c", "z"}, {"b", "f", "z"}, 3) = {"a", "b", "c"}
 * mergeTwo({"a", "c", "z"}, {"c", "f", "z"}, 3) = {"a", "c", "f"}
 * mergeTwo({"f", "g", "z"}, {"c", "f", "g"}, 3) = {"c", "f", "g"}
 * 
 *
 */

public class MergeTwo {

	public static void main(String[] args) {
		String[] words = new String[]{"a", "c", "z"};
		String[] words2 = new String[]{"b", "f", "z"};
		//System.out.println(mergeTwo(words, words2, 3));
		String[] arr = mergeTwo(words,words2,3);
		for(String s : arr) System.out.print(s+" ");
	}

	public static String[] mergeTwo(String[] a, String[] b, int n) {
		String[] result = new String[n];
		int indexResult = 0;
		int indexA = 0;
		int indexB = 0;

		while (indexResult < n)
			if (a[indexA].compareTo(b[indexB]) < 0)
				result[indexResult++] = a[indexA++];
			else if (a[indexA].compareTo(b[indexB]) > 0)
				result[indexResult++] = b[indexB++];
			else { // identical strings
				result[indexResult++] = a[indexA++];
				indexB++;
			}
		return result;
	}


}
