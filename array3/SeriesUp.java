package array3;

/**
 * Given n>=0, create an array with the pattern 
 * {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} 
 * (spaces added to show the grouping). 
 * Note that the length of the array will be 1 + 2 + 3 ... + n, 
 * which is known to sum to exactly n*(n + 1)/2.
 * 
 * seriesUp(3) = {1, 1, 2, 1, 2, 3}
 * seriesUp(4) = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
 * seriesUp(2) = {1, 1, 2}
 * 
 *  
 *
 */

public class SeriesUp {
	
	public static void main(String[] args) {
		int[] nums = seriesUp(2);
		for(int n : nums) System.out.print(n+" ");
	}
	
	public static int[] seriesUp(int n) {
		int[] res = new int[n*(n+1)/2];
		System.out.println("arr length = "+res.length);
		int pos = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) res[pos++] = j;
		}
		return res;
	}


}
