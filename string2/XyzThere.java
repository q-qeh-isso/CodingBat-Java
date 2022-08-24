package string2;

/**
 * Return true if the given string contains an appearance of "xyz" 
 * where the xyz is not directly preceeded by a period (.). 
 * So "xxyz" counts but "x.xyz" does not.
 * 
 * xyzThere("abcxyz") - true
 * xyzThere("abc.xyz") - false
 * xyzThere("xyz.abc") - true
 * 
 *  
 *
 */

public class XyzThere {

	public static void main(String[] args) {
		System.out.println(xyzThere("abc.xyzxyz"));
	}

	public static boolean xyzThere(String str) {
		boolean flag = false;
		
		for (int i = 0; i<str.length()-2; i++) {
			if( str.substring(i, i+3).equals("xyz") ){
				if(i != 0){
					if(!(str.substring(i-1, i).equals("."))){
						flag = true;
						break;
					}
				} else {
					flag = true;
					break;
				}
			}
		}		
		return flag;

	}

}
