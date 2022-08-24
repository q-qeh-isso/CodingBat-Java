package array3;

/**
 * Say that a "clump" in an array is a series of 2 or more adjacent 
 * elements of the same value. Return the number of clumps in 
 * the given array.
 * 
 * countClumps({1, 2, 2, 3, 4, 4}) = 2
 * countClumps({1, 1, 2, 1, 1}) = 2
 * countClumps({1, 1, 1, 1, 1}) = 1
 * 
 *  
 *
 */

public class CountClumps {
	
	public static void main(String[] args) {
		int[] nums = new int[]{1, 1, 2, 1, 1};
		System.out.print(countClumps(nums));
		//nums = maxSpan(nums);
		//for(int n : nums) System.out.print(n+" ");
	}
	
	public static int countClumps(int[] nums) {
		int count = 0;
		int res = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1]){
				count++;
				for (int j = i+1; j < nums.length-1; j++) {
					if(nums[j] == nums[i]) {
						i++;
					} else break;
				}
			}
		}
		return count;
	}


}
