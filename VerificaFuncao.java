import java.util.*;

public class VerificaFuncao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int c = sc.nextInt();
        System.out.print("Digite o quarto valor: ");
        int d = sc.nextInt();
        
        if(d> c && c>b && b>a){
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        }   else if(a> b && b>c && c>d){
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        } else{
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        }
    }
}
