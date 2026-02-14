<<<<<<< HEAD
import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String rev = "";

        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
=======
import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String rev = "";

        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
>>>>>>> 312c94086bb55094d0100ade10577c4b7f1241de
