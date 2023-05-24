import java.util.*;

public class Comissao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o valor de vendas: ");
        double vendas = sc.nextDouble();
        double comissao = 0.3;
        
        if(vendas > 1500){
            comissao = 0.5;
        }
        
        double total = salario + (vendas * comissao);
        System.out.println("O valor total ganho foi de: " + total);
    }
}
