package ap1;

/**
 * Given 2 arrays that are the same length containing strings, 
 * compare the 1st string in one array to the 1st string in the 
 * other array, the 2nd to the 2nd and so on. Count the number of 
 * times that the 2 strings are non-empty and start with the same char. 
 * The strings may be any length, including 0.
 * 
 * matchUp({"aa", "bb", "cc"}, {"aaa", "xx", "bb"}) = 1
 * matchUp({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) = 2
 * matchUp({"aa", "bb", "cc"}, {"", "", "ccc"}) = 1
 * 
 *
 */

public class MatchUp {
	
	public static void main(String[] args) {
		String[] words = new String[]{"aa", "bb", "cc"};
		String[] words2 = new String[]{"aaa", "xx", "bb"};

		System.out.println(matchUp(words, words2));
	}
	
	public static int matchUp(String[] a, String[] b) {
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if(!a[i].equals("") && !b[i].equals("") && a[i].charAt(0) == b[i].charAt(0)){
				count++;
			}
		}
		return count;
		
		/*for (int i = 0; i < b.length; i++) {
			if((!a[i].isEmpty() && !b[i].isEmpty()) && a[i].charAt(0) == b[i].charAt(0)){
				count++;
			}
		}*/
	}


}
