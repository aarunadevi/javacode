package positive;
import java.util.*;
public class alphabet {
	public static void main(String[] arg){
		Scanner s=new Scanner(System.in);
		char cha;
		System.out.println("Enter the character : ");
		cha = s.next().charAt(0);
		if((cha>='a' && cha<='z') || (cha>='A' && cha<='Z'))
        {
            System.out.print(cha + " is an Alphabet");
        }
        else
        {
            System.out.print(cha + " is not an Alphabet");
        }
    }
}

