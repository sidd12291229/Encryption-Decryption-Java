import java.security.SecureRandom;
import java.util.Base64;

public class RandomSecretKeyGenerator {

    public static void main(String[] args) {
        // Specify the length of the secret key in bytes
        int keyLength = 32; // You can adjust this value as needed

        // Generate a random secret key
        byte[] secretKey = generateRandomKey(keyLength);

        // Encode the secret key to a Base64 string for better readability
        String encodedKey = Base64.getEncoder().encodeToString(secretKey);

        // Display the generated secret key
        System.out.println("Random Secret Key: " + encodedKey);
    }

    public static byte[] generateRandomKey(int keyLength) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] key = new byte[keyLength];
        secureRandom.nextBytes(key);
        return key;
    }
}
