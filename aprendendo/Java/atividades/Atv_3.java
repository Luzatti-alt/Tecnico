package java_aulas;
import java.util.Scanner;
public class Atv_3 {
	//tabuada personalizada
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("digite um número: ");
		int n1 = scanner.nextInt();
		System.out.print("a quantidade de vezes(ex:y.1,y.2,y.3,y.4,etc): ");
		int i = scanner.nextInt();
		int r = 0;
		while (r != i+1) {
			System.out.println(r+"x"+n1+"="+r*n1);
			r++;
		}
	}
}
