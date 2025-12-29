class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }}
public class PolyOverride
{

    public static void main(String[] args) {
        Animal a = new Dog();   // important line to use override
        a.sound();
    }
}
