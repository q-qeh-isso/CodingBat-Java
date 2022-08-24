package array2;


/**
 * Return an array that contains the exact same numbers as the given array, 
 * but rearranged so that all the zeros are grouped at the start of the array. 
 * The order of the non-zero numbers does not matter. 
 * So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. 
 * You may modify and return the given array or make a new array.
 * 
 * zeroFront({1, 0, 0, 1}) = {0, 0, 1, 1}
 * zeroFront({0, 1, 1, 0, 1}) = {0, 0, 1, 1, 1}
 * zeroFront({1, 0}) = {0, 1}
 * 
 *  
 *
 */

public class ZeroFront {

	public static void main(String[] args) {
		int[] nums = new int[]{4, 0, 1, 0, 1};
		nums = zeroFront(nums);
		//System.out.println(pre4(nums));
		for(int n : nums) System.out.print(n+" ");
	}

	public static int[] zeroFront(int[] nums) {
		/*int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = nums[count];
				nums[count] = 0;
				count++;
			}
		}
		return nums;*/
		int[] res      = new int[nums.length];
		int zeroPos    = 0;
		int nonZeroPos = res.length - 1;

		for (int i = 0; i < nums.length; i++)
			if (nums[i] == 0)
				res[zeroPos++]    = 0;
			else
				res[nonZeroPos--] = nums[i];

		return res;

		/*java.util.Arrays.sort(nums);
		return nums;*/
	}


}
