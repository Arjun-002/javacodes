import java.util.*;
class DigiCount 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int count = 0;
		while(n>0){
			
			count++;
			n = n/10;
		}
		System.out.println("Count is: "+count);
	}
}
