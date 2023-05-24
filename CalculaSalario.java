import java.util.*;

public class CalculaSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horas = sc.nextInt();
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHr = sc.nextDouble();
        double valorFinal = 0;
        
        if (horas <= 40) {
            valorFinal = valorHr * horas;
        } else {
            int extraHora = horas - 40;
            double extraVal = (valorHr + (valorHr * 0.5)) * extraHora;
            valorFinal = extraVal + (valorHr * 40);
        }
        
        System.out.println("O valor final mensal do seu salário é de: R$" + valorFinal);
    }
}
