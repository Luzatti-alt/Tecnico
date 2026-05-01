package java_aulas;
import java.util.Scanner;//* importa tudo neste caso ele so ira importar o scanner 
public class Input {
	//Scanner scanner = new Scanner(System.in); o primeiro item é uma variavel  
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("seu nome? ");
		String nome = scanner.nextLine();
		System.out.println("sua idade? ");
		int idade = scanner.nextInt();//o input fica na proxima linha
		
		System.out.print("oi "+nome);
		System.out.println("sua idade é: "+idade);
	}
}
