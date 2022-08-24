package recursion1;

/**
 * Given a string, compute recursively (no loops) the number of 
 * times lowercase "hi" appears in the string.
 * 
 * countHi("xxhixx") = 1
 * countHi("xhixhix") = 2
 * countHi("hi") = 1
 * 
 *  
 *
 */

public class CountHi {
	
	public static void main(String[] args) {
		System.out.println(countHi("xxhixx"));
	}

	public static int countHi(String str) {
		if(str.length() < 2) return 0;
		if(str.substring(0,2).equals("hi")){
			return 1 + countHi(str.substring(2));
		}

		return countHi(str.substring(1));
	}


}
