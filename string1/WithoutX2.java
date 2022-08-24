package string1;

/**
 * Given a string, if one or both of the first 2 
 * chars is 'x', return the string without those 'x' chars, 
 * and otherwise return the string unchanged. 
 * This is a little harder than it looks.
 * 
 * withoutX2("xHi") = "Hi"
 * withoutX2("Hxi") = "Hi"
 * withoutX2("Hi") = "Hi"
 * 
 *  
 *
 */

public class WithoutX2 {

	public static void main(String[] args) {
		System.out.println(withoutX2("xHi"));
	}

	public static String withoutX2(String str) {
		if(str.length() == 0 ){
			return "";
		}
		if(str.length() == 1 && str.equals("x")){
			return "";
		}

		if(str.substring(0,2).equals("xx")) {
			return str.substring(2);
		}

		if(str.substring(0,1).equals("x")) {
			return str.substring(1);
		}

		if(str.substring(1,2).equals("x")) {
			return str.substring(0,1) + str.substring(2);
		}

		return str;
	}

}
