package array2;

/**
 * Return an array that contains the exact same numbers as the given array, 
 * but rearranged so that all the even numbers come before all the odd numbers. 
 * Other than that, the numbers can be in any order. You may modify and 
 * return the given array, or make a new array.
 * 
 * evenOdd({1, 0, 1, 0, 0, 1, 1}) = {0, 0, 0, 1, 1, 1, 1}
 * evenOdd({3, 3, 2}) = {2, 3, 3}
 * evenOdd({2, 2, 2}) = {2, 2, 2}
 * 
 *  
 *
 */

public class EvenOdd {
	
	public static void main(String[] args) {
		int[] nums = new int[]{1, 0, 1, 0, 0, 1, 1};
		nums = evenOdd(nums);
		//System.out.println(tenRun(nums));
		for(int n : nums) System.out.print(n+" ");
	}
	
	public static int[] evenOdd(int[] nums) {
		int[] res = new int[nums.length];
		int numEven = 0;
		int numOdd = nums.length-1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2 == 0) res[numEven++] = nums[i];
			else res[numOdd--] = nums[i]; 
		}
		
		return res;
	}


}
