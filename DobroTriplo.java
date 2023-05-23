import java.util.*;

public class DobroTriplo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número que você gostaria de ver o dobro e o triplo: ");
        int num = sc.nextInt();
        int dobro = num * 2;
        int triplo = num * 3;
        System.out.println("dobro: " + dobro + ", triplo: " + triplo);
    }
}