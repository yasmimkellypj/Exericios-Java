import java.util.*;

public class Fahrenheit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("BEM VINDO AO CONVERSOR DE MEDIDAS!");
        System.out.println("--------------------");
        System.out.print("Digite aqui a temperatura em Fahrenheit: ");
        double fah = sc.nextDouble();
        double conv = (fah - 32) / 1.8;
        String form = String.format("%.2f", conv);
        
        System.out.println("--------------------");
        System.out.println("Os " + fah + " em Fahrenheit são " + conv + " em Celcius.");
    }
}