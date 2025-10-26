import java.util.Scanner;

public class ForMultiples24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple, sum = 0, counter = 0;
        double average = 0;

        System.out.print("Enter a number to find its multiples between 1 and 50: ");
        multiple = input.nextInt();

        System.out.println("\nMultiples of " + multiple + " between 1 and 50 are:");

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                System.out.print(i + " ");
                sum += i;
                counter++;
            }
        }

        if (counter > 0) {
            average = (double) sum / counter;
        }

        System.out.println("\n\nTotal count of multiples: " + counter);
        System.out.println("Sum of all multiples: " + sum);
        System.out.println("Average of all multiples: " + average);

        input.close();
    }
}
