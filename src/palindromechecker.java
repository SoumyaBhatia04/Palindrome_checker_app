/*
 * UseCase1PalindromeCheckerApp.java
 *
 * Objective:
 * Display a welcome message and application details at startup.
 * This demonstrates:
 * - Class structure
 * - Main method (Entry point)
 * - Static keyword usage
 * - Console output
 * - Basic application flow
 */

public class palindromechecker {

    // Application constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0";

    // Main Method - Entry point of the application
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=========================================");
        System.out.println("        " + APP_NAME);
        System.out.println("        " + VERSION);
        System.out.println("=========================================");

        System.out.println("\nWelcome to the Palindrome Checker Application!");
        System.out.println("This application will help you verify whether");
        System.out.println("a given string is a palindrome.\n");

        // Application Flow Control
        System.out.println("Application started successfully.");
        System.out.println("Ready to proceed to the next use case...");
    }
}