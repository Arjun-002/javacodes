import java.util.*;
class CharacterCheck 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		char ch = sc.next().charAt(0);
		if(ch>= '0' && ch<='9'){
			System.out.println("Its a Number");
		}
		else if(ch>='a' && ch<='z'){
			System.out.println("Lower Case");
		}
		else if(ch>='A' && ch<='Z'){
		System.out.println("Upper Case");
		}
		else{
			System.out.println("Special Case");
		}
	}
}
