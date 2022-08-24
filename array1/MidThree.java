package array1;

/**
 * Given an array of ints of odd length, return 
 * a new array length 3 containing the elements 
 * from the middle of the array. 
 * The array length will be at least 3.
 * 
 * midThree({1, 2, 3, 4, 5}) = {2, 3, 4}
 * midThree({8, 6, 7, 5, 3, 0, 9}) = {7, 5, 3}
 * midThree({1, 2, 3}) = {1, 2, 3}
 * 
 *  
 *
 */

public class MidThree {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5};
		nums = midThree(nums);

		for(int n : nums){
			System.out.print(n+", ");
		}
	}

	public static int[] midThree(int[] nums) {
		if(nums.length == 3){
			return nums;
		}
		if( nums.length % 2 != 0 ){
			int[] tempArr = new int[3];
			tempArr[0] = nums[nums.length/2-1];
			tempArr[1] = nums[nums.length/2];
			tempArr[2] = nums[nums.length/2+1];
			return tempArr;
		}
		return nums;
	}


}
