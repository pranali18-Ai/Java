
import java.util.*;

public class typepromotion 
{
	public static void main (String[] args)
	 
	{
		char a = 'a';
		char b = 'b';
		
		System.out.println((int)(b)); // int value of b 
		System.out.println((int)(a));
			System.out.println(b-a);
			System.out.println(a); // will print a only because type promotion is only done with the expression. 
	
	}
}
