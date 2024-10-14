//Importation of Scanner class
import java.util.Scanner;

public class DogManagementAttendantLog {
    public static void main(String[] args) {

        // Declaration of constant variables for attendant ID's and dog ID's
        final int ATTENDANT_NOAH_ID = 11;
        final int ATTENDANT_SILAS_ID = 22;
        final int ATTENDANT_CHRIS_ID = 33;
        final int ATTENDANT_MYA_ID = 44;
        final int DOG_BADGER_ID = 348;
        final int DOG_HOOSIER_ID = 301;
        final int DOG_SPARTAN_ID = 325;
        final int DOG_HAWK_ID = 388;
        final int DOG_GOPHER_ID = 333;
        final int DOG_HUSKER_ID = 388;
        final int DOG_BUCKY_ID = 391;
        final int DOG_NITTANY_ID = 362;
        final int DOG_WOLVEY_ID = 311;
        final int SENTINEL_VALUE = -1;

        // Declaration of non-constant variables
        int minsWithDog;
        int dogId = 0;
        int attendantId = 0;
        int totalEntries = 0;
        int redTotalCount = 0;
        int greenTotalCount = 0;
        int yellowTotalCount = 0;
        int blueTotalCount = 0;
        int redTotalInMins = 0;
        int greenTotalInMins = 0;
        int yellowTotalInMins = 0;
        int blueTotalInMins = 0;
        int iteration = 0;
        boolean isValidDogId;
        boolean validAttendantId;
        boolean continueRunning = true; // variable to control loop
        String dogNotes;

        // Instantiation of the Scanner Object names scnr
        Scanner scnr = new Scanner(System.in);

        // WELCOME MESSAGE
        System.out.println(
                "Welcome to the MPLS care attendant daily log program.  This program will allow you to enter a care attendant id and produce a log for the dogs under the attendant's care.");

        // Create Space
        System.out.println("");
    }
}