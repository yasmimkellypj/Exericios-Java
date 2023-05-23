import java.util.*;

public class IdadeDias{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("BEM VINDO AO PROGRAMA!");
        System.out.println("--------------------");
        System.out.print("Digite quantos dias você já viveu: ");
        int dias = sc.nextInt();
        int meses = dias / 30;
        int anos = meses/ 12;
        System.out.println("--------------------");
        System.out.println("Você já viveu: " + dias + " dias.");
        System.out.println("Você já viveu " + meses + " meses.");
        System.out.println("Você já viveu " + anos + " anos.");
        System.out.println("--------------------");
    }
}