package java_aulas;
import java.util.Scanner;
public class Calc {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("tipo de operação(+-*/)? ");
		String tp_calc = scanner.nextLine();
		//não pode ser == que nem C pois le precisa de .equals("") para comparar com uma str
		if(tp_calc.equals("soma")|| tp_calc.equals("+")) {
			System.out.println("soma foi selecionada: \n ");
			System.out.println("digite um número ");
			double n1 = scanner.nextInt();
			System.out.println("digite um número: ");
			double n2 = scanner.nextInt();
			double Res = n1 + n2;
			System.out.println("Resultado: "+Res);
		}else if(tp_calc.equals("subtração")|| tp_calc.equals("-")) {
			System.out.println("subtração foi selecionada: \n ");
			System.out.println("digite um número ");
			double n1 = scanner.nextInt();
			System.out.println("digite um número: ");
			double n2 = scanner.nextInt();
			double Res = n1 - n2;
			System.out.println("Resultado: "+Res);
		}else if(tp_calc.equals("multiplicação")|| tp_calc.equals("*")) {
			System.out.println("multiplicação foi selecionada: \n ");
			System.out.println("digite um número ");
			double n1 = scanner.nextInt();
			System.out.println("digite um número: ");
			double n2 = scanner.nextInt();
			double Res = n1 * n2;
			System.out.println("Resultado: "+Res);
		}else if(tp_calc.equals("divisão") || tp_calc.equals("/")) {
			System.out.println("divisão foi selecionada: \n ");
			System.out.println("digite um número ");
			double n1 = scanner.nextInt();
			System.out.println("digite um número: ");
			double n2 = scanner.nextInt();
			double Res = n1 / n2;
			System.out.println("Resultado: "+Res);
		}else {System.out.println("sinal errado ou não está disponivel");}
	}
}
