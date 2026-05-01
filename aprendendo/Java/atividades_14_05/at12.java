package java_aulas;
import java.util.Scanner;
public class at12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite seu nome");
		String nm = ler.nextLine();
		System.out.println("digite sua idade");
		int idd = ler.nextInt();
		System.out.println(nm+" tem "+idd+" anos ");
	}
}
