import java.util.*;
class Factorial 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=n; i++){
			
			fact = fact*i;
		}
		
		System.out.println("Factorial is : "+fact);
	}
}
