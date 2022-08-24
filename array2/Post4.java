package array2;

/**
 * Given a non-empty array of ints, return a new array containing the 
 * elements from the original array that come after the last 4 in the 
 * original array. The original array will contain at least one 4. 
 * Note that it is valid in java to create an array of length 0.
 * 
 * post4({2, 4, 1, 2}) = {1, 2}
 * post4({4, 1, 4, 2}) = {2}
 * post4({4, 4, 1, 2, 3}) = {1, 2, 3}
 * 
 *  
 *
 */

public class Post4 {
	
	public static void main(String[] args) {
		int[] nums = new int[]{4, 4, 1, 2, 3};
		nums = post4(nums);
		//System.out.println(pre4(nums));
		for(int n : nums) System.out.print(n+" ");
	}
	
	public static int[] post4(int[] nums) {
		int count4Idx = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 4) count4Idx = i;
		}

		int[] res = new int[nums.length-(count4Idx+1)];
		//int[] newArr = new int[nums.length-count4Idx-1];
		for (int i = 0, j = count4Idx+1; j < nums.length; i++, j++) {
			res[i] = nums[j];
		}
		return res;
	}


}
