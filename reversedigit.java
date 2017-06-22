package positive;
import java.util.*;
public class reversedigit {
	public static void main(String[] arg){
		int n,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter digit");
		n=s.nextInt();
		while(n!=0){
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println("the reverse number"+rev);
	}
}
