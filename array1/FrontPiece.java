package array1;

/**
 * Given an int array of any length, return a new 
 * array of its first 2 elements. 
 * If the array is smaller than length 2, 
 * use whatever elements are present.
 * 
 * frontPiece({1, 2, 3}) = {1, 2}
 * frontPiece({1, 2}) = {1, 2}
 * frontPiece({1}) = {1}
 * 
 *  
 *
 */

public class FrontPiece {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3};
		nums = frontPiece(nums);

		for(int n : nums){
			System.out.print(n+", ");
		}
	}

	public static int[] frontPiece(int[] nums) {
		if(nums.length > 2){
			int[] newNums = new int[2];
			newNums[0] = nums[0];
			newNums[1] = nums[1];
			return newNums;
		}
		return nums;
	}


}
