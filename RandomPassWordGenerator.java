import java.util.Random;

public class RandomPassWordGenerator {
    public static void main(String[] args) {

        int length = 12;

        String password = generateRandomPassword(length);

        System.out.println("Generated Password: " + password);
    }

    public static String generateRandomPassword(int length) {

        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+";

        StringBuilder passwordBuilder = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < length; i++) {

            int index = random.nextInt(characters.length());

            passwordBuilder.append(characters.charAt(index));
        }

        return passwordBuilder.toString();
    }
}
