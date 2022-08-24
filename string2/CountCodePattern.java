package string2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Return the number of times that the string "code" appears anywhere in 
 * the given string, except we'll accept any letter for the 'd', 
 * so "cope" and "cooe" count.
 * 
 * countCode("aaacodebbb") - 1
 * countCode("codexxcode") - 2
 * countCode("cozexxcope") - 2
 * 
 *  
 *
 */

public class CountCodePattern {

	public static void main(String[] args) {
		System.out.println(countCode("cozexxcope"));

	}
	
	public static int countCode(String str) {
		int count = 0;
		
		Pattern p = Pattern.compile("(co)(\\w|\\W)(e)");
		Matcher m = p.matcher(str);
		
		while (m.find()) {
			System.out.println("Found a " + m.group() + ".");
			count++;
		}

		return count;
	}

}
