import java.util.*;

public class LoteriaFor {
    public static void main(String args[]) {
        //aqui declaro o objeto para random
        Random aleatorio = new Random();
        
        //dentro do laço for imprimo cada número sorteado do 0 ao 60
        for(int i = 0; i < 6; i++){
            int numero = aleatorio.nextInt(60);
            System.out.println(numero);
        }
    }
}