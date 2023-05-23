import java.util.*;

public class MaiorEntreTres{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();
        
        int[] numeros = {a, b, c};
        int maior = a;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }

        System.out.println("O maior número entre os três é: " + maior);
        
        
    }
}