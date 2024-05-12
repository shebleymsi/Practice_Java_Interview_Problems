package qe_winter2022.problemsAndSolutionsPractice;

public class ReverseStringPractice {
    public static void main(String[] args) {

        getReverseString("We are learning JAVA");

    }

    public static void getReverseString(String name) {

        String reverse = "";
        for (int i = 0; i <= name.length()-1; i++) {
            reverse = name.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }


}
