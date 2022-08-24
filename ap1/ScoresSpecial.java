package ap1;

/**
 * Given two arrays, A and B, of non-negative int scores. 
 * A "special" score is one which is a multiple of 10, such as 40 or 90. 
 * Return the sum of largest special score in A and the largest 
 * special score in B. To practice decomposition, write a separate 
 * helper method which finds the largest special score in an array. 
 * Write your helper method after your scoresSpecial() method in 
 * the JavaBat text area.
 * 
 * scoresSpecial({12, 10, 4}, {2, 20, 30}) = 40
 * scoresSpecial({20, 10, 4}, {2, 20, 10}) = 40
 * scoresSpecial({12, 11, 4}, {2, 20, 31}) = 20
 * 
 *  
 *
 */

public class ScoresSpecial {
	
	public static void main(String[] args) {
		int[] a = new int[]{12, 10, 4};
		int[] b = new int[]{2, 20, 30};
		System.out.println(scoresSpecial(a, b));
	}
	
	public static int scoresSpecial(int[] a, int[] b) {
		int tst = findLargestMultiple(a)+findLargestMultiple(b);
		return tst;
	}
	
	public static int findLargestMultiple(int[] arr){
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%10 == 0 && arr[i] > largest){
				largest = arr[i];
			}
		}		
		return largest;
		
		/*for (int i = 0; i < arr.length; i++) {
			if(arr[i]%10 == 0){
				largest = (largest < arr[i]) ? arr[i] : largest;
			}
		}*/
	}


}
