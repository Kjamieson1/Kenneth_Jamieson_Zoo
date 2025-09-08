package ExceptionHandlers;

import java.util.Scanner;

public class Handlers {   //nevermind.

    //I disliked importing scanner into absolutely every file, so now im going to import this into every file...!
    Scanner scanner = new Scanner(System.in);
    
    //If user inputs a negative number this will ask them for a proper input
    public float noNegative() {
        float number = scanner.nextFloat();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            number = noNegative();
        }

        return number;
    }
    //Checks if user inputted a blank name. Note: cannot detect whitespace, you can still just name it with spacebar
    public String realName() {
        String name = "";
        name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("Please enter a name.");
            name = realName();
        }

        return name;
    }
}
