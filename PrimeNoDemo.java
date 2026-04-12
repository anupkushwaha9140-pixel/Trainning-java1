
    
import java.util.Scanner; //for user input

public class PrimeNoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        scanner.close();
    }
    //Creating my own method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) { //checking if the number is less than or equal to 1, which are not prime
            return false;
        }
        if (n <= 3) { //checking if the number is 2 or 3, which are prime
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) { //checking if the number is divisible by 2 or 3, 
        // which means it's not prime
            return false;
        }
        //now we have to check for factors from 5 to the square root of n, skipping even numbers
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) { //checking if the number is divisible by 
            // i or i + 2, which means it's not prime
                return false;
            }
        }
        return true;
    }
}
