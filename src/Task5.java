import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();

        int min = 101;
        int max = 0;
        int count = 0;

        System.out.print("My generated numbers are: ");

        while (count < 10) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.print(randomNumber + " ");

            if (randomNumber < min) {
                min = randomNumber;
            }

            if (randomNumber > max) {
                max = randomNumber;
            }

            count++;
        }

        System.out.println("\nThe smallest number is: " + min);
        System.out.println("The biggest number is: " + max);
    }
}