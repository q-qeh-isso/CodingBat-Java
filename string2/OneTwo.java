package string2;

import java.util.*;

/**
 * Given a string, compute a new string by moving the first 
 * char to come after the next two chars, so "abc" yields "bca". 
 * Repeat this process for each subsequent group of 3 chars, 
 * so "abcdef" yields "bcaefd". Ignore any group of fewer 
 * than 3 chars at the end.
 * 
 * oneTwo("abc") = "bca"
 * oneTwo("tca") = "cat"
 * oneTwo("tcagdo") = "catdog"
 * 
 *  
 *
 */

public class OneTwo {
	
	public static void main(String[] args) {
		System.out.println(oneTwo("tcagdo"));
	}
	
	public static String oneTwo(String str) {
		
		// TIPO 1
		String res = "";
		
		List<String> threes = new ArrayList<String>();
		for (int i = 0; i < str.length()-2; i+=3) {
			threes.add(""+str.charAt(i+1)+str.charAt(i+2)+str.charAt(i));
		}
		
		for(String s : threes){
			System.out.println("strArr = "+s);
			res += s;
		}
		
		return res;
		
		// TIPO 2
		/*String res = "";
		String[] strArr = new String[str.length()/3];
		int c = 0;
		for (int i = 0; i < str.length(); i+=3) {
			String three = str.substring(i, i+3);
			strArr[c++] = ""+str.charAt(i+1)+str.charAt(i+2)+str.charAt(i);
			if(c>strArr.length-1){
				break;
			}
		}
		for(String s : strArr){
			//System.out.println("strArr = "+s);
			res += s;
		}
		
		return res;*/
		
		
		// TIPO 3 - with regex
		/*//Pattern p = Pattern.compile("(?<=\\G...)");		
		String res = "";
		String[] elems = str.split("(?<=\\G...)");
		System.out.println("elems length = "+elems.length);
		for(String s : elems){
			System.out.println(s);
		}
		for (int i = 0; i < elems.length; i++) {
			if(elems[i].length() < 3){
				break;
			}
			res += ""+elems[i].charAt(1)+elems[i].charAt(2)+elems[i].charAt(0);
		}
		
		return res;*/
		
	}


}
