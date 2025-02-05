import java.util.Scanner;

public class Demo053 {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isStrongNumber(int number) {
        int sum = 0, originalNumber = number;

        while (number != 0) {
            int digit = number % 10; 
            sum += factorial(digit); 
            number /= 10;
        }
        
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

        scanner.close();
        }
}