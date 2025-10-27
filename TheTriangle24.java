import java.util.Scanner;

public class TheTriangle24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInput;
        String s = "";

        System.out.print("Enter a number: ");
        numInput = input.nextInt();

        for (int i = 0; i < numInput * numInput; i++) {
            s += "* ";

            if ((i + 1) % numInput == 0) {
                s += "\n";
            }
        }

        System.out.println("\nRectangle pattern:");
        System.out.println(s);

        input.close();
    }
}
