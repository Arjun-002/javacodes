import java.util.*;
public class Jumping 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n ;i++ )
		{
			if(i==5)
				continue;
			
			System.out.println(i);
				
		}
		// then break; will end program and print until 5 eg 1 2 3 4
	}
}

