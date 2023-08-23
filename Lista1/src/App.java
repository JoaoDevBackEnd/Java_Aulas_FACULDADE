import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        boolean operation=true;
        Scanner read=new Scanner(System.in);
        cabesalho lista=new cabesalho();
        
        while(operation){
            lista.lista_exercicio();
            int escolha=read.nextInt();

            switch(escolha){
                case 1:  
                    atividade1 atv1=new atividade1();                  
                    atv1.resolucao();    
                    break;     
                case 2:
                    atividade1 atv2=new atividade1();
                   atv2.resolucao2();  
                   break;
                case 3:
                   atividade3 atv3=new atividade3();
                   atv3.resolucao();
                   break;  
                case 4:
                    atividade4 atv4=new atividade4();
                    atv4.resolucao();
                    break;
                case 5:
                   atividade5 atv5=new atividade5();
                   atv5.resolucao();    
                   break; 
                case 6:
                               
                case 13:
                    operation=false;
                break;
            }
        }
    }
}
