package qe_winter2022.problemsAndSolutionsPractice.reverseStringAll;

public class ReverseStringPrintMainMethod {

    // non-static method, print from main method, use for-loop
    // We love JAVA
    public static void main(String[] args) {


        ReverseStringPrintMainMethod obj = new ReverseStringPrintMainMethod();
        String getReverse = obj.getReverseString("We love JAVA");
        System.out.println(getReverse);


    }


    public String getReverseString(String name) {

        String reverse = "";
        for (int i = 0; i <= name.length() - 1; i++) {
            reverse = name.charAt(i) + reverse;
        }
        return reverse;
    }
}