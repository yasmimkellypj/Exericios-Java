import java.util.*;

public class CalculaArea{
    public static void main(String[] args){
        //Aqui crimamos o objeto para nossa entrada, famoso scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite aqui a largura do terreno: ");
        
        //Aqui pegamos as entradas do usuário de terrenos retangulares para calcular a àrea
        double a = sc.nextDouble();
        System.out.print("Agora digite a altura do terreno: ");
        double b = sc.nextDouble();
        
        //Aqui calculamos a área do terreno com os valores de entrada e formatamos seu valor final
        double area = a*b;
        
        //E aqui mostramos ao usuário como fica o valor final do terreno
        System.out.println("A área do terreno a ser comprado é de: " + area + "m²");
    }
}