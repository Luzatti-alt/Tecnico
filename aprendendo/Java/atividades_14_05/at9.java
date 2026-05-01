package java_aulas;
import java.util.Scanner;
public class at9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite sua idade(em anos): ");
		int idd = ler.nextInt();
		int dias = idd*365;
		System.out.println("digite sua idade em dias é: "+ dias);
	}
}
