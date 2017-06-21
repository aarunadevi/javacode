import java.util.*;
public class digit {
	public static void main(String[] arg){
		int i=0,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of digit");
		n=s.nextInt();
		while(n>0){
			n=n/10;
			i++;
		}
		System.out.println("The number of digit" +i);
		}
	}


