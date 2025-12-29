import java.util.Scanner;
class EvenOddCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int even = 0, odd = 0;

        while (n > 0) {
            int a = n % 10;   // get last digit

            if (a % 2 == 0)
                even++;
            else
                odd++;

            n = n / 10;       // remove last digit
        }

        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}
