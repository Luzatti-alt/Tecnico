package java_aulas;
import java.util.Scanner;
public class switch_palavras {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite algo(batata,tomate,alface): ");
		String aaa = ler.nextLine();
		switch(aaa) {
		case "batata":
			System.out.println("batata frita");
			break;
		case "tomate":
			System.out.println("molho de tomate");
			break;
		case "alface":
			System.out.println("mato");
			break;
		default:
			System.out.println("invalido");
			break;
		}
	}
}