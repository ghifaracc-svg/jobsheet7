import java.util.Scanner;

public class DoWhileLeaveEntitlement242
2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leaveEntitlement = 5; // total leave available
        int numLeave;             // number of leave days to take
        String confirmation;      // to continue or not

        do {
            System.out.println("Remaining leave days: " + leaveEntitlement);

            // Loop until user enters valid number
            do {
                System.out.print("Enter number of leave days to use: ");
                numLeave = input.nextInt();

                if (numLeave > leaveEntitlement) {
                    System.out.println("You cannot take more leave than remaining! Please try again.");
                }
            } while (numLeave > leaveEntitlement); // repeat input until valid

            // Deduct leave
            leaveEntitlement -= numLeave;
            System.out.println("You have used " + numLeave + " day(s) of leave.");

            // Warning when only 2 days remain
            if (leaveEntitlement == 2) {
                System.out.println("⚠ Warning: Only 2 days of leave remaining! Please stop using your leave.");
            }

            // Stop when leave runs out
            if (leaveEntitlement <= 0) {
                System.out.println("You have no leave days remaining.");
                break;
            }

            System.out.print("Do you want to take more leave? (yes/no/t): ");
            confirmation = input.next();

            // ✅ New condition: stop when user enters "t"
            if (confirmation.equalsIgnoreCase("t")) {
                System.out.println("Program stopped by user (input = 't').");
                break;
            }

        } while (confirmation.equalsIgnoreCase("yes") && leaveEntitlement > 0);

        System.out.println("Program ended. Remaining leave: " + leaveEntitlement);
    }
}
