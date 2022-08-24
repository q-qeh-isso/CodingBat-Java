package array3;

/**
 * Given two arrays of ints sorted in increasing order, 
 * outer and inner, return true if all of the numbers in 
 * inner appear in outer. The best solution makes only a 
 * single "linear" pass of both arrays, taking advantage 
 * of the fact that both arrays are already in sorted order.
 * 
 * linearIn({1, 2, 4, 6}, {2, 4}) = true
 * linearIn({1, 2, 4, 6}, {2, 3, 4}) = false
 * linearIn({1, 2, 4, 4, 6}, {2, 4}) = true
 * 
 *  
 *
 */

public class LinearIn {

	public static void main(String[] args) {
		int[] outer = new int[]{1, 2, 4, 6};
		int[] inner = new int[]{2, 4};
		System.out.print(linearIn(outer, inner));
		//nums = maxSpan(nums);
		//for(int n : nums) System.out.print(n+" ");
	}

	public static boolean linearIn(int[] outer, int[] inner) {
		int indexInner = 0;
		int indexOuter = 0;
		while (indexInner < inner.length && indexOuter < outer.length) {
			if (outer[indexOuter] == inner[indexInner]) {
				indexOuter++;
				indexInner++;
			} else indexOuter++;
		}
		return (indexInner == inner.length);
	}


}
