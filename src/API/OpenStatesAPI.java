package API;

import java.util.Scanner;

public class OpenStatesAPI implements IOpenStatesAPI
{

    @Override
    public String getState() {

        // Ask user for State
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter two digit state: ");

        String userState = scanner.next();

        // Return user two digit string
        return userState;
    }

    @Override
    public String getlegID() {

        Scanner scanner = new Scanner(System.in);

        // Print Example to user
        System.out.println("Please enter enter a Rep Leg_id: EX (MOL000396): ");

        // Store Leg_id entered by user
        String userRepID = scanner.next();

        // Return user legislator ID
        return userRepID;
    }
}
