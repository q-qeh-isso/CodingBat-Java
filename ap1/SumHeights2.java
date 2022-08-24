package ap1;

/**
 * (A variation on the sumHeights problem.) We have an array of heights, 
 * representing the altitude along a walking trail. Given start/end indexes 
 * into the array, return the sum of the changes for a walk beginning at the 
 * start index and ending at the end index, however increases in height 
 * count double. For example, with the heights 
 * {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7. 
 * The start end end index will both be valid indexes into the array 
 * with start <= end.
 * 
 * sumHeights2({5, 3, 6, 7, 2}, 2, 4) = 7
 * sumHeights2({5, 3, 6, 7, 2}, 0, 1) = 2
 * sumHeights2({5, 3, 6, 7, 2}, 0, 4) = 15
 * 
 *  
 *
 */

public class SumHeights2 {
	
	public static void main(String[] args) {
		int[] words = new int[]{5, 3, 6, 7, 2};
		System.out.println(sumHeights2(words, 2, 4));
	}
	
	public static int sumHeights2(int[] heights, int start, int end) {
		int res = 0;
		for (int i = start; i <= end-1; i++) {
			if(heights[i] < heights[i+1]){
				res += ( 2 * Math.abs(heights[i]-heights[i+1]) );
			} else {
				res += Math.abs(heights[i]-heights[i+1]);
			}
		}
		return res;
	}

}
