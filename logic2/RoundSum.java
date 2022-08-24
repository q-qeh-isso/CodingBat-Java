package logic2;

/**
 * For this problem, we'll round an int value up to the next 
 * multiple of 10 if its rightmost digit is 5 or more, 
 * so 15 rounds up to 20. Alternately, round down to the 
 * previous multiple of 10 if its rightmost digit is less than 5, 
 * so 12 rounds down to 10. Given 3 ints, a b c, return the sum 
 * of their rounded values. To avoid code repetition, write a 
 * separate helper "public int round10(int num) {" and call it 3 times. 
 * Write the helper entirely below and at the same indent level as roundSum().
 * 
 * roundSum(16, 17, 18) = 60
 * roundSum(12, 13, 14) = 30
 * roundSum(6, 4, 4) = 10
 * 
 *  
 *
 */

public class RoundSum {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 40;

		int result = round10(a)+round10(b)+round10(c);
		System.out.println(result);


	}

	public static int round10(int num){
		int remainder = num % 10;
		num -= remainder;
		if (remainder >= 5) {
			num += 10;
		}
		return num;

		/*int result = 0;
		int i = 0;
		if(num%10 == 0){
			return num;
		}
		if(num<=10 && num>=5){
			result = 10;
			return result;
		}
		if(num<5){
			result = 0;
			return result;
		}
		if(num%10 >= 5){
			while((num+i)%10 != 0){
				i++;
				result = num+i;
			}
		} else if(num%10 < 5){
			while((num-i)%10 != 0){
				i++;
				result = num-i;
			}
		}
		return result;*/
	}

}
