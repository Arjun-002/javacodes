public class Empcls 
{
	int id;
	int sal;
	public static void main(String[] args) 
		
	{
		Empcls e1 = new Empcls();
		e1.id = 101;
		e1.sal = 25000;
		
		System.out.println("Emp ID: "+e1.id +", salary: "+e1.sal);
		Empcls e2 = new Empcls();
		e2.id = 102;
		e2.sal = 30000;
		
		System.out.println("Emp ID: "+e2.id +", salary: "+e2.sal);
	}
}
