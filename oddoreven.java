package oddoreven;
import java.util.*;
public class odd {
	public static void main(String[] args){
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		x=s.nextInt();
		if( x % 2 == 0 )
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}
