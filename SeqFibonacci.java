import java.util.*;

public class SeqFibonacci{
    public static void main(String[] args){
        //Pegar com o usuário a quantidade de números que ele gostaria de ver
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números da sequência você gostaria de ver? ");
        int num = sc.nextInt();
        List<Integer> seq = new ArrayList<>(); 
        seq.add(0);
        seq.add(1);
        //O número 0 é sempre o que inicia a sequeñcia, então vou começar com ele já inserido na lista e ir somando 1 com o número anterior
        
        int iniciador = 1;
        for(int i = 1; i < num; i++){
            seq.add(iniciador);
            iniciador += seq.get(i);
            System.out.print(seq.get(i) + " ");
        }
    }
}