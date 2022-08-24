package array2;

/**
 * Given an array of ints, return true if the array 
 * contains no 1's and no 3's.
 * 
 * lucky13({0, 2, 4}) = true
 * lucky13({1, 2, 3}) = false
 * lucky13({1, 2, 4}) = false
 * 
 *  
 *
 */

public class Lucky13 {
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,4};
		System.out.println(lucky13(nums));
	}
	
	public static boolean lucky13(int[] nums) {	
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1 || nums[i] == 3 || nums[i] == 13) return false;
		}
		return true;		
	}

}
