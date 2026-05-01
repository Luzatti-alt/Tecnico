package java_aulas;
import java.util.Scanner;
public class Atv_6 {
	public static void main(String[] args) {
		//validar senha
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		String senha = ler.nextLine();
		if (senha.length()>=8) {
			//.lenght()>=8 limita de 8 letras ou mais
			System.out.println("senha valida");
		}else{
			System.out.println("senha invalida");
		}
	}
}
