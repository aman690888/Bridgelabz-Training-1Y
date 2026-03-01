public class PalindromeChecker {

    String text;

    boolean isPalindrome() {

        int i = 0;
        int j = text.length() - 1;

        while (i < j) {

            if (text.charAt(i) != text.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    void displayResult() {

        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {

        PalindromeChecker p = new PalindromeChecker();

        p.text = "madam";

        p.displayResult();
    }
}