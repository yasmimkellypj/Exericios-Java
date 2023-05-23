import java.util.*;

public class NotaAlunos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int maior = -1;
        int menor = 1001;
        int somaNotas = 0;
        int numAlunos = 0;
        int numAcima = 0;
        int numAbaixo = 0;
        
        while (true){
            String entrada = sc.nextLine();
            
            if(entrada.equals("-")){
                break;
            }
            
            String[] dados = entrada.split(" ");
            String nome = dados[0];
            int nota = Integer.parseInt(dados[1]);
            
            if(nota > maior){
                maior = nota;
            }
            
            if(nota < menor){
                menor = nota;
            }
            
            somaNotas += nota;
            numAlunos ++;
            
            if(nota>=700){
                numAcima++;
            }
            if(nota<700){
                numAbaixo++;
            }
            
        }
        int media = somaNotas / numAlunos;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
        System.out.println("Acima: " + numAcima);
        System.out.println("Abaixo: " + numAbaixo);
    }
}