package qe_winter2022.problemsAndSolutions;

public class ReverseString {

    // Qa_Stack: Write a program to reverse a given String --> ? use by for loop
    // Given String: We are learning reverse string

    public static void main(String[] args) {

        reverseString("We are learning reverse string"); // parameter argument

        reverseString1("Tajwar");

    }


    public static void reverseString(String name) {
        // Declare a variable to contain the output, such as "reverse"
        String reverse = "";
        // Iterate by index number use for loop
        for (int i = 0; i <= name.length() - 1; i++) {
            reverse = name.charAt(i) + reverse;

        }
        System.out.println(reverse);

    }

    public static void reverseString1(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
            // System.out.print(name.charAt(i));
        }
        System.out.println(reverse);


    }


}
