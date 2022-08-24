package ap1;

/**
 * Given an array of positive ints, return a new array of 
 * length "count" containing the first even numbers from 
 * the original array. The original array will contain at 
 * least "count" even numbers.
 * 
 * copyEvens({3, 2, 4, 5, 8}, 2) = {2, 4}
 * copyEvens({3, 2, 4, 5, 8}, 3) = {2, 4, 8}
 * copyEvens({6, 1, 2, 4, 5, 8}, 3) = {6, 2, 4}
 * 
 *
 */

public class CopyEvens {
	
	public static void main(String[] args) {
		int[] nums = new int[]{3,2,4,5,8};
		nums = copyEvens(nums,2);
		for(int n : nums) System.out.print(n+" ");
	}
	
	public static int[] copyEvens(int[] nums, int count) {
		int[] arr = new int[count];
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2 == 0) arr[pos++] = nums[i];
			if(pos == count) break;
		}
		return arr;
	}


}
