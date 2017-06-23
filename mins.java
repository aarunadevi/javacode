import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class mins {
	public static void main(String[] args)throws Exception{
		 String dateStart = "20/06/17 09:00:00";
		    String dateStop = "20/06/17 09:20:00";
		    SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

		    Date d1 = null;
		    Date d2 = null;
		    try {
		        d1 = format.parse(dateStart);
		        d2 = format.parse(dateStop);
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		    long diff = d2.getTime() - d1.getTime();
		    long diffSeconds = diff / 1000 % 60;
		    long diffMinutes = diff / (60 * 1000) % 60;
		    long diffHours = diff / (60 * 60 * 1000);
		    System.out.println("Time in seconds: " + diffSeconds + " seconds.");
		    System.out.println("Time in minutes: " + diffMinutes + " minutes.");
		    System.out.println("Time in hours: " + diffHours + " hours.");
}
}
