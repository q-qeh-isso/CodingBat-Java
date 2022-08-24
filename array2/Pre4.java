package array2;

/**
 * Given a non-empty array of ints, return a new array containing the 
 * elements from the original array that come before the first 4 in 
 * the original array. The original array will contain at least one 4. 
 * Note that it is valid in java to create an array of length 0.
 * 
 * pre4({1, 2, 4, 1}) = {1, 2}
 * pre4({3, 1, 4}) = {3, 1}
 * pre4({1, 4, 4}) = {1}
 * 
 *  
 *
 */

public class Pre4 {

	public static void main(String[] args) {
		int[] nums = new int[]{1,4,4};
		nums = pre4(nums);
		//System.out.println(pre4(nums));
		for(int n : nums) System.out.print(n+" ");
	}

	public static int[] pre4(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(i>0 && nums[i]==4){
				int[] newNums = new int[i];
				for (int j = 0; j < i; j++) {
					newNums[j] = nums[j];
				}
				return newNums;
			} else if(i==0 && nums[i]==4){
				break;
			}
		}
		return new int[]{};
		/*int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) count++;
            else break;
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++)
            result[i] = nums[i];
        return result;*/
	}


}
