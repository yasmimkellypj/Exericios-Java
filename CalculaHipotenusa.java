import java.util.*;

public class CalculaHipotenusa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro cateto: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor do segundo cateto: ");
        double b = sc.nextDouble();
        
        double hipotenusa = Math.sqrt((a*a) + (b*b));
        System.out.println("A hipotenusa é: " + hipotenusa);
    }
}