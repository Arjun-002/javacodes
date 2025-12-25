import java.util.*;
class Elseiff {
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		double mark = sc.nextDouble();
		if(mark>=85){
			System.out.println("Grade A");
		}
		else if (mark>=65 )
		{
			System.out.println("Grade B");
		}
		else if(mark>=55 ){
			System.out.println("Grade C");
		}
		else if(mark>=40 ){
			System.out.println("Grade D");
		}
		else{
		System.out.println("Fail");
		}
	}
}
