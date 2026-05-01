package java_aulas;
import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(101); // Generates a number between 0 and 100
            System.out.println("O número aleatorio é " + num);
            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Corrected: Use printStackTrace() with proper variable name
            }
        }
    }
}
