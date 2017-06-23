import java.util.*;
public class swap {
	public static void main(String[] arg){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		int len=str.length();
		char[] ch=str.toCharArray();
		for(int i=0;i<len-1;i=i+2){
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		System.out.println("After swap");
		System.out.println(ch);
		
	}
}
