import java.util.*;
class Bill 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double b = sc.nextDouble();
		if(b>10000){
			System.out.println("You have 60% Discount you have to pay "+(b*40/100));
		}
		else if(b>7000){
			System.out.println("You have 40% Discount you have to pay "+(b*60/100));
			
		}
		else if(b>5000){
			System.out.println("You have 30% Discount you have to pay "+(b*70/100));
		}
		else{
		System.out.println("No discount");
	}
}
}
