import java.util.Scanner;
public class atividade1 {

    Scanner read=new Scanner(System.in);
    float real;
    float dolar;    
   
    void resolucao(){
        System.out.println("Digite o valor em REAL R$");
        real=read.nextFloat();
        float convertRealToDolar= real * 0.20f;
        System.out.println("\nSeu SALDO em Dólar é U$"+convertRealToDolar);
    }
    void resolucao2(){
        System.out.println("Digite o valor em DÓLAR R$");
        dolar=read.nextFloat();
        float convertDolarToReal= dolar * 4.94f;
        System.out.println("\nSeu SALDO em REAL é R$"+convertDolarToReal);
    }
}
