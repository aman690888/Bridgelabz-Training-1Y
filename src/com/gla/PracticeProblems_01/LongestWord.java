<<<<<<< HEAD
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");

        String longest = words[0];

        for (String w : words) {

            if (w.length() > longest.length())
                longest = w;
        }

        System.out.println("Longest word: " + longest);

        sc.close();
    }
}
=======
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");

        String longest = words[0];

        for (String w : words) {

            if (w.length() > longest.length())
                longest = w;
        }

        System.out.println("Longest word: " + longest);

        sc.close();
    }
}
>>>>>>> 312c94086bb55094d0100ade10577c4b7f1241de
