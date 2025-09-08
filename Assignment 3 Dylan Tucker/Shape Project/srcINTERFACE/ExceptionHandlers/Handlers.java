package ExceptionHandlers;

import java.util.Scanner;

public class Handlers {   //nevermind.

    Scanner scanner = new Scanner(System.in);
    
    public float noNegative() {
        float number = scanner.nextFloat();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            number = noNegative();
        }

        return number;
    }

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
