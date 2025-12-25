import java.util.*;
class PrimeNo 
{
	static Scanner sc = new Scanner(System.in);	
	public static void main(String[] args) 
	
	{
		int n = sc.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++){
			
			if(n % i == 0){
				
				count ++;
			}
		}
		if(count==2){
		System.out.println("Its prime no.");
	}
	else{
		System.out.println("Not prime");
	}
	}
}
