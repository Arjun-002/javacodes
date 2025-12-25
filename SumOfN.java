import java.util.*;
class SumOfN 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int sum = 0;
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
			 sum = sum+i;
		}
		System.out.println("The sum is: "+sum);
	}
}
