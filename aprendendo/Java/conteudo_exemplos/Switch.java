package java_aulas;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("1- Cadastrar usuario:");
		System.out.println("2- Excluir usuario");
		System.out.println("3- sair ");
		System.out.print("digite sua escolha: ");
		int ops = ler.nextInt();
		switch(ops) {
		case 1:
			System.out.println("Usuario foi Cadastrado");
			break;
			//se não tiver o break ele roda os outros resultados
		case 2:
			System.out.println("Usuario foi Excluido");
			break;
		case 3:
			System.out.println("saindo...");
			break;
		default:
			System.out.println("selecão invalida");
		}
	}
}
