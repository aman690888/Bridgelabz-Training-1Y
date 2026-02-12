<<<<<<< HEAD
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String rev = "";

        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println("Reverse: " + rev);

        sc.close();
    }
}
=======
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String rev = "";

        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println("Reverse: " + rev);

        sc.close();
    }
}
>>>>>>> 312c94086bb55094d0100ade10577c4b7f1241de
