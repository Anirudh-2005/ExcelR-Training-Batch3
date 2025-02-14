import java.util.Scanner;

public class Demo083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char first = scanner.next().toLowerCase().charAt(0);
        if ("aeiou".indexOf(first) != -1) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
            }
        }
}