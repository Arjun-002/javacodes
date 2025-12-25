import java.util.*;
class OtpRan
{
	public static void main(String[] args) 
	{
		Random a = new Random();
		int b = a.nextInt(9000)+1000; /*For generating 4digits number */
		System.out.println(b);
	}
} 
