abstract class Computer 
{
	abstract void turnOn();
	abstract void turnOff();
}
class Hp extends Computer
{
	void turnOn(){
		System.out.println("System turned ON");
	}
	void turnOff(){
		System.out.println("System turned Off");
	}
}
class Dell extends Computer
{
	void turnOn(){
		System.out.println("System turned ON");
	}
	void turnOff(){
		System.out.println("System turned Off");
	}
}
public class Abstract
{
	public static void main(String[] args) 
	{
		Hp obj1 = new Hp();
		obj1.turnOn();
		obj1.turnOff();
		
		Dell obj2 = new Dell();
		obj2.turnOn();
		obj2.turnOff();
	}
}
