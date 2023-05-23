import java.util.*;

public class ConfereMedia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double a = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double b = sc.nextDouble();
        boolean passou = false;
        double media = (a+b)/2;
        if(media >= 7){
            passou = true;
            System.out.println(passou);
        } else{
            System.out.println(passou);
        }
    }
}
