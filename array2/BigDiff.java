package array2;

/**
 * Given an array length 1 or more of ints, return the difference 
 * between the largest and smallest values in the array. 
 * Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) 
 * methods return the smaller or larger of two values.
 * 
 * bigDiff({10, 3, 5, 6}) = 7
 * bigDiff({7, 2, 10, 9}) = 8
 * bigDiff({2, 10, 7, 2}) = 8
 * 
 *  
 *
 */

public class BigDiff {
	
	public static void main(String[] args) {
		int[] nums = new int[]{2, 10, 7, 2};
		System.out.println(bigDiff(nums));
	}

	
	public static int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		int tempMax = 0;
		int tempMin = 0;
		for (int i = 0; i < nums.length; i++) {
			tempMax = Math.max(max, nums[i]);
			if(tempMax > max){
				max = tempMax;
			}
			tempMin = Math.min(min, nums[i]);
			if(tempMin < min){
				min = tempMin;
			}
		}
		
		return Math.abs(max-min);
	}

}
