import java.util.Scanner;
public class atividade4 {
    Scanner read=new Scanner(System.in);
    float feh;
    

    void resolucao(){
     System.out.println("\nDigite um valor em Fahrenheit");
     feh=read.nextFloat();
     
     float result = (feh - 32) /  1.8f;
     System.out.println("\n O Resultado em Celcius é : "+(int)result);
     
    }
}
