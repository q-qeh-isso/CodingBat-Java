package array1;

/**
 * Given an array of ints length 3, return a new 
 * array with the elements in reverse order, 
 * so {1, 2, 3} becomes {3, 2, 1}.
 * 
 * reverse3({1, 2, 3}) = {3, 2, 1}
 * reverse3({5, 11, 9}) = {9, 11, 5}
 * reverse3({7, 0, 0}) = {0, 0, 7}
 * 
 *  
 *
 */

public class Reverse3 {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3};
		nums = reverse3(nums);
		//System.out.println(reverse3(nums));
		
		for(int n : nums){
			System.out.print(n+", ");
		}
	}

	public static int[] reverse3(int[] nums) {
		int priEle = nums[0];
		int segEle = nums[1];
		int terEle = nums[2];
		nums[0] = terEle;
		nums[1] = segEle;
		nums[2] = priEle;


		return nums;
	}


}
