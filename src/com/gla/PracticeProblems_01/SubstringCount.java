<<<<<<< HEAD
import java.util.Scanner;

public class SubstringCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String text = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int count = 0;

        for (int i = 0; i <= text.length()-sub.length(); i++) {

            if (text.substring(i, i+sub.length()).equals(sub))
                count++;
        }

        System.out.println("Occurrences = " + count);

        sc.close();
    }
}
=======
import java.util.Scanner;

public class SubstringCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String text = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int count = 0;

        for (int i = 0; i <= text.length()-sub.length(); i++) {

            if (text.substring(i, i+sub.length()).equals(sub))
                count++;
        }

        System.out.println("Occurrences = " + count);

        sc.close();
    }
}
>>>>>>> 312c94086bb55094d0100ade10577c4b7f1241de
