package positive;
import java.util.*;
public class factorial {
	public static void main(String[] arg){
		Scanner s=new Scanner(System.in);
		int i,fact=1;
		int num;
		System.out.println("Enter the number:");
		num=s.nextInt();
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("Factorial number"+fact);
	}
}
