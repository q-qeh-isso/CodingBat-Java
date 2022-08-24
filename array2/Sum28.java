package array2;

/**
 * Given an array of ints, return true if the sum of all 
 * the 2's in the array is exactly 8.
 * 
 * sum28({2, 3, 2, 2, 4, 2}) = true
 * sum28({2, 3, 2, 2, 4, 2, 2}) = false
 * sum28({1, 2, 3, 4}) = false
 * 
 *  
 *
 */

public class Sum28 {
	
	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4};
		System.out.println(sum28(nums));
	}
	
	public static boolean sum28(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 2) count++;
		}
		return 2*count == 8;		
	}

}
