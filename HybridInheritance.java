// Parent interface
interface Animal {
    void eat();
}

// Another parent interface
interface Pet {
    void play();
}

// Child 1 → Multiple inheritance (Animal + Pet)
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

// Child 2 → Hierarchical inheritance (Animal only)
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats");
    }
}

// Main class
public class HybridInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.play();

        System.out.println();

        Cat c = new Cat();
        c.eat();
    }
}
