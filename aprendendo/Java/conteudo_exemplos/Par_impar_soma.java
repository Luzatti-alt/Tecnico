package java_aulas;
import java.util.Scanner;
public class Par_impar_soma {
	public static void main(String[]args) {
		int soma = 0;
		for(int n=1;n<=100;n++){
			if(n%2 == 0){
				soma += n;
		}
			System.out.println("soma total(pares de 0-100): "+soma);
}}}
