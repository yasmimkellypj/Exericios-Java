import java.util.*;

public class AcimaMedia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //solicito a entrada dos valores
        System.out.print("Digite a sequência de números para dar como entrada: ");
        String valores = sc.nextLine();
        
        //como o valor foi lido como string, vou separá-lo formando um array
        String[] lista = valores.split(" ");
        
        //criei uma lista de int, onde converto os valores em string para inteiro
        int[] numeros = new int[lista.length];
        for(int i = 0; i < lista.length; i++){
            numeros[i] = Integer.parseInt(lista[i]);
        }
        
        //aqui defino variaveis de controle para a soma dos números e a quantidade de elementos
        int soma = 0;
        int qntd = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
            qntd += 1;
        }
        
        //aqui controlo o tamanho do array
        int media = soma / qntd;
        int tamarray = 0;
        
        for(int i = 0; i < lista.length; i++){
            if(numeros[i] > media){
                tamarray +=1;
            }
        }
        
        int j = 0;
        int[] finalmente = new int[tamarray];
        for(int i = 0; i < lista.length; i++){
            if(numeros[i] > media){
                finalmente[j] = numeros[i];
                j++;
            }
        }
        
        String resultado = "";
        for(int i = 0; i < finalmente.length; i++){
            resultado += finalmente[i] + " ";
        }
        System.out.println("Os números acima da média são: " + resultado);
    }
}

