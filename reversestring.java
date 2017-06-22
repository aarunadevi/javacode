package positive;
import java.util.*;
public class reversestring {
	public static void main(String[] arg){
		      String str, reves = "";
		      Scanner in = new Scanner(System.in);
		      System.out.println("Enter a string to reverse");
		      str = in.nextLine();
		      int length = str.length();
		      for ( int i = length - 1 ; i >= 0 ; i-- )
		         reves = reves + str.charAt(i);
		      	 System.out.println("Reverse of entered string is: "+reves);
		   }
		}
