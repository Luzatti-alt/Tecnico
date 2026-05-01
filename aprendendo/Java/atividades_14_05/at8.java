package java_aulas;
import java.util.Scanner;
public class at8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite uma distância(em metros): ");
		int m = ler.nextInt();
		int convert = m*100;
		System.out.println("A conversão de metros em cm é: "+ convert);
	}
}
