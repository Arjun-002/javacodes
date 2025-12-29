class Animal {
    void sound() {
        System.out.println("Animal sound");
		
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
		
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
		
    }
}

public class HeirInheri {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
		System.out.println(); 
		
        Cat c = new Cat();
        c.sound();
        c.meow();
    }
}
