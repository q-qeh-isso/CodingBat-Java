package string3;

/**
 * We'll say that a lowercase 'g' in a string is "happy" if there is 
 * another 'g' immediately to its left or right. Return true if all 
 * the g's in the given string are happy.
 * 
 * gHappy("xxggxx") = true
 * gHappy("xxgxx") = false
 * gHappy("xxggyygxx") = false
 * 
 *  
 *
 */

public class GHappy {

	public static void main(String[] args) {
		System.out.println(gHappy("yyygggxyy"));
	}

	public static boolean gHappy(String str) {
		for (int i = 0; i < str.length(); i++) {
			if(i <= str.length()-2 && str.substring(i, i+1).equals("g") &&
					str.substring(i+1, i+2).equals("g")	){
				continue;
			} else if(i > 0 && str.substring(i, i+1).equals("g") && 
					str.substring(i-1, i).equals("g") ){
				continue;
			} else if(str.substring(i, i+1).equals("g") ){
				return false;
			}
		}
		
		return true;	
	}


}
