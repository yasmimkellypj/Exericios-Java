import java.util.*;

public class Triangulo{
    public static void main(String[] args){
        //Esse eu decidi fazer com um laço for
        System.out.println("--------------------");
        System.out.println("CALCULA TRIÂNGULO!");
        System.out.println("--------------------");
        Scanner sc = new Scanner(System.in);
        double total = 0;
        
        for(int i = 0; i < 3; i++){
            System.out.print("Digite o lado " + (i+1) + " do triângulo: ");
            double lado = sc.nextDouble();
            total += lado;
        }
        System.out.println("--------------------");
        String ft = String.format("%.2f", total);
        System.out.println("O perímetro do triângulo é: " + total);
        System.out.println("--------------------");
    }
}