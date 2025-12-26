import java.util.*;
class AddOFNo 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int temp = 0;
		
		while (n>0)
		{
			int c = n%10;
			temp = temp + c;
			n = n/10;
		}
		System.out.println("The sum of given Number is: "+temp);
	}
}
