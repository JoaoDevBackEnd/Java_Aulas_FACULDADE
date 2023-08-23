import java.util.Scanner;
public class cabesalho {
    String escolha;
    Scanner read=new Scanner(System.in);
    void lista_exercicio(){
        System.out.println("\nESCOLHA UMA LISTA DOS EXÉRCICIOS \n");
        System.out.println("1 - ATIVIDADE REAL PARA DOLAR \n");
        System.out.println("2 - ATIVIDADE DOLAR PARA REAL \n");
        System.out.println("3 - ATIVIDADE PAR OU ÍMPAR? \n");
        System.out.println("4 - ATIVIDADE O DOUBLE É MAIOR OU MENOR QUE 0? \n");
        System.out.println("5 - ATIVIDADE CONVERTER FAHRENHEIT PARA CELSIUS \n");
        System.out.println("6 - ATIVIDADE TROCA DE PÁPEIS\n");
        System.out.println(" 13- ENCERRA O PROGRAMA  ! ! !");
    }
    void lista_escolha(String escolha ){

        switch(escolha){
            case "1":  
                atividade1 atv1=new atividade1();                  
                atv1.resolucao();    
                lista.verficacao(escolha);
            case "2":
               atividade1 atv2=new atividade1();
               atv2.resolucao2();  
               lista.verficacao(escolha);
               break;
            case "3":
               atividade3 atv3=new atividade3();
               atv3.resolucao();
               lista.verficacao(escolha);
            case "4":
                atividade4 atv4=new atividade4();
                atv4.resolucao();
                lista.verficacao(escolha);
            case "5":
               atividade5 atv5=new atividade5();
               atv5.resolucao();    
               lista.verficacao(escolha);
            case "Y":
               break;            
            case "F":
                System.out.println("Obrigado !");
                operation=false;
            break;
        }
    }
    void verficacao(String escolha){
        System.out.println("Pressione Y - VOLTAR PARA A LISTA  ou R - RESETAR O EXERCÍCIO  ou F - PARA FINALIZAR !");
        escolha=read.next();
        switch(escolha){  
           case "Y":
           case "R":
             lista_escolha(escolha);
           case "F":
           boolean cancelado=false;
           System.out.println("Obrigado por visitar meu programa :) ");
            App.lista(cancelado);          
        }
    }
}
