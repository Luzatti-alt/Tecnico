import java.util.Scanner;
public class Input {
	public static void main(String[]args){
		System.out.println("digite algo:");
		Scanner ler = new Scanner(System.in);
		String txt = ler.nextLine();
		System.out.println("Você digitou: "+txt);
	}
}
