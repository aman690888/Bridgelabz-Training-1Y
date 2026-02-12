<<<<<<< HEAD
import java.util.Scanner;

public class MostFrequentChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char maxChar = s.charAt(0);
        int max = freq[maxChar];

        for (int i = 1; i < s.length(); i++) {

            if (freq[s.charAt(i)] > max) {

                max = freq[s.charAt(i)];
                maxChar = s.charAt(i);
            }
        }

        System.out.println("Most Frequent: " + maxChar);

        sc.close();
    }
}
=======
import java.util.Scanner;

public class MostFrequentChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char maxChar = s.charAt(0);
        int max = freq[maxChar];

        for (int i = 1; i < s.length(); i++) {

            if (freq[s.charAt(i)] > max) {

                max = freq[s.charAt(i)];
                maxChar = s.charAt(i);
            }
        }

        System.out.println("Most Frequent: " + maxChar);

        sc.close();
    }
}
>>>>>>> 312c94086bb55094d0100ade10577c4b7f1241de
