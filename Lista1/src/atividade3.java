import java.util.Scanner;
public class atividade3 { 
    Scanner read=new Scanner(System.in);  
    public static String getParouImpar(int valor){
            return valor % 2==0 ?  "PAR": "ÍMPAR";
    }
    void resolucao(){
        System.out.println("Digite um valor");
        int result=read.nextInt();
        
        System.out.println("O Resultado é "+getParouImpar(result));
    }
}
