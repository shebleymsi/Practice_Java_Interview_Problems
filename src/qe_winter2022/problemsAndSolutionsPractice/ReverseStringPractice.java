package qe_winter2022.problemsAndSolutionsPractice;

public class ReverseStringPractice {
    public static void main(String[] args) {

        getReverseString("We are learning JAVA");
        getReverseString1("We love JAVA");

    }

    // return type of method
    public static String getReverseString(String name) {

        String reverse = "";
        for (int i = 0; i <= name.length() - 1; i++) {
            reverse = name.charAt(i) + reverse;
        }
        System.out.println(reverse);
        return reverse;
    }

    // non-return type of method
    public static void getReverseString1(String name) {

        String reverse = "";
        for (int i = 0; i <= name.length() - 1; i++) {
            reverse = name.charAt(i) + reverse;
        }
        System.out.println(reverse);

    }


}
