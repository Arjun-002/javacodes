import java.util.*;
public class Pallindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String rev = "";
		String a = sc.nextLine();
		for(int i = a.length()-1; i>=0; i--){
			rev = rev + a.charAt(i);
		}
		if(a.equals(rev)){
			System.out.println("Its a pallindrome");
		}
		else{
			System.out.println("Not a pallindrome");
		}
		
	}
}
