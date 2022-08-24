package logic2;

/**
 * We want make a package of goal kilos of chocolate. 
 * We have small bars (1 kilo each) and big bars (5 kilos each). 
 * Return the number of small bars to use, assuming we always 
 * use big bars before small bars. Return -1 if it can't be done.
 * 
 * makeChocolate(4, 1, 9) = 4
 * makeChocolate(4, 1, 10) = -1
 * makeChocolate(4, 1, 7) = 2
 * 
 *  
 *
 */

public class MakeChocolate2 {

	public static void main(String[] args) {
		System.out.println(makeChocolate(7,1,9));
	}
	
	public static int makeChocolate(int small, int big, int goal) {		
		int res = 0;
		int bigUsed = 0;
		int smallUsed = 0;
		
		bigUsed = Math.abs(goal/5);
		//System.out.println("bigUsed = "+bigUsed);
		goal = (big > bigUsed) ? Math.abs(goal-(bigUsed*5)) : Math.abs(goal-(big*5));
		//System.out.println("goal = "+goal);
		goal = goal-small;
		//System.out.println("goal = "+goal);
		
		if(goal > 0){
			res = -1;
		} else {
			res = Math.abs(small-(0-goal));
		}

		return res;
	}

}
