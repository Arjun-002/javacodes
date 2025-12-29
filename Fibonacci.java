import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers for series: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        if (n >= 1)
            System.out.print(a);
        if (n >= 2)
            System.out.print(" " + b);
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
class Fibonacci2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, c;
		int n  = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
