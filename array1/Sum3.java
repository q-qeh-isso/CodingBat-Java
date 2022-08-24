package array1;

/**
 * Given an array of ints length 3, return the 
 * sum of all the elements.
 * 
 * sum3({1, 2, 3}) = 6
 * sum3({5, 11, 2}) = 18
 * sum3({7, 0, 0}) = 7
 * 
 *  
 *
 */

public class Sum3 {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3};
		System.out.println(sum3(nums));
	}

	public static int sum3(int[] nums) {
		/*int i = 0;
		  int soma = 0;
		  while(i < nums.length){
		    soma += nums[i];    
		    i++;
		  }
		  return soma;*/

		return nums[0]+nums[1]+nums[2];

	}


}
