package array2;

/**
 * We'll say that a value is "everywhere" in an array if for every 
 * pair of adjacent elements in the array, at least one of the 
 * pair is that value. Return true if the given value is 
 * everywhere in the array.
 * 
 * isEverywhere({1, 2, 1, 3}, 1) = true
 * isEverywhere({1, 2, 1, 3}, 2) = false
 * isEverywhere({1, 2, 1, 3, 4}, 1) = false
 * 
 *  
 *
 */

public class IsEverywhere {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,1,3, 4};
		System.out.println(isEverywhere(nums, 1));
	}

	public static boolean isEverywhere(int[] nums, int val) {
		boolean flag1 = true;
		boolean flag2 = true;
		for (int i = 0; i < nums.length; i+=2) {
			if(nums[i] != val) flag1 = false;
			if(i<nums.length-1 && nums[i+1] != val) flag2 = false;
		}
		return flag1 || flag2;		
	}

}
