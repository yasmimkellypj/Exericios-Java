import java.util.*;

public class ResumoDoMes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] meses = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        String[] sub = new String[12];
        
        for(int i = 0; i < 14; i++){
            String[] input = sc.nextLine().split(" ");
            float n1 = Float.parseFloat(input[0]);
            float n2 = Float.parseFloat(input[1]);
            float valor = n1 - n2;
            String valorFormatado = String.format("%.2f", valor);
            sub[i] = valorFormatado;
        }
        
        for(int j = 0; j <14; j++){
            System.out.println(meses[j] + ": " + sub[j]);
        }
    }
}