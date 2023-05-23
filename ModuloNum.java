import java.util.*;

public class ModuloNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("MÓDULO DO NÚMERO");
        System.out.println("------------------------------");
        System.out.print("Qual o valor do número para ver o módulo: ");
        int num = sc.nextInt();
        if(num <=0){
            num = num * (-1);
        }
        System.out.println("------------------------------");
        System.out.println("O módulo do número fica: "+ num);
        System.out.println("------------------------------");
        
    }
}