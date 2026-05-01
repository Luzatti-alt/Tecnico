package java_aulas;
import java.util.Scanner;
public class par_impar {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite um número: ");
		int n1 = scanner.nextInt();
		int res = (n1 % 2);
		if(res.equals(0)) {
			System.out.println("par");
		}else {
			System.out.println("ímpar");
		}
}}
