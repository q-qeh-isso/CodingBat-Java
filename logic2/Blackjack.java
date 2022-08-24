package logic2;

/**
 * Given 2 int values greater than 0, return whichever value is
 * nearest to 21 without going over. 
 * Return 0 if they both go over.
 * 
 * blackjack(19, 21) = 21
 * blackjack(21, 19) = 21
 * blackjack(19, 22) = 19
 * 
 *  
 *
 */

public class Blackjack {

	public static void main(String[] args) {
		System.out.println(blackjack(19,21));
	}

	public static int blackjack(int a, int b) {
		int aVal = a;
		if (aVal > 21) {
			aVal = 0;
		}
		int bVal = b;
		if (bVal > 21) {
			bVal = 0;
		}

		// Now it works to just return whichever is larger.
		if (aVal > bVal) {
			return aVal;
		}
		else {
			return bVal;
		}
	}

}
