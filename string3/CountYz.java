package string3;

/**
 * Given a string, count the number of words ending in 'y' or 'z' -- 
 * so the 'y' in "heavy" and the 'z' in "fez" count, 
 * but not the 'y' in "yellow" (not case sensitive). 
 * We'll say that a y or z is at the end of a word if there is not an 
 * alphabetic letter immediately following it.
 * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 * 
 * countYZ("fez day") = 2
 * countYZ("day fez") = 2
 * countYZ("day fyyyz") = 2
 * 
 *  
 *
 */

public class CountYz {

	public static void main(String[] args) {
		System.out.println(countYZ("DAY abc XYZ"));
	}

	public static int countYZ(String str) {
		String[] arr = str.split("\\P{Alpha}+");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("") &&
				(arr[i].substring(arr[i].length()-1,arr[i].length()).equalsIgnoreCase("y") ||
				arr[i].substring(arr[i].length()-1,arr[i].length()).equalsIgnoreCase("z")) ){
				
				count++;
			}
		}		
		return count;

		/*String[] arr = str.split("\\P{Alpha}+");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("") &&
					(arr[i].charAt(arr[i].length()-1) == 'y' ||
					arr[i].charAt(arr[i].length()-1) == 'z') ){
				count++;
			}
		}
		return count;*/
	}


}
