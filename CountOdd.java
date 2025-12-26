import java.util.*;
class CountOdd 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		int nb = 0;
		System.out.print("The odd numbers are: ");
		while(n>0){
			nb = n%10;
			if(nb%2!=0){
				count++;
				System.out.print(nb+" ");
				
			}
			
			n = n/10;
		}
		System.out.println();
		System.out.print("The odd count in number is: "+count);
		
		
		
	}
}
