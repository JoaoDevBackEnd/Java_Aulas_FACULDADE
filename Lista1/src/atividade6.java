import java.util.Scanner;
public class atividade6 {
    Scanner read=new Scanner(System.in);
    int a ;
    int b;
    void resolucao()
    {
        System.out.println(" VALOR INTEIRO DE A:");
        a=read.nextInt();
        System.out.println(" VALOR INTEIRO DE B:");
        b=read.nextInt();
         
        System.out.format("VALOR A: %a \n Valor de B: %b",a,b);
        int c=a;
        a=b;
        b=c;
        System.out.format("TROCANDO OS VALORES \n A = %d \n B = %f",a,b);
    }
}
