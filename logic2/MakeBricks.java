package logic2;

/**
 * We want to make a row of bricks that is goal inches long. 
 * We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
 * Return true if it is possible to make the goal by choosing from 
 * the given bricks. This is a little harder than it looks and 
 * can be done without any loops. See also: Introduction to MakeBricks
 * 
 * makeBricks(3, 1, 8) = true
 * makeBricks(3, 1, 9) = false
 * makeBricks(3, 2, 10) = true
 * 
 *  
 *
 */

public class MakeBricks {

	public static void main(String[] args) {
		System.out.println(makeBricks(3,2,20));

	}

	public static boolean makeBricks(int small, int big, int goal) {		
		boolean res = false;
		int bigUsed = 0;
		int smallUsed = 0;

		bigUsed = Math.abs(goal/5);
		//System.out.println("bigUsed = "+bigUsed);
		goal = (big > bigUsed) ? Math.abs(goal-(bigUsed*5)) : Math.abs(goal-(big*5));
		//System.out.println("goal = "+goal);
		goal = goal-small;
		//System.out.println("goal = "+goal);

		if(goal > 0){
			res = false;
		} else {
			res = true;;
		}

		return res;
	}

}
