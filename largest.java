import java.util.*;
public class largest {
	public static void main(String[] arg){
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the value a ");
		a=s.nextInt();
		System.out.println("Enter the value b ");
		b=s.nextInt();
		System.out.println("Enter the value c ");
		c=s.nextInt();
		if(a>=b && a>=c) 
		{
			System.out.println("Largest number: "+a);
		}
		if(b>=a && b>=c) 
		{
			System.out.println("Largest number: "+b);
		}
		if(c>=a && c>=b) 
		{
			System.out.println("Largest number: "+c);
		}
	}
