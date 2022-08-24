package string2;

/**
 * Given two strings, return true if either of the strings appears at 
 * the very end of the other string, ignoring upper/lower case differences 
 * (in other words, the computation should not be "case sensitive"). 
 * Note: str.toLowerCase() returns the lowercase version of a string.
 * 
 * endOther("Hiabc", "abc") - true
 * endOther("AbC", "HiaBc") - true
 * endOther("abc", "abXabc") - true
 * 
 *  
 *
 */

public class EndOther {

	public static void main(String[] args){
		System.out.println(endOther("Hiabc", "aBc"));
	}

	public static boolean endOther(String a, String b){
		String larger = (a.length() > b.length()) ? a : b;
		String small = (a.length() > b.length()) ? b : a;
		
		System.out.println("larger = "+larger);
		System.out.println("small = "+small);
		
		if( larger.substring(larger.length()-small.length()).equalsIgnoreCase(small) ){
			return true;
		}
		
		return false;

	}

}
