package logic1;

/**
 * Given a day of the week encoded as 
 * 0=Sun, 1=Mon, 2=Tue, ...6=Sat, 
 * and a boolean indicating if we are on vacation, 
 * return a string of the form "7:00" indicating 
 * when the alarm clock should ring. Weekdays, 
 * the alarm should be "7:00" and on the weekend it 
 * should be "10:00". Unless we are on vacation -- 
 * then on weekdays it should be "10:00" and weekends 
 * it should be "off".
 * 
 * alarmClock(1, false) = "7:00"
 * alarmClock(5, false) = "7:00"
 * alarmClock(0, false) = "10:00"
 * 
 *  
 *
 */

public class AlarmClock {

	public static void main(String[] args) {
		System.out.println(alarmClock(1,false));
	}

	public static String alarmClock(int day, boolean vacation) {
		String alarm = "";
		switch(day){
		case 0:
			if(vacation) {
				alarm = "off";
			} else {
				alarm = "10:00";
			}
			break;
		case 1:
			if(vacation) {
				alarm = "10:00";
			} else {
				alarm = "7:00";
			}
			break;
		case 2:
			if(vacation) {
				alarm = "10:00";
			} else {
				alarm = "7:00";
			}
			break;
		case 3:
			if(vacation) {
				alarm = "10:00";
			} else {
				alarm = "7:00";
			}
			break;
		case 4:
			if(vacation) {
				alarm = "10:00";
			} else{
				alarm = "7:00";
			}
			break;
		case 5:
			if(vacation) {
				alarm = "10:00";
			} else {
				alarm = "7:00";
			}
			break;
		case 6:
			if(vacation) {
				alarm = "off";
			} else {
				alarm = "10:00";
			}
			break;
		}
		return alarm;
	}


}
