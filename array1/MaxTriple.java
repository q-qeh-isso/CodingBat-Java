package array1;

/**
 * Given an array of ints of odd length, look at 
 * the first, last, and middle values in the 
 * array and return the largest. 
 * The array length will be a least 1.
 * 
 * maxTriple({1, 2, 3}) = 3
 * maxTriple({1, 5, 3}) = 5
 * maxTriple({5, 2, 3}) = 5
 * 
 *  
 *
 */

public class MaxTriple {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3};

		System.out.println(maxTriple(nums));
	}

	public static int maxTriple(int[] nums) {
		int first = nums[0];
		int last = nums[nums.length-1];
		int mid = nums[nums.length/2];
		if(nums.length % 2 != 0){
			first = nums[0];
			last = nums[nums.length-1];
			mid = nums[nums.length/2];
		}
		if(first > mid && first > last){
			return first;
		}
		if(last > first && last > mid){
			return last;
		}
		if(mid > first && mid > last){
			return mid;
		}
		return 0;
	}


}
