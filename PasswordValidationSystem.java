//Dencel Julius L. Parantac
//1N - A
//Labolatory Challenge No. 7

package passwordvalidationsystem;

import java.util.Scanner;

public class PasswordValidationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Loop to ask for password until it's valid
        while (true) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Check if the password meets the criteria
            if (isValidPassword(password)) {
                System.out.println("Your password is valid!");
                break; // Exit the loop if password is valid
            } else {
                System.out.println("Password must contain at least 8 characters, including one uppercase letter and one number.");
            }
        }

        scanner.close();
    }

    // Method to check if the password is valid
    public static boolean isValidPassword(String password) {
        
        if (password.length() < 8) {
            return false;
        }

        // Check if the password contains at least one uppercase letter
        boolean hasUpperCase = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }

            if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }

        // Return true if all conditions are satisfied
        return hasUpperCase && hasNumber;
    }
}
