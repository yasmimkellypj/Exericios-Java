import java.util.*;

public class LoteriaWhile {
    public static void main(String args[]) {
        
        Random aleatorio = new Random();
        int contador = 0;
        
        while(contador < 6){
            int numero = aleatorio.nextInt(60);
            System.out.println(numero);
            contador++;
            if(numero==0){
                contador--;
            }
        }
    }
    

}