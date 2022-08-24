package array1;

/**
 * Given an array of ints, return a new array 
 * length 2 containing the first and last 
 * elements from the original array. 
 * The original array will be length 1 or more.
 * 
 * makeEnds({1, 2, 3}) = {1, 3}
 * makeEnds({1, 2, 3, 4}) = {1, 4}
 * makeEnds({7, 4, 6, 2}) = {7, 2}
 * 
 *  
 *
 */

public class MakeEnds {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3};
		nums = makeEnds(nums);

		for(int n : nums){
			System.out.print(n+", ");
		}
	}

	public static int[] makeEnds(int[] nums) {
		int[] c = new int[] {nums[0], nums[nums.length-1]};

		return c;
	}


}
