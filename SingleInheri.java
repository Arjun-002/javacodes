class Animal 
{
	void eat(){
		System.out.println("Animals eat");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dogs bark");
	}
}
public class SingleInheri
{

	public static void main(String[] args) 
	{
		Dog obj = new Dog();
		obj.eat();
		obj.bark();
		
	}
}

