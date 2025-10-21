import java.util.Scanner;

public class DisplayTwo24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numInput;

        System.out.print("Input some number: ");
        numInput = input.nextInt();

        if (numInput <= 2) {
            System.out.println("Please enter a number greater than 2.");
        } else {
            for (int i = 1; i <= numInput; i++) {
                if (i % 2 == 0) {
                    System.out.println("2 multiple: " + i);
                }
            }
        }
        input.close();
    }
}
