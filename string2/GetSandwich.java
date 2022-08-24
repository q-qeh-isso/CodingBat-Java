package string2;

/**
 * A sandwich is two pieces of bread with something in between. 
 * Return the string that is between the first and last appearance 
 * of "bread" in the given string, or return the empty string "" if there 
 * are not two pieces of bread.
 * 
 * getSandwich("breadjambread") = "jam"
 * getSandwich("xxbreadjambreadyy") = "jam"
 * getSandwich("xxbreadyy") = ""
 * 
 *  
 *
 */

public class GetSandwich {
	
	public static void main(String[] args) {
		System.out.println(getSandwich("xxbreadyy"));
	}
	
	public static String getSandwich(String str) {
		int firstIdx = str.indexOf("bread");
		//String first = str.substring(firstIdx, firstIdx+5);
		int lastIdx = str.lastIndexOf("bread");
		//String last = str.substring(lastIdx, firstIdx+5);
		if(firstIdx != lastIdx){
		  return str.substring(firstIdx+5,lastIdx);
		} else {
			return "";
		}
		  
	}


}
