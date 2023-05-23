import java.util.*;

public class Quadrado{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("BEM VINDO AO CALCULA QUADRADO!");
        System.out.println("--------------------");
        
        System.out.println("Digite o tamanho do lado do quadrado: ");
        double lado = sc.nextDouble();
        System.out.println("--------------------");
        
        double perimetro = lado * 4;
        double area = lado* lado;
        
        String formataperimetro = String.format("%.2f", perimetro);
        String formataarea = String.format("%.2f", area);
        
        System.out.println("A área do seu quadrado é: " + formataarea);
        System.out.println("O perímetro do seu quadrado é: " + formataperimetro);
        System.out.println("--------------------");
    }
}