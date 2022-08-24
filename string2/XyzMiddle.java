package string2;

/**
 * Given a string, does "xyz" appear in the middle 
 * of the string? To define middle, 
 * we'll say that the number of chars to the left and right 
 * of the "xyz" must differ by at most one. 
 * This problem is harder than it looks.
 * 
 * xyzMiddle("AAxyzBB") = true
 * xyzMiddle("AxyzBB") = true
 * xyzMiddle("AxyzBBB") = false
 * 
 *  
 *
 */

public class XyzMiddle {

	public static void main(String[] args) {
		System.out.println(xyzMiddle("AAxyzBB"));
	}

	public static boolean xyzMiddle(String str) {
		int endLen = 0;
		int begLen = 0;
		boolean flag = false;
		//System.out.println(str.substring(0,str.length()-2));
		if(str.contains("xyz")){
			if(str.length() == 3){
				return true;
			}
			for (int i = 0; i < str.length()-2; i++) {

				if(str.substring(i,i+3).equals("xyz")){	
					//System.out.println("encontrou xyz no indice "+i+" = "+str.substring(i,i+3));
					endLen = str.substring(i+3).length();					
					if(i != 0){
						begLen = str.substring(0,i).length();
					}
				}
				//System.out.println("endLen = "+endLen);
				//System.out.println("begLen = "+begLen);
				if(Math.abs(endLen-begLen) <= 1 && (endLen != 0 || begLen != 0)){
					flag = true;
					break;
				} else {
					flag = false;
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}

}
