package ap1;

/**
 * Given a positive int n, return true if it contains a 1 digit. 
 * Note: use % to get the rightmost digit, and / to discard the 
 * rightmost digit.
 * 
 * hasOne(10) = true
 * hasOne(22) = false
 * hasOne(220) = false
 * 
 *
 */

public class HasOne {
	
	public static void main(String[] args) {
		//String[] words = new String[]{"a", "bb", "b", "ccc"};
		System.out.println(hasOne(10));
	}
	
	public static boolean hasOne(int n) {
		while (n > 0) {
	        if (n % 10 == 1) return true;
	        n = n / 10;
	    }
	    return false;
	}

}
