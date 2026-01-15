package assignment2;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexValidationApp {

	// Validate Mobile Number (10 digits, starts with 6-9)
    public static boolean validateMobile(String mobile) {
        return Pattern.matches("^[6-9][0-9]{9}$", mobile);
    }

    // Validate Email ID
    public static boolean validateEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email);
    }

    // Validate Username (5–15 chars, letters & numbers only)
    public static boolean validateUsername(String username) {
        return Pattern.matches("^[A-Za-z0-9]{5,15}$", username);
    }

    // Validate Password (min 8 chars, at least 1 digit, 1 uppercase, 1 special char)
    public static boolean validatePassword(String password) {
        return Pattern.matches(
                "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%!]).{8,}$",
                password
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        try {
            do {
                System.out.println("\n===== REGEX INPUT VALIDATION MENU =====");
                System.out.println("1. Validate Mobile Number");
                System.out.println("2. Validate Email ID");
                System.out.println("3. Validate Username");
                System.out.println("4. Validate Password");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {

                    case 1:
                        System.out.print("Enter Mobile Number: ");
                        String mobile = sc.nextLine();
                        if (validateMobile(mobile)) {
                            System.out.println("Welcome! Mobile number is valid.");
                        } else {
                            System.out.println("Invalid Mobile Number!");
                        }
                        break;

                    case 2:
                        System.out.print("Enter Email ID: ");
                        String email = sc.nextLine();
                        if (validateEmail(email)) {
                            System.out.println("Welcome! Email ID is valid.");
                        } else {
                            System.out.println("Invalid Email ID!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Username: ");
                        String username = sc.nextLine();
                        if (validateUsername(username)) {
                            System.out.println("Welcome! Username is valid.");
                        } else {
                            System.out.println("Invalid Username!");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Password: ");
                        String password = sc.nextLine();
                        if (validatePassword(password)) {
                            System.out.println("Welcome! Password is valid.");
                        } else {
                            System.out.println("Invalid Password!");
                        }
                        break;

                    case 5:
                        System.out.println("Thank you! Exiting program.");
                        break;

                    default:
                        System.out.println("Invalid choice! Please select 1–5.");
                }

            } while (choice != 5);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        } finally {
            sc.close();
        }
    }
}
