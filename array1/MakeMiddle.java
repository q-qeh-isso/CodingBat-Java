package array1;

/**
 * Given an array of ints of even length, 
 * return a new array length 2 containing the 
 * middle two elements from the original array. 
 * The original array will be length 2 or more.
 * 
 * makeMiddle({1, 2, 3, 4}) = {2, 3}
 * makeMiddle({7, 1, 2, 3, 4, 9}) = {2, 3}
 * makeMiddle({1, 2}) = {1, 2}
 * 
 *  
 *
 */

public class MakeMiddle {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4};
		nums = makeMiddle(nums);

		for(int n : nums){
			System.out.print(n+", ");
		}
	}

	public static int[] makeMiddle(int[] nums) {
		int[] numsTemp = new int[2];
		if(nums.length % 2 == 0){
			numsTemp[0] = nums[(nums.length/2)-1];
			numsTemp[1] = nums[(nums.length/2)];
		}
		return numsTemp;
	}


}
