package warmup2;

/**
 * Given a string, return a version where all
 *  the "x" have been removed. Except an "x" at 
 *  the very start or end should not be removed.
 *  
 *  stringX("xxHxix") = "xHix"
 *  stringX("abxxxcd") = "abcd"
 *  stringX("xabxxxcdx") = "xabcdx"
 * 
 *  
 *
 */

public class StringX {

	public static void main(String[] args) {
		System.out.println(stringX("xxHxix"));
	}

	public static String stringX(String str) {
		String tempStr = "";

		if(str.length() == 0){
			return tempStr;
		}
		if(str.length() < 2 && str.substring(0,1).equals("x")){
			return str;
		}

		for(int i = 1; i < str.length()-1; i++){
			if(str.substring(i,i+1).equals("x")){
				continue;
			}
			tempStr += str.substring(i,i+1);
		}

		return str.substring(0,1) + tempStr + str.substring(str.length()-1);

		/*String result = "";
		for (int i=0; i<str.length(); i++) {
			// Only append the char if it is not the "x" case
			if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
				result = result + str.substring(i, i+1); // Could use str.charAt(i) here
			}
		}
		return result;*/
	}

}
