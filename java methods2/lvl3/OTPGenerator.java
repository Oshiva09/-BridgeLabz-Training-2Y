import java.util.Arrays;

public class OTPGenerator {

    // ✅ Method 1: Generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        // Math.random() -> returns [0.0, 1.0)
        // Multiply by 900000 → range 0–899999, then +100000 → 100000–999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // ✅ Method 2: Check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // duplicate found
                }
            }
        }
        return true; // all unique
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        // Check uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("\n✅ All OTPs are unique!");
        } else {
            System.out.println("\n❌ Duplicate OTPs found!");
        }
    }
}
