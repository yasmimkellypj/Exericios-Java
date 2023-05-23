import java.util.*;

public class VerificaFuncao{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a operação que você deseja realizar (+, -, *, /)? ");
        String letra = sc.nextLine();
        
        if(letra.equals("+")){
            System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();
            int resultado = a + b;
            System.out.println("O resultado da soma dos dois números foi: " + resultado);
        } else if(letra.equals("-")){
             System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();
            int resultado = a - b;
            System.out.println("O resultado da subtração dos dois números foi: " + resultado);
        } else if(letra.equals("*")){
             System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();
            int resultado = a * b;
            System.out.println("O resultado da multiplicação dos dois números foi: " + resultado);
        } else if(letra.equals("/")){
            System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();
            if(b ==0){
                System.out.println("Valor inválido. Tente novamente.");
            } else{
                int resultado = a / b;
                System.out.println("O resultado da divisão dos dois números foi: " + resultado);
            }
        } else{
            System.out.println("ENTRADA INVALIDA! Tente novamente");
        }
    }
}


