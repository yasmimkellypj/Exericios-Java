import java.util.*;

public class Calculadora {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int x = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int y = sc.nextInt();
        
        //Descobri que tem que guardar o número gerado em variáveis
        int s = soma(x,y);
        int su = sub(x,y);
        int m = mult(x,y);
        double d = div(x,y);
        
        //E finalmente posso printar o valor final sem dar erro
        System.out.println("Soma: " + s + "; Subtração: " + su + "; Multiplicação: " + m + "; Divisão: " + d + ".");
        
    }
    //Aqui a soma
    static int soma(int x, int y){
        return x+y;
        
    }
    //Aqui a subtração
     static int sub(int x, int y){
        return x-y;
    }
    //Aqui a multiplicação
    static int mult(int x, int y){
        return x*y;
    }
    //Aqui fica a divisão
    static int div(int x, int y){
        if(y == 0){
            System.out.println("Impossível realizar divisão por 0!");
            return 0;
        } else{
            return x/y;
        }
    }

}