import java.util.*;

public class Divisao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Divisão: Quociente e resto!");
        System.out.println("--------------------");
        
        System.out.print("Digite o dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Digite o divisor: ");
        int divisor = sc.nextInt();
        System.out.println("--------------------");
        
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;
        
        System.out.println("O quociente da operação é: " +  quociente);
        System.out.println("O resto da operação é: " + resto);
        System.out.println("--------------------");
        
    }
}