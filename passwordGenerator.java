import java.security.SecureRandom;
import java.util.Scanner;


public class passwordGenerator {

        private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
        private static final String NUMBER = "0123456789";
        private static final String OTHER_CHAR = "!@#$%&*()_+-=[]?";
        //This sets the characters to form the password
        private static final String PASSWORD_ALLOW_BASE = CHAR_LOWER + CHAR_UPPER + NUMBER + OTHER_CHAR;
        //Combining all characters
        private static SecureRandom random = new SecureRandom();

        public static String generatePassword(int length) {
            if (length < 1) throw new IllegalArgumentException();

            StringBuilder password = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                password.append(PASSWORD_ALLOW_BASE.charAt(random.nextInt(PASSWORD_ALLOW_BASE.length())));
            }
            return new String(password);
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the desired password length: ");
            int length = scan.nextInt();
            System.out.println("Generated password: " + generatePassword(length));
        }
    }