package java_aulas;
import java.util.Scanner;
public class Atv_4 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("digite seu peso: ");
		double peso = ler.nextDouble();
		System.out.print("digite sua altura(CM): ");
		double altura = ler.nextDouble();
		double imc =  (peso/(altura*altura))*10000;
		//ex 50kg 1,60m deu 0.001953125 deveria dar 19,53 
		//portanto devo multiplicar por 10000
		System.out.println("seu imc é: "+imc);
		if(imc < 24.9){
			System.out.println("abaixo do peso");
		}else if(imc > 40){
			System.out.println("obesidade III");
		}else if(imc > 39.9){
			System.out.println("obesidade II");
		}else if(imc > 34.9){
			System.out.println("obesidade I");
		}else if(imc > 29.9){
			System.out.println("excesso de peso");
		}else if(imc > 24.9){
			System.out.println("peso normal");}
	}}
