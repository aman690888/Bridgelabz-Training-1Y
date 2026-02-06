public class FizzBuzzArray {
    public static void main(String[] args) {

        int[] arr = new int[50];

        for (int i = 0; i < 50; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < 50; i++) {

            if (arr[i] % 3 == 0 && arr[i] % 5 == 0)
                System.out.println("FizzBuzz");
            else if (arr[i] % 3 == 0)
                System.out.println("Fizz");
            else if (arr[i] % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(arr[i]);
        }
    }
}
