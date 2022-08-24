package string1;

/**
 * Given a string, if the string begins with 
 * "red" or "blue" return that color string, 
 * otherwise return the empty string.
 * 
 * seeColor("redxx") = "red"
 * seeColor("xxred") = ""
 * seeColor("blueTimes") = "blue"
 * 
 *  
 *
 */

public class SeeColor {

	public static void main(String[] args) {
		System.out.println(seeColor("redxx"));
	}

	public static String seeColor(String str) {
		if(str.length() < 3){
			return "";
		}
		if(str.length() >= 3 && str.substring(0,3).equals("red")){
			return "red";
		}
		if(str.length() >= 4 && str.substring(0,4).equals("blue")){
			return "blue";
		}
		return "";
	}


}
