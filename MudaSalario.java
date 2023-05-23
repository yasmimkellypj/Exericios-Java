import java.util.*;

public class MudaSalario{
    public static void main(String[] args){
        //Aqui guardo nome e salário atual do funcionário
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, funcionário!");
        System.out.println("--------------------");
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu salário atual: ");
        Double salario = sc.nextDouble();
        Double mult = 0.0;
        
        System.out.println("---------------------");
        if(salario <= 150){
            System.out.println("Seu reajuste é de 25%!");
            mult = salario * 0.25;
            salario += mult;
        } else if(salario >=151 && salario <= 300){
            System.out.println("Seu reajuste é de 20%!");
            mult = salario * 0.20;
            salario += mult;
        } else if(salario >=301 && salario <=600){
            System.out.println("Seu reajuste é de 15%!");
            mult = salario *0.15;
            salario += mult;
        } else if(salario >600){
            System.out.println("Seu reajuste é de 10%!");
            mult = salario *0.10;
            salario += mult;
        }
        
        System.out.println("---------------------");
        System.out.printf(nome + ", o novo valor do seu salário é de R$ %.2f", salario);
    }
}