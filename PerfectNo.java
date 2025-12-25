import java.util.*;
class PerfectNo 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a = sc.nextInt();
		int b = 0;
		int c =0;
		for(int i=1; i<=a; i++){
			if(a%i == 0){
				System.out.println("Factors are: "+i);
				 b = b+i;//12
				 c = b-a;//12 - 6 = 6
				 
			}
			
		}
		System.out.println("The number is: "+a);
		
		if(a == c)
		{
		System.out.println("its a perfect number: " +a);
	}
	    else{
		System.out.println("Not a perfect Number");
	}
	
	}
}
