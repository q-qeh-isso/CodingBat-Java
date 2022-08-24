package string2;

/**
 * Look for patterns like "zip" and "zap" in the string 
 * -- length-3, starting with 'z' and ending with 'p'. 
 * Return a string where for all such words, 
 * the middle letter is gone, so "zipXzap" yields "zpXzp".
 * 
 * zipZap("zipXzap") = "zpXzp"
 * zipZap("zopzop") = "zpzp"
 * zipZap("zzzopzop") = "zzzpzp"
 * 
 *  
 *
 */

public class ZipZap {

	public static void main(String[] args) {
		System.out.println(zipZap("zipXzap"));
	}

	public static String zipZap(String str) {
		String temp = "";
		String res = "";
		if(str.length() < 3){
			return str;
		}
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p' && i<str.length()-2){
				temp = ""+str.charAt(i)+str.charAt(i+2);
				i+=2;
			}else{
				temp = ""+str.charAt(i);
			}
			res += temp;
		}
		return res;
	}


}
