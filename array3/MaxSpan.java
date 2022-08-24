package array3;

/**
 * Consider the leftmost and righmost appearances of some value in an array. 
 * We'll say that the "span" is the number of elements between the two inclusive.
 *  A single value has a span of 1. Returns the largest span found in the 
 *  given array. (Efficiency is not a priority.)
 *  
 *  maxSpan({1, 2, 1, 1, 3}) = 4
 *  maxSpan({1, 4, 2, 1, 4, 1, 4}) = 6
 *  maxSpan({1, 4, 2, 1, 4, 4, 4}) = 6
 * 
 *  
 *
 */

public class MaxSpan {

	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 1, 1, 3};
		System.out.print(maxSpan(nums));
		//nums = maxSpan(nums);
		//for(int n : nums) System.out.print(n+" ");
	}

	public static int maxSpan(int[] nums) {
		int endSpanIdx = 0;
		int spanFinal = 0;
		int spanStart = 0;
		if(nums.length > 0){
			for (int i = 0; i < nums.length; i++) {
				for (int j = i+1; j < nums.length; j++) {
					if(nums[j] == nums[i]){
						endSpanIdx = j;
					}
				}
				if(spanFinal < endSpanIdx){
					spanFinal = endSpanIdx;
					spanStart = i;
					System.out.println("spanFinal = "+spanFinal);
					System.out.println("spanStart = "+spanStart);
				}
			}
		} else return 0;

		int res = Math.abs(spanFinal-spanStart)+1;

		return res;
		/*if (nums.length > 0) {
	        int maxSpan = 1;
	        for (int i = 0; i < nums.length; i++)
	            for (int j = nums.length - 1; j > i; j--)
	                if (nums[j] == nums[i]) {
	                    int count = (j - i) + 1;
	                    if (count > maxSpan) maxSpan = count;
	                    break;
	                }
	        return maxSpan;
	    } else return 0;*/
	}


}
