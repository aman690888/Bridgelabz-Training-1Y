public class OTPGenerator {

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++)
            for (int j = i + 1; j < otps.length; j++)
                if (otps[i] == otps[j])
                    return false;
        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        for (int i = 0; i < 10; i++)
            otps[i] = generateOTP();

        System.out.print("Generated OTPs: ");
        for (int otp : otps)
            System.out.print(otp + " ");

        System.out.println("\nAll OTPs Unique? " + areUnique(otps));
    }
}
