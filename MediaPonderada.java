import java.util.*;

public class MediaPonderada{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("CALCULE A MÉDIA PONDERADA");
        System.out.println("------------------------------");
        System.out.print("Qual a 1ª nota do 1º bimestre? ");
        double nota1 = sc.nextDouble();
        System.out.print("Qual a 2ª nota do 1º bimestre? ");
        double nota2 = sc.nextDouble();
        double media1 = (nota1 + nota2)/2;
        System.out.print("Qual a 1ª nota do 2º bimestre? ");
        double nota3 = sc.nextDouble();
        System.out.print("Qual a 2ª nota do 2º bimestre? ");
        double nota4 = sc.nextDouble();
        double media2 = (nota3 + nota4)/2;
        double mediafinal = (media1 + media2) / 2;
        String fm = String.format("%.2f", mediafinal);
        System.out.println("------------------------------");
        System.out.println("A média final do aluno é: " + fm);
        System.out.println("------------------------------");
    }
}