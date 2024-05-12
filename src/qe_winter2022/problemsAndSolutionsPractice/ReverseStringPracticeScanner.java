package qe_winter2022.problemsAndSolutionsPractice;

import java.util.Scanner;

public class ReverseStringPracticeScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Reverse the string
        reverseString(input);

        // Reverse the sentence
        reverseString1(inputSentence);

        // Close the scanner
        scanner.close();
    }


    // non-return type of method
    public static String reverseString(String str) {
        // Initialize an empty string to store the reversed string
        String reversed = "";

        // Iterate over the characters of the input string in reverse order
        for (int i = 0; i <= str.length() - 1; i++) {
            // Append each character to the reversed string
            reversed = str.charAt(i) + reversed;
        }
        // Display the reversed string
        System.out.println("Reversed string: " + reversed);

        // Return the reversed string
        return reversed;
    }


    // return type of method
    public static void reverseString1(String str) {
        // Initialize an empty string to store the reversed string
        String reverse = "";

        // Iterate over the characters of the input string in reverse order
        for (int i = 0; i <= str.length() - 1; i++) {
            // Append each character to the reversed string
            reverse = str.charAt(i) + reverse;
        }
        // Display the reversed string
        System.out.println("Reversed string: " + reverse);

    }

}
