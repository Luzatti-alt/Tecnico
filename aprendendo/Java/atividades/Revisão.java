package java_aulas;
import java.util.Scanner;
public class Revisão {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite um número: ");
		double n1 = ler.nextDouble();
		System.out.println("digite outro número: ");
		double n2 = ler.nextDouble();
		double div = (n1/n2);
		System.out.println("divisão entre os dois é: "+div);
	}
}