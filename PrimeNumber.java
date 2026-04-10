import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num, i;
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num <= 1) {
            isPrime = false;
        } else {
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}
