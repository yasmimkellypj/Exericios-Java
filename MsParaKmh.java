import java.util.*;

public class MsParaKmh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("M/S PARA KM/H");
        System.out.println("------------------------------");
        System.out.print("Qual o valor da velocidade em m/s? ");
        double ms = sc.nextDouble();
        double conv = ms * 3.6;
        System.out.println("------------------------------");
        System.out.println(ms + " m/s são equivalentes a " +conv+ " km/h.");
        System.out.println("------------------------------");
        
    }
}