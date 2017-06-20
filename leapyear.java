package positive;
import java.util.*;
public class leapyear {
	    public static void main(String[] args)
	    {
	    	Scanner s=new Scanner(System.in);
	    	int num;
	    	System.out.println("Enter the year");
	    	num=s.nextInt();
	    	if(num%4==0)
	    	{
	    		System.out.println("This is leap year");
	    	}
	    	else
	    	{
	    		System.out.println("This is not a leap year");
	    	}
	    }
}
	 
