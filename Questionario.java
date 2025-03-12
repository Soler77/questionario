import java.util.Scanner; //importar a classe (atributo) scanner para a entrada de dados
public class Questionario { //declara a classe principal

     /**
    * @param args
    */
    public static void main(String [] args) { //o programa de entrada
      
      Scanner scanner = new Scanner(System.in);//cria um objeto scanner pra ler a entrada do usuario 
      //faz a pergunta e exige resposta
      System.out.println("A terra é redonda? (responda: sim ou não)");
      String resposta = scanner.nextLine().toLowerCase();
      
      if(resposta.equals("sim")){//verifica a resposta do usuario

         System.out.println("parabéns!"); 

      } else if (resposta.equals("não") ||resposta.equals("nao")){

         System.out.println("Precisa melhorar.");
         
      }else {
         System.out.println("resposta invalida.");
      }

      scanner.close();

    //feccha o escanner para liberar recursos     
   }

}
