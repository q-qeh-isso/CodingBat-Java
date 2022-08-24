package string3;

/**
 * Given a string, return the length of the largest "block" in the string. 
 * A block is a run of adjacent chars that are the same.
 * 
 * maxBlock("hoopla") = 2
 * maxBlock("abbCCCddBBBxx") = 3
 * maxBlock("") = 0
 * 
 *  
 *
 */

public class MaxBlock {

	public static void main(String[] args) {
		System.out.println(maxBlock("abbCCCddBBBxx"));
	}

	public static int maxBlock(String str) {
		int max = 0;

		for (int i = 0; i < str.length(); i++) {	
			int count = 0;
			for (int j = i; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)){
					count++;
				} else {
					break;
				}
			}
			if(count > max){
				max = count;
			}
		}
		return max;
	}


}
