import java.util.*;

public class Circunferencia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("CALCULA CIRCUNFERÊNCIA!");
        System.out.println("--------------------");
        System.out.println("Digite o valor do raio da circunferência: ");
        double raio = sc.nextDouble();
        System.out.println("--------------------");
        
        //Calculos
        double pi = 3.1415;
        double perimetro = (2 *pi) * raio;
        double area = pi * (raio *raio);
        
        //formatando para duas casas decimais
        String fp = String.format("%.2f", perimetro);
        String fa = String.format("%.2f", area);   
        
        //Saídas 
        System.out.println("A área da circunferência é: " + fa);
        System.out.println("O perímetro da circunferência é: " + fp);
    }
}