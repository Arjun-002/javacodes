import java.util.*;
class Leapyr
{
	static Scanner sc = new Scanner(System.in);	
	public static void main(String[] args) 
		
	{
		System.out.print("Enter a Year: ");
		int a = sc.nextInt();
		if (a%400 == 0)
		{
			System.out.println("Its a leap Year"); /*if(a%400 == 0 || (a%4 == 0 && a%100 !=0))*/
		}
		else if (a%4 == 0 && a%100 !=0 )
		{
			System.out.println("Its a leap Year");
			
		}
		else {
			System.out.println("Not a leap Year");
		}
	}
}
