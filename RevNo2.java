import java.util.*;
class RevNo2 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		while(n>0){
			int temp = n%10;
			System.out.print(temp);
			n = n/10;
		}
		
	}
}
