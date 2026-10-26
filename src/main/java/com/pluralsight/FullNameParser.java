package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String inputName = scanner.nextLine().trim();

        // Split the input string by spaces
        String[] nameParts = inputName.split("\\s+");

        if (nameParts.length == 2) {
            // Format: First Last
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + nameParts[1]);
        } else if (nameParts.length >= 3) {
            // Format: First Middle Last
            System.out.println("First name: " + nameParts[0]);

            StringBuilder middleName = new StringBuilder(nameParts[1]);
            for (int i = 2; i < nameParts.length - 1; i++) {
                middleName.append("").append(nameParts)[i]);
            }
            System.out.println("Middle name: " + middleName.toString());
            System.out.println("Last name: " + nameParts[nameParts.length - 1]);
        } else {
            System.out.println("Invalid input. Please enter at least a first and last name.");

            }
        }


    }
}
