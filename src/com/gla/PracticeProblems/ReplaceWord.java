<<<<<<< HEAD
import java.util.Scanner;

public class ReplaceWord {

    public static String replace(String sentence, String oldWord, String newWord) {

        String[] words = sentence.split(" ");
        String result = "";

        for (String w : words) {

            if (w.equals(oldWord))
                result += newWord + " ";
            else
                result += w + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = sc.next();

        System.out.print("New word: ");
        String newWord = sc.next();

        String res = replace(s, oldWord, newWord);

        System.out.println("Result: " + res);

        sc.close();
    }
}
=======
import java.util.Scanner;

public class ReplaceWord {

    public static String replace(String sentence, String oldWord, String newWord) {

        String[] words = sentence.split(" ");
        String result = "";

        for (String w : words) {

            if (w.equals(oldWord))
                result += newWord + " ";
            else
                result += w + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = sc.next();

        System.out.print("New word: ");
        String newWord = sc.next();

        String res = replace(s, oldWord, newWord);

        System.out.println("Result: " + res);

        sc.close();
    }
}
>>>>>>> 312c94086bb55094d0100ade10577c4b7f1241de
