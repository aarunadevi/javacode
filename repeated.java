import java.util.*;
public class repeated {
	public static void main(String[] arg){
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of aray");
		n=s.nextInt();
		int num[]=new int[n];
		for(i=0;i<n;i++)
			num[i]=s.nextInt();
		for(i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(num[j]==num[i]){
					System.out.println("num[j]"+" ");
					
				}
			}
		}
		
	}
}
