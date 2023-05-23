import java.util.*;

public class DiasIdade{
    public static void main(String[] args){
        //Aqui crio o método de entrada e pergunto nome e idade do usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Quantos anos você tem? ");
        int idade = sc.nextInt();
        
        //aqui calculo quantos dias a pessoa tem de acordo com a idade informada
        int dias = idade *365;
        //e aqui imprimo quantos dias a pessoa tem e digo a ela
        System.out.println("Você tem " + dias + " dias de vida, " + nome + ".");
        
    }
}