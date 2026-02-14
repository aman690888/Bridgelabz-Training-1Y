<<<<<<< HEAD
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        char[] a1 = s1.replaceAll(" ", "").toCharArray();
        char[] a2 = s2.replaceAll(" ", "").toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

        sc.close();
    }
}
=======
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        char[] a1 = s1.replaceAll(" ", "").toCharArray();
        char[] a2 = s2.replaceAll(" ", "").toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

        sc.close();
    }
}
>>>>>>> 312c94086bb55094d0100ade10577c4b7f1241de
