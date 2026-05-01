package java_aulas;

import java.util.Scanner;

public class Switch_p2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		//faz enquanto|do{}while()
		do {
		System.out.println("1- Cadastrar usuario:");
		System.out.println("2- Excluir usuario");
		System.out.println("3- sair ");
		System.out.print("digite sua escolha: ");
		opcao = ler.nextInt();
		switch(opcao){
		case 1:
			System.out.println("Usuario foi Cadastrado");
			//se não tiver o break ele roda os outros resultados
			break;
		case 2:
			System.out.println("Usuario foi Excluido");
			break;
		case 3:
			System.out.println("saindo...");
			break;
		default:
			System.out.println("selecão invalida");
		}
	}while (opcao != 3);}
}
