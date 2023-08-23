import java.util.Scanner;
public class atividade4 {
    Scanner read=new Scanner(System.in);
    double valor;
    public static String getPositionNegativo(double result){ 
        return result >=0 ? "POSITIVO" : "NEGATIVO";
    }

    void resolucao(){
        System.out.println("Digite um valor");
        valor=read.nextDouble();
        System.out.println("O VALOR É: "+getPositionNegativo(valor));
    }    
}
