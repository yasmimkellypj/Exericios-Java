import java.util.*;

public class PositivoNegativo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("POSITIVO OU NEGATIVO?");
        System.out.println("------------------------------");
        System.out.print("Qual o valor do número para conferir: ");
        int num = sc.nextInt();
        if(num <0){
            System.out.println("------------------------------");
            System.out.println("O número é negativo");
            System.out.println("------------------------------");
        } else if(num > 0){
            System.out.println("------------------------------");
            System.out.println("O número é positivo");
            System.out.println("------------------------------");
        } else{
            System.out.println("------------------------------");
            System.out.println("O número é núlo");
            System.out.println("------------------------------");
        }
        
    }
}