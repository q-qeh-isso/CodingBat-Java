package array1;

/**
 * Given an array of ints length 3, return an array 
 * with the elements "rotated left" 
 * so {1, 2, 3} yields {2, 3, 1}.
 * 
 * rotateLeft3({1, 2, 3}) = {2, 3, 1}
 * rotateLeft3({5, 11, 9}) = {11, 9, 5}
 * rotateLeft3({7, 0, 0}) = {0, 0, 7}
 * 
 *  
 *
 */

public class RotateLeft3 {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3};
		nums = rotateLeft3(nums);
		
		for(int n : nums){
			System.out.print(n+", ");
		}
	}

	public static int[] rotateLeft3(int[] nums) {
		int i = 0;
		int temp = nums[0];

		while(i <= nums.length-1){
			if(i == nums.length-1){
				nums[i] = temp;
			} else {
				nums[i] = nums[i+1];
			}
			i++;
		}
		return nums;
	}


}
