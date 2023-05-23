import java.util.*;

public class Bin32{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("------------------------------");
        System.out.println("DESCUBRA UM NÚMERO EM BINÁRIO!");
        System.out.println("A regra é que seja do 0 ao 32!");
        System.out.println("------------------------------");
        System.out.print("Qual o número que você gostaria de ver? ");
        int num = sc.nextInt();
        if(num >= 32){
            System.out.println("------------------------------");
            System.out.println("Número fora do limite estabelecido!");
            System.out.println("------------------------------");
        } else{
            for(int i = 4; i >= 0; i--){
                int bin = (num >> i) & 1;
                sb.append(bin);
            }
            System.out.println("------------------------------");
            System.out.println("O NÚMERO EM BINÁRIO É " + sb);
            System.out.println("------------------------------");
        }
    }
}