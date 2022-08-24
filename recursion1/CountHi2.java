package recursion1;

/**
 * Given a string, compute recursively the number of times lowercase "hi" 
 * appears in the string, however do not count "hi" that have an 'x' immedately 
 * before them.
 * 
 * countHi2("ahixhi") = 1
 * countHi2("ahibhi") = 2
 * countHi2("xhixhi") = 0
 * 
 *  
 *
 */

public class CountHi2 {

	public static void main(String[] args) {
		System.out.println(countHi2("xhixhi"));
	}

	public static int countHi2(String str) {
		if(str.length() < 2) return 0;
		if(str.substring(0,2).equals("hi")) return 1 + countHi2(str.substring(2));
		if(str.charAt(0) == 'x' && str.length() >= 3){
			if(str.substring(1,3).equals("hi")) return countHi2(str.substring(3));
			
			return countHi2(str.substring(1));
		}

		return countHi2(str.substring(1));
	}

}
