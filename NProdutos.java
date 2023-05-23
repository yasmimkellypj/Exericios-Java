import java.util.*;

public class NProdutos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número: ");
        double num = sc.nextDouble();
        double meta = 0;
        double talvez = num*0.2;
        
        if(num <= 100){
            meta = talvez;
        } else{
            meta = 20;
        }
        
        String formatado = String.format("%.2f", meta);
        double bonus = (num - 2 * meta) * 0.5;
        
        System.out.println("Meta: " + formatado);
        System.out.println("Bônus: " + bonus);
    }
}