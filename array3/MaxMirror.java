package array3;

/**
 * We'll say that a "mirror" section in an array is a group of 
 * contiguous elements such that somewhere in the array, the 
 * same group appears in reverse order. For example, the 
 * largest mirror section in 
 * {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). 
 * Return the size of the largest mirror section 
 * found in the given array.
 * 
 * maxMirror({1, 2, 3, 8, 9, 3, 2, 1}) = 3
 * maxMirror({1, 2, 1, 4}) = 3
 * maxMirror({7, 1, 2, 9, 7, 2, 1}) = 2
 * 
 *  
 *
 */

public class MaxMirror {

	public static void main(String[] args) {
		int[] nums = new int[]{1, 2, 1, 4};
		System.out.print(maxMirror(nums));
		//nums = maxSpan(nums);
		//for(int n : nums) System.out.print(n+" ");
	}

	public static int maxMirror(int[] nums) {
		int[] numsCopy = new int[nums.length];
		for (int i = nums.length - 1, j = 0; i >= 0; i--, j++)
			numsCopy[j] = nums[i];

		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			int pos1 = i;
			int pos2 = 0;
			boolean flag = false;

			while (pos1 < nums.length && pos2 < nums.length) {
				if (!flag) {
					if (nums[pos1] != numsCopy[pos2]) pos2++;
					else {
						flag = true;
						count = 1;
						pos1++;
						pos2++;
					}
				} else {
					if (nums[pos1] == numsCopy[pos2]) {
						count++;
						pos1++;
						pos2++;
					} else {
						if (count > max) max = count;
						pos1 = i;
						flag = false;
					}
				}
				if (count > max) max = count;
			}
		}
		return max;
	}



}
