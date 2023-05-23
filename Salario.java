import java.util.*;

public class Salario{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double min = 1320.00;
        System.out.println("Qual o seu salário atual? ");
        double salario = sc.nextDouble();
        int valor = 0;
        if(salario >= min){
            valor = (int)(salario/min);
            System.out.println("Você recebe o equivalente a " + valor + " salário(s) minimo(s).");
        } else{
            System.out.println("Seu salário é menor do que um salário mínimo!");
        }
    }
}

//nesse eu decidi arredondar a quantidade de salários recebidos cortando as casas decimais (convertendo em int)