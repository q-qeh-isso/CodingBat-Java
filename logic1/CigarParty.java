package logic1;

/**
 * When squirrels get together for a party, 
 * they like to have cigars. A squirrel party 
 * is successful when the number of cigars is 
 * between 40 and 60, inclusive. Unless it is 
 * the weekend, in which case there is no upper 
 * bound on the number of cigars. 
 * Return true if the party with the given 
 * values is successful, or false otherwise.
 * 
 * cigarParty(30, false) = false
 * cigarParty(50, false) = true
 * cigarParty(70, true) = true
 * 
 *  
 *
 */

public class CigarParty {

	public static void main(String[] args) {
		System.out.println(cigarParty(30,false));
	}

	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if(cigars >= 40 && cigars <= 60 && !isWeekend){
			return true;
		}
		if(cigars >= 40 && isWeekend){
			return true;
		}
		return false;
	}


}
