import java.util.Scanner;

public class ForMultiples24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int multiple, sum = 0, counter = 0;

        // Step 6: Get user input
        System.out.print("Input the multiple: ");
        multiple = input.nextInt();

        // Step 7: Loop to find multiples and calculate sum and count
        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        }

        // Step 8: Display results
        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d.\n", multiple, sum);
    }
}
