package warmup2;

public class FrontTimes {

	public static void main(String[] args) {
		System.out.println(frontTimes("Chocolate",2));
	}

	public static String frontTimes(String str, int n) {

		if(str.length() == 0){
			return "";
		}

		String tempStr = "";

		if(str.length() >= 3){
			String first3 = str.substring(0,3);

			for(int i = 0; i < n; i++){
				tempStr += first3;
			}    
			return tempStr;
		} else {
			String firstS = str.substring(0);
			for(int i = 0; i < n; i++){
				tempStr += firstS;
			}
			return tempStr;
		}
		
		/*int frontLen = 3;
		if (frontLen > str.length()) {
			frontLen = str.length();
		}
		String front = str.substring(0, frontLen);

		String result = "";
		for (int i=0; i<n; i++) {
			result = result + front;
		}
		return result;*/

	}

}
