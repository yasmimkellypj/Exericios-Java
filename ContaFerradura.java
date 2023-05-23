import java.util.*;

public class ContaFerradura{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos cavalos serão comprados: ");
        int cavalos = sc.nextInt();
        int quantia = cavalos*4;
        
        System.out.println("Serão necessárias " + quantia + " ferraduras no total.");
    }
}