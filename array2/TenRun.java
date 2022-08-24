package array2;

/**
 * For each multiple of 10 in the given array, change all the values 
 * following it to be that multiple of 10, until encountering another 
 * multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
 * 
 * tenRun({2, 10, 3, 4, 20, 5}) = {2, 10, 10, 10, 20, 20}
 * tenRun({10, 1, 20, 2}) = {10, 10, 20, 20}
 * tenRun({10, 1, 9, 20}) = {10, 10, 10, 20}
 * 
 *  
 *
 */

public class TenRun {

	public static void main(String[] args) {
		int[] nums = new int[]{10, 1, 9, 20};
		nums = tenRun(nums);
		for(int n : nums) System.out.print(n+" ");
	}

	public static int[] tenRun(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%10 == 0){
				int count = 0;
				for (int j = i+1; j < nums.length; j++) {
					if(nums[j] != nums[i] && nums[j]%10 != 0){
						count++;
						nums[j] = nums[i];
					} else break;
				}
				i+=count;
			}
		}		
		return nums;
		/*boolean replace = false;
		int multiple = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0) {
				if (!replace) {
					replace = true;
					multiple = nums[i];
				} else
					multiple = nums[i];
			}
			if (nums[i] % 10 != 0 && replace) nums[i] = multiple;
		}
		return nums;*/
	}


}
