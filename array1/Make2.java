package array1;

/**
 * Given 2 int arrays, a and b, return a new array 
 * length 2 containing, as much as will fit, 
 * the elements from a followed by the elements from b. 
 * The arrays may be any length, including 0, 
 * but there will be 2 or more elements available 
 * between the 2 arrays.
 * 
 * make2({4, 5}, {1, 2, 3}) = {4, 5}
 * make2({4}, {1, 2, 3}) = {4, 1}
 * make2({}, {1, 2}) = {1, 2}
 * 
 *  
 *
 */

public class Make2 {

	public static void main(String[] args) {
		int[] nums = new int[]{4,5};
		int[] nums2 = new int[]{1,2,3};

		nums = make2(nums,nums2);

		for(int n : nums){
			System.out.print(n+", ");
		}
	}

	public static int[] make2(int[] a, int[] b) {
		int[] newArr = new int[2];
		if(a.length > 1){
			newArr[0] = a[0];
			newArr[1] = a[1];
			return newArr;
		} else if(a.length == 1){
			newArr[0] = a[0];
			newArr[1] = b[0];
			return newArr;
		} else if(a.length == 0 && b.length >= 2){
			newArr[0] = b[0];
			newArr[1] = b[1];
			return newArr;
		}

		return newArr;
	}



}
