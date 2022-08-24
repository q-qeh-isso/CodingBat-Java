package array1;

/**
 * Given 2 int arrays, a and b, of any length, 
 * return a new array with the first element 
 * of each array. 
 * If either array is length 0, ignore that array.
 * 
 * front11({1, 2, 3}, {7, 9, 8}) = {1, 7}
 * front11({1}, {2}) = {1, 2}
 * front11({1, 7}, {}) = {1}
 * 
 *  
 *
 */

public class Front11 {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3};
		int[] nums2 = new int[]{7,9,8};

		nums = front11(nums,nums2);

		for(int n : nums){
			System.out.print(n+", ");
		}
	}

	public static int[] front11(int[] a, int[] b) {
		int aLen = a.length;
		int bLen = b.length;
		int flagA = 1;
		if(aLen != 0 && bLen != 0) {
			flagA = 2;
		}  

		int[] newA = new int[flagA];
		if(a.length == 0 && b.length == 0){
			return a;
		}
		if(a.length == 0 && b.length != 0){
			newA[0] = b[0];
			return newA;
		}
		if(b.length == 0 && a.length != 0){
			newA[0] = a[0];
			return newA;
		}
		if(a.length >= 1 && b.length >= 1){
			newA[0] = a[0];
			newA[1] = b[0];
			return newA;
		} else {
			return newA;
		}

	}


}
