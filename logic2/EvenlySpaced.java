package logic2;

/**
 * Given three ints, a b c, one of them is small, 
 * one is medium and one is large. 
 * Return true if the three values are evenly spaced, 
 * so the difference between small and medium is the 
 * same as the difference between medium and large.
 * 
 * evenlySpaced(2, 4, 6) = true
 * evenlySpaced(4, 6, 2) = true
 * evenlySpaced(4, 6, 3) = false
 * 
 *  
 *
 */

public class EvenlySpaced {

	public static void main(String[] args) {
		System.out.println(evenlySpaced(2,4,6));

	}

	public static boolean evenlySpaced(int a, int b, int c) {
		boolean result = false;
		int small = a;
		int mid = 0;
		int larg = a;

		if(b > larg) larg = b;
		if(c > larg) larg = c;		
		if(b < small) small = b;
		if(c < small) small = c;
		if(larg == b && small == c) mid = a;
		if(larg == c && small == b) mid = a;
		if(larg == a && small == b) mid = c;
		if(larg == a && small == c) mid = b;
		if(larg == b && small == a) mid = c;
		if(larg == c && small == a) mid = b;
		
		if(Math.abs(small)-Math.abs(mid) == Math.abs(mid)-Math.abs(larg) || Math.abs(mid)-Math.abs(larg) == Math.abs(small)-Math.abs(larg) ){
			result = true;
		}
		if(a==b || b==c || a==c) result = false;
		if(a==b && b==c && a==c) result = true;
		return result;
	}

}
