package warmup1;

/**
 * Given a string, if the string "del" appears starting 
 * at index 1, return a string where that "del" has 
 * been deleted. Otherwise, 
 * return the string unchanged.
 * 
 * delDel("adelbc") = "abc"
 * delDel("adelHello") = "aHello"
 * delDel("adedbc") = "adedbc"
 * 
 *  
 *
 */

public class DelDel {
	
	public static void main(String[] args) {
		System.out.println(delDel("adelbc"));

	}


	public static String delDel(String str) {

		if(str.length() >= 4 && str.substring(1,4).equals("del")){
			String frontStr = str.substring(0,1);
			String backStr = str.substring(4);
			return frontStr + backStr;
		}

		return str;

	}

}
