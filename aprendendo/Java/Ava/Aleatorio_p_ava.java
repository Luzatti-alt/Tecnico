import java.util.Random;
public class Aleatorio_p_ava {
	public static void main(String[]args) {
		Random rand = new Random();
		int num = rand.nextInt(101);
	    System.out.println("O número aleatorio é " + num);
	}
}
