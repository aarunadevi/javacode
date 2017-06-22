package positive;
import java.util.*;
public class swap {
	public static void main(String[] arg){
		Scanner s=new Scanner(System.in);
		String originalString = "abcde";
		char[] c = originalString.toCharArray();
		char temp = c[0];
		c[0] = c[1];
		c[1] = temp;

		String swappedString = new String(c);

		System.out.println(originalString);
		System.out.println(swappedString);
	}
}
