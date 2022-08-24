package array1;

/**
 * Start with 2 int arrays, a and b, each length 2. 
 * Consider the sum of the values in each array. 
 * Return the array which has the largest sum. 
 * In event of a tie, return a.
 * 
 * biggerTwo({1, 2}, {3, 4}) = {3, 4}
 * biggerTwo({3, 4}, {1, 2}) = {3, 4}
 * biggerTwo({1, 1}, {1, 2}) = {1, 2}
 * 
 *  
 *
 */

public class BiggerTwo {
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,2};
		int[] nums2 = new int[]{3,4};
		
		nums = biggerTwo(nums,nums2);
		
		for(int n : nums){
			System.out.print(n+", ");
		}
	}
	
	public static int[] biggerTwo(int[] a, int[] b) {
		  int sumA = a[0] + a[1];
		  int sumB = b[0] + b[1];
		  
		  if(sumA >= sumB) return a;
		  
		  return b;
		}


}
