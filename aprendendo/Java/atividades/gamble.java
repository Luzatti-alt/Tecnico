package java_aulas;
import java.util.Scanner;
public class gamble {
    public static void main(String[]args){
        double fichas = 1000;
        Scanner ler = new Scanner(System.in);
        while(fichas != 0||fichas < 0){
            System.out.print("quantos você apostaria: ");
            double aposta = ler.nextDouble();
            System.out.println("quantidade de fichas: "+fichas);
            System.out.println("apostou: "+ aposta);
            System.out.println("gostaria de apostar em qual número(0-100): ");
            double num = ler.nextInt();
            double sorte = Math.floor(Math.random()*100);
            System.out.println("o número sorteado é: "+sorte+" \n");
            if (sorte == num){
                fichas += fichas * 0.03;
            }else{fichas -= aposta;}
            if(fichas < 0) {
            	break;
            }
        }System.out.println("fim do jogo,você faliu."+fichas);
    }
}
