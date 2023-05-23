import java.util.*;

//Esse programa deve receber uma entrada A e uma entrada B e imprimir todos os números entre A e B
public class EntreAeB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = a; i <= b; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}