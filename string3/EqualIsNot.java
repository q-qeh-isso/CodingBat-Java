package string3;

/**
 * Given a string, return true if the number of appearances of "is" anywhere 
 * in the string is equal to the number of appearances of "not" anywhere in 
 * the string (case sensitive).
 * 
 * equalIsNot("This is not") = false
 * equalIsNot("This is notnot") = true
 * equalIsNot("noisxxnotyynotxisi") = true
 * 
 *  
 *
 */

public class EqualIsNot {
	
	public static void main(String[] args) {
		System.out.println(equalIsNot("mis3notpotbotis"));
		//String tst = "This is notnot";
		//int idx = tst.indexOf("not", 12);
		//System.out.println(tst.substring(tst.length()-1));
		
	}
	
	public static boolean equalIsNot(String str) {
		int countIs = 0;
		int countNot = 0;
		for (int i = 0; i < str.length(); i++) {
			if(i <= str.length()-2 && str.substring(i, i+2).equals("is")){
				countIs++;
			}
			if(i <= str.length()-3 && str.substring(i, i+3).equals("not")){
				countNot++;
			}
		}
		if(countIs == countNot){
			return true;
		}		
		return false;		
	}


}
