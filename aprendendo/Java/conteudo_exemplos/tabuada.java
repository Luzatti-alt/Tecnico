package java_aulas;
import java.util.Scanner;
public class tabuada {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("digite um número: ");
		int n1 = scanner.nextInt();
		int i = 0;
		while (i != 11) {
			System.out.println(i+"x"+n1+"="+i*n1);
			i++;
		}
	}
}
