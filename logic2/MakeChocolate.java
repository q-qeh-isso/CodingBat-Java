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

public class MakeChocolate {

	public static void main(String[] args) {
		System.out.println(makeChocolate(4,1,7));

	}
	
	public static int makeChocolate(int small, int big, int goal) {		
		int res = 0;
		int bigUsed = 0;
		int smallUsed = 0;
		
		for(int i = 5; i<=goal; i+=5){
			bigUsed += 1;
		}
		//System.out.println("bigUsed = "+bigUsed);		
		if(big > bigUsed){
			goal = Math.abs(goal-(bigUsed*5));
		} else {
			goal = Math.abs(goal-(big*5));
		}
		//System.out.println("goal = "+goal);
		while(small != 0 && goal != 0){
			goal = goal-1;
			small--;
			smallUsed += 1;
		}
		//System.out.println("smallUsed = "+smallUsed);		
		if(goal != 0){
			res = -1;
		} else {
			res = smallUsed;
		}		
		
		return res;
	}

}
