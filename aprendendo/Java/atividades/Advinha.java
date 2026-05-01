package java_aulas;
import java.util.Scanner;
public class Advinha {
	public static void main(String[] args) {
		System.out.println("digite um numero(1-50 p/def):");
		Scanner ler = new Scanner(System.in);
		int secreto;
		secreto = ler.nextInt();
		int tent = 0;
		System.out.println("digite um numero(1-50):");
		while(tent != secreto) {
			tent = ler.nextInt();
			if(tent == secreto){
				System.out.println("acertou");
			}else {
				System.out.println("digite outro numero: ");
}}}}
