import java.util.*;

public class Retangulo{
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("CALCULA RETÂNGULO!");
        
        //Peço a entrada do usuário
        System.out.println("--------------------");
        System.out.print("Digite a altura do retângulo:  ");
        double altura = sc.nextDouble();
        System.out.print("Digite a largura do retângulo:  ");
        double base = sc.nextDouble();
    
        //Calculei area e base do retângulo
        double area = base * altura;
        double perimetro = (base * 2) + (altura * 2);
    
        //Formatar os números para aparecerem apenas duas casas decimais:
        String formaarea = String.format("%.2f", area);
        String formaperimetro = String.format("%.2f", perimetro);
        
        //Aqui imprimo os números
        System.out.println("--------------------");
        System.out.println("A àrea desse retângulo é: " + formaarea);
        System.out.println("O perímetro desse retângulo é: " + formaperimetro);
        System.out.println("--------------------");
    }
}