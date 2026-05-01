package java_aulas;
import java.util.Scanner;
import java.util.Random;// ou Math.floor(Math.random()*num de possiveis casa);
public class Atv_5 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		Random num = new Random();
		int num_secreto = num.nextInt(10)+1; 
		//System.out.println("num: "+ num_secreto);
		int tent = 10;
		while (tent != 0) {
			System.out.println("número de tentativas: "+ tent);
			System.out.println("digite um número de 0-10");
			int resp = ler.nextInt();
			
			if(num_secreto == resp){
				System.out.println("fim de jogo, você ganhou");
				break;
			}else if(num_secreto > resp) {
				System.out.println("número deve ser maior:");
				tent--;
			}else if (num_secreto < resp) {
				System.out.println("número deve ser menor:");
				tent--;}
			}
		if (tent == 0){
			int i = 0;
			while(i < 5){
				System.out.println("  ");
				i++;
			}
			System.out.println("fim de jogo, você perdeu");
		}
		}
	}
