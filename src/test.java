package src;

import java.util.Scanner;

class Test {
    private static void invalidInput() {
        boolean invalidInput = false;
        while (invalidInput) {
            // ask the user to specify a number to update the times by
            System.out.print("Specify an integer between 0 and 5: ");

            Scanner in = null;
            if (in.hasNextInt()) {
                // get the update value
                int updateValue = in.nextInt();

                // check to see if it was within range
                if (updateValue >= 0 && updateValue <= 5) {
                    invalidInput = false;
                } else {
                    System.out.println("You have not entered a number between 0 and 5. Try again.");
                }
            } else {
                System.out.println("You have entered an invalid input. Try again.");
            }
        }
    }
}
