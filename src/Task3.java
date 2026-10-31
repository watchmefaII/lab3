import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter variable a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Variable 'a' cannot be zero for a quadratic equation.");
            return;
        }

        System.out.print("Enter variable b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter variable c: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);
        int numberOfRoots = 0;

        if (delta > 0) {
            numberOfRoots = 2;
        } else if (delta == 0) {
            numberOfRoots = 1;
        } else {
            numberOfRoots = 0;
        }


        System.out.printf("Variables entered: a = %.2f, b = %.2f, c = %.2f\n", a, b, c);


        switch (numberOfRoots) {
            case 2:
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("The equation has two roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
                break;
            case 1:
                double x = -b / (2 * a);
                System.out.printf("The equation has one root: x1 = %.2f\n", x);
                break;
            case 0:
                System.out.println("The equation has no real roots.");
                break;
            default:
                System.out.println("Error determining roots.");
                break;
        }

        scanner.close();
    }
}