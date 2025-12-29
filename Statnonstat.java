class Test {

    // Static method
    static void show() {
        System.out.println("This is static method");
    }

    // Non-static method
    void display() {
        System.out.println("This is non-static method");
    }
}
public class Statnonstat
{
    public static void main(String[] args) {

        // Calling static method
        Test.show();
		System.out.println();

        // Calling non-static method
        Test obj = new Test();
        obj.display();
    }
}
