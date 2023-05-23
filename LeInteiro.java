import java.util.*;

public class LeInteiro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("VEJA O SUCESSOR DE UM INTEIRO!");
        System.out.println("--------------------");
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        int suc = num +1;
        System.out.println("O sucessor do número " + num + " é " + suc);
        System.out.println("--------------------");
    }
}