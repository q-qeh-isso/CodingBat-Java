package ap1;

/**
 * Start with two arrays of strings, a and b, each in alphabetical 
 * order, possibly with duplicates. Return the count of the number 
 * of strings which appear in both arrays. The best "linear" 
 * solution makes a single pass over both arrays, taking advantage 
 * of the fact that they are in alphabetical order.
 * 
 * commonTwo({"a", "c", "x"}, {"b", "c", "d", "x"}) = 2
 * commonTwo({"a", "c", "x"}, {"a", "b", "c", "x", "z"}) = 3
 * commonTwo({"a", "b", "c"}, {"a", "b", "c"}) = 3
 * 
 *
 */

public class CommonTwo {
	
	public static void main(String[] args) {
		String[] words = new String[]{"a", "b", "c"};
		String[] words2 = new String[]{"a", "b", "c"};
		//int largestLen = Math.max(words.length, words2.length);
		//System.out.println(largestLen);
		System.out.println(commonTwo(words,words2));
	}
	
	public static int commonTwo(String[] a, String[] b) {
		int count = 0;
	    String lastChecked = null;
	    for (int i = 0; i < a.length; i++){
	        if (!a[i].equals(lastChecked)){
	            for (int j = 0; j < b.length; j++){
	                if (a[i].equals(b[j])) {
	                    count++;
	                    lastChecked = a[i];
	                    break;
	                }
	            }
	        }
	    }
	    return count;
	}


}
