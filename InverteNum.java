import java.util.*;

public class InverteNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("------------------------------");
        System.out.println("UM NÚMERO AO CONTRÁRIO");
        System.out.println("------------------------------");
        System.out.print("Qual o valor do número para reverter: ");
        int num = sc.nextInt();
        sb.append(num);
        System.out.println("------------------------------");
        System.out.println("O número invertido fica: "+sb.reverse());
        System.out.println("------------------------------");
        
    }
}