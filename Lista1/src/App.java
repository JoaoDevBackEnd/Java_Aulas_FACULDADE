import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        boolean operation=true;
        Scanner read=new Scanner(System.in);
        while(operation){
              lista(operation);
        }
        
        
    }
    public static void lista(boolean operation){
     
      if(operation==true){
               cabesalho lista=new cabesalho();
               lista.lista_exercicio();
      }
               
        
    }
}
