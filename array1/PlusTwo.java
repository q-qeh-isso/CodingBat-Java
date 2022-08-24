package array1;

/**
 * Given 2 int arrays, each length 2, return a new 
 * array length 4 containing all their elements.
 * 
 * plusTwo({1, 2}, {3, 4}) = {1, 2, 3, 4}
 * plusTwo({4, 4}, {2, 2}) = {4, 4, 2, 2}
 * plusTwo({9, 2}, {3, 4}) = {9, 2, 3, 4}
 * 
 *  
 *
 */

public class PlusTwo {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2};
		int[] nums2 = new int[]{3,4};

		nums = plusTwo(nums,nums2);

		for(int n : nums){
			System.out.print(n+", ");
		}
	}

	public static int[] plusTwo(int[] a, int[] b) {
		int[] temp = new int[4];
		temp[0] = a[0];
		temp[1] = a[1];
		temp[2] = b[0];
		temp[3] = b[1];

		return temp;
	}


}
