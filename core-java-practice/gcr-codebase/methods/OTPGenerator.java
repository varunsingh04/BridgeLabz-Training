import java.util.HashSet;

public class OTPGenerator {

    //method to genrate OTP randomly using math.random 
    public static int generateOTP() {
        return (int) (Math.random() * 900000 + 100000);
    }
    
    //Method to check is the otp are all unique
    public static boolean areUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        System.out.println("OTPs: " + java.util.Arrays.toString(otps));
        System.out.println("All unique: " + areUnique(otps));
    }
}