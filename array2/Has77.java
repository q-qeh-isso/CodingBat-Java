package array2;

/**
 * Given an array of ints, return true if the array contains two 7's next 
 * to each other, or there are two 7's separated by one element, 
 * such as with {7, 1, 7}.
 * 
 * has77({1, 7, 7}) = true
 * has77({1, 7, 1, 7}) = true
 * has77({1, 7, 1, 1, 7}) = false
 * 
 *  
 *
 */

public class Has77 {
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,7,1,1,7};
		System.out.println(has77(nums));
	}

	public static boolean has77(int[] nums) {
		boolean flag = false;
		for (int i = 0; i < nums.length-1; i++) {
			if(i<nums.length-1 && nums[i] == 7 && nums[i+1] == 7) return true;
			if(i<nums.length-2 && nums[i] == 7 && nums[i+2] == 7) return true;
		}
		return flag;		
	}

}
