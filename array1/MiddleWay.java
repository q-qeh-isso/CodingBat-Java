package array1;

/**
 * Given 2 int arrays, a and b, each length 3, 
 * return a new array length 2 containing 
 * their middle elements.
 * 
 * middleWay({1, 2, 3}, {4, 5, 6}) = {2, 5}
 * middleWay({7, 7, 7}, {3, 8, 0}) = {7, 8}
 * middleWay({5, 2, 9}, {1, 4, 5}) = {2, 4}
 * 
 *  
 *
 */

public class MiddleWay {

	public static void main(String[] args) {
		int[] nums = new int[]{7,7,7};
		int[] nums2 = new int[]{3,8,0};

		nums = middleWay(nums, nums2);

		for(int n : nums){
			System.out.print(n+", ");
		}
	}

	public static int[] middleWay(int[] a, int[] b) {
		int[] c = new int[] {a[1], b[1]};
		return c;
	}


}
