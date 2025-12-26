import java.util.*;
class RevNo 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int temp =0;
		int m = 0;
		
		while(n>0){
		    temp = n%10;
			m = m*10 + temp;
			n = n/10;
		}
		System.out.println("Reversed number is: "+m);
	}
}
