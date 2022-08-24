package string2;

/**
 * Given a string, consider the prefix string made of the 
 * first N chars of the string. Does that prefix string 
 * appear somewhere else in the string? Assume that the string 
 * is not empty and that N is in the range 1..str.length().
 * 
 * prefixAgain("abXYabc", 1) = true
 * prefixAgain("abXYabc", 2) = true
 * prefixAgain("abXYabc", 3) = false
 * 
 *  
 *
 */

public class PrefixAgain {
	
	public static void main(String[] args) {
		System.out.println(prefixAgain("ab",1));
	}
	
	public static boolean prefixAgain(String str, int n) {
		String temp = str.substring(0, n);
		System.out.println("temp = "+temp);
		if(Math.abs(str.length()-temp.length()) < temp.length()){
			return false;
		}
		if(str.indexOf(temp,temp.length()) != -1){
			return true;
		}
		return false;
	}


}
