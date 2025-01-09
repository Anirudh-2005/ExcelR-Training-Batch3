import java.util.Scanner;

public class Demo021 {
    public static void main(String[] args) {
        taxcalc();
    }

    public static void taxcalc() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your month income: ");
        double salary = scanner.nextDouble() * 12;

        System.out.print("Enter your month Hra: ");
        double Hra = scanner.nextDouble() * 12;

        System.out.print("Enter your month Pf: ");
        double Pfmoney = scanner.nextDouble() * 12;

        double deductions = Hra + Pfmoney;
        double taxonincome = salary - deductions;

        double tax = 0;
        if (taxonincome <= 500000) {
            tax = taxonincome * 0.10;
        } else if (taxonincome <= 1000000) {
            tax = (500000 * 0.10) + ((taxonincome - 500000) * 0.20);
        } else {
            tax = (500000 * 0.10) + (500000 * 0.20) + ((taxonincome - 1000000) * 0.30);
        }

        System.out.println("In hand ammount after cuttings");
        System.out.println("Annual Salary " + salary);
        System.out.println("Deductions in Hra and Pf " + deductions);
        System.out.println("Taxable Income " + taxonincome);
        System.out.println("Annual Income Tax " + tax);

        scanner.close();
    }
}