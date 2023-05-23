import java.util.*;

public class VolumeOleo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("CALCULE O VALUME DA LATA DE ÓLEO!");
        System.out.println("-----------------------------------");
        System.out.print("Qual o raio da lata? ");
        double raio = sc.nextDouble();
        System.out.print("Qual a altura da lata? ");
        double altura = sc.nextDouble();
        double pi = 3.1415;
        System.out.println("-----------------------------------");
        double volume = pi * (raio * raio) * altura;
        String forma = String.format("%.2f", volume);
        System.out.println("O volume da lata de óleo é de: " + forma);
        System.out.println("-----------------------------------");
    }
}