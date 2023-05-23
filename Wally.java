import java.util.*;

public class Wally{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite aqui os possíveis novos nomes de Wally: ");
        String entrada = sc.nextLine();
        String[] nomes = entrada.split(" ");
        String escolhido = "?";
        List<String> resultados = new ArrayList<String>();
        String formatei = "";
        
        while (!entrada.equals("wally")) {
            for(int i = 0; i < nomes.length; i++){
                if (nomes[i].length() == 5 && !nomes[i].equals("wally")) {
                    escolhido = nomes[i];
                }
            }
            resultados.add(escolhido);
            //condição enquanto não for informado "wally", teremos uma nova entrada, que será transformada em uma lista
            System.out.print("Digite aqui os possíveis novos nomes de Wally: ");
            entrada = sc.nextLine();
            nomes = entrada.split(" ");
            escolhido = "?";
            
        }
        for(int j = 0; j < resultados.size(); j++){
            formatei += resultados.get(j) + " ";
        }
        
        //preferi imprimir em uma lista de uma linha só por isso formatei
        System.out.println(formatei);
    }
}
