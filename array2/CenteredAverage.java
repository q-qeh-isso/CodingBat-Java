package array2;


/**
 * Return the "centered" average of an array of ints, 
 * which we'll say is the mean average of the values, except ignoring 
 * the largest and smallest values in the array. If there are multiple 
 * copies of the smallest value, ignore just one copy, and likewise 
 * for the largest value. Use int division to produce the final average. 
 * You may assume that the array is length 3 or more.
 * 
 * centeredAverage({1, 2, 3, 4, 100}) = 3
 * centeredAverage({1, 1, 5, 5, 10, 8, 7}) = 5
 * centeredAverage({-10, -4, -2, -4, -2, 0}) = -3
 * 
 *  
 *
 */

public class CenteredAverage {

	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 3, 4, 100};
		System.out.println(centeredAverage(nums));
	}

	public static int centeredAverage(int[] nums) {
		int max = nums[0];
	    int min = nums[0];
	    int sum = 0;
	 
	    for (int i = 0; i < nums.length; i++) {
	        sum += nums[i];
	        if (nums[i] > max) max = nums[i];
	        if (nums[i] < min) min = nums[i];
	    }
	    return (sum - (max + min)) / (nums.length - 2);
	    
	    
		/*int countMax = 0;
		int countMin = 0;
		int avg = 0;
		java.util.Arrays.sort(nums);
		for(int i : nums) System.out.print(i +" ");
		int max = nums[nums.length-1];
		int min = nums[0];
		
		for (int i = 0, j = nums.length-1; i < nums.length-1; i++, j--) {
			if(nums[0] == nums[i]){
				countMin++;
			} else break;
			if(nums[nums.length-1] == nums[j]){
				countMax++;
			} else break;
		}
		if(nums.length%2 == 0){
			avg = (nums[(nums.length/2)-1] + nums[nums.length/2]) / 2;
		} else {
			avg = nums[nums.length/2];
		}
		
		System.out.println("\nmax = "+max);
		System.out.println("min = "+min);
		System.out.println("countMax = "+countMax);
		System.out.println("countMin = "+countMin);		

		return avg;*/
	}


}
