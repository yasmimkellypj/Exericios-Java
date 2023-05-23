import java.util.*;

public class DescobreTamanho {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite uma frase: ");
      String frase = sc.nextLine();
      int tamanho = frase.length();
      
      for(int i = 0; i < tamanho; i++){
          if (frase.charAt(i) == ' '){
              tamanho--;
          }
      }
      
      System.out.println(tamanho);
    }
}