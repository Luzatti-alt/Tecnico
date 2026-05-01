package java_aulas;
import java.util.Scanner;
public class at4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite um número: ");
		int n1 = ler.nextInt();
		System.out.println("digite outro número: ");
		int n2 = ler.nextInt();
		int resp = (n1-n2);
		System.out.println("a subtração dos dois números é: "+resp);
	}

}
