package logic1;

/**
 * Given three ints, a b c, return true if two or more 
 * of them have the same rightmost digit. 
 * The ints are non-negative. 
 * Note: the % "mod" operator computes the remainder, 
 * e.g. 17 % 10 is 7.
 * 
 * lastDigit(23, 19, 13) = true
 * lastDigit(23, 19, 12) = false
 * lastDigit(23, 19, 3) = true
 * 
 *  
 *
 */

public class LastDigit {

	public static void main(String[] args) {
		System.out.println(lastDigit(23,19,13));
	}

	public static boolean lastDigit(int a, int b, int c) {
		String as = String.valueOf(a);
		as = as.substring(as.length()-1);
		String bs = String.valueOf(b);
		bs = bs.substring(bs.length()-1);
		String cs = String.valueOf(c);
		cs = cs.substring(cs.length()-1);

		if( as.equals(bs) || bs.equals(cs) || cs.equals(as) ){
			return true;
		}
		return false;
	}


}
