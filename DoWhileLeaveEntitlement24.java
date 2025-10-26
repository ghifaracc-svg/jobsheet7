import java.util.Scanner;

public class DoWhileLeaveEntitlement24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Input the number of leave entitlement: ");
        leaveEntitlement = input.nextInt();

        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement: " + leaveEntitlement);

                    if (leaveEntitlement <= 2 && leaveEntitlement > 0) {
                        System.out.println("⚠ Warning: You only have " + leaveEntitlement + " day(s) of leave left!");
                    }
                } else {
                    System.out.println("You don't have enough leave entitlement.");
                    break;
                }
            } else {
                System.out.println("No leave taken.");
                break;
            }

        } while (leaveEntitlement > 0);

        System.out.println("Leave calculation finished.");
        input.close();
    }
}
    
