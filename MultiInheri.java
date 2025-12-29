class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
	void cry(){
		 System.out.println("Puppy cries");
	}
}
public class MultiInheri
{

    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();
        obj.bark();
		obj.cry();
    }
}
