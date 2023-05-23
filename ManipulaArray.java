import java.util.*;

public class ManipulaArray{
    /*
    Aqui vamos ver algumas propriedades para a manipulação de ArrayList
    */
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        
        //Assim se adiciona elementos no ArrayList
        names.add("Nome 1");
        names.add("Nome 2");
        names.add("Nome 3");
        names.add("Nome 4");
        
        //como buscar um elemento específico pelo índice (usando o objeto.get(indice));
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        
        //Busca o índice à partir de um elemento
        int index = names.indexOf("Nome 1");
        System.out.println(index);
        
        //Verifica se a lista está vazia
        System.out.println(names.isEmpty());
        
        //Verifica se a lista contém algum elemento
        System.out.println(names.contains("Nome 2"));
        
        //Para "matar" o objeto usamos null. Ex: names = null;
        //Mas para limpar a lista interna e manter ela vazia novamente, oq vai retornar True no "isEmpty"
        names.clear();
        System.out.println(names.isEmpty());
        
    }
}