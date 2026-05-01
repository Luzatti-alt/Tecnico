package java_aulas;
import java.util.Scanner;
public class Dia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite o dia(1-7)(resultado abril 2025): ");
		int dia = ler.nextInt();
		switch(dia){//dia 07/04/2025 segunda
		case 1:
			System.out.println("hoje dia "+dia+" é terça");
			System.out.println("semana 1");
			break;
		case 2:
			System.out.println("hoje dia "+dia+" é quarta");
			System.out.println("semana 1");
			break;
		case 3:
			System.out.println("hoje dia "+dia+" é quinta");
			break;
		case 4:
			System.out.println("hoje dia "+dia+" é sexta");
			System.out.println("semana 1");
			break;
		case 5:
			System.out.println("hoje dia "+dia+" é sábado");
			System.out.println("semana 1");
			break;
		case 6:
			System.out.println("hoje dia "+dia+" é domingo");
			System.out.println("semana 2");
			break;
		case 7:
			System.out.println("hoje dia "+dia+" é segunda");
			System.out.println("semana 2");
			break;
		}
	}
}
