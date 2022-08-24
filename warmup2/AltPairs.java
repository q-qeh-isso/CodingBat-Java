package warmup2;

/**
 * Given a string, return a string made of the chars 
 * at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 * 
 * altPairs("kitten") = "kien"
 * altPairs("Chocolate") = "Chole"
 * altPairs("CodingHorror") = "Congrr"
 * 
 *  
 *
 */

public class AltPairs {
	
	public static void main(String[] args) {
		System.out.println(altPairs("kitten"));
	}
	
	public static String altPairs(String str) {
		  String tempStr = "";
		  
		  for(int i = 0; i < str.length(); i+=4){
		    int fim = i + 2;
		    if(fim > str.length()){
		      fim = str.length();
		    }
		    tempStr += str.substring(i,fim);
		  }
		  
		  return tempStr;
		}


}
