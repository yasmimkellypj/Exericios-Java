import java.util.*;

public class OrdenacaoEComparacao{
    /*
    Sempre bom lembrar que nós podemos ordenar os arrays com o método Sort (Array.sort), porém quando tentamos imprimir um objeto, ele sempre imprime
    o chamado 'hashcode', uma sequência de caracteres estranhos, tipo de identificação do objeto. Então para imprimir corretamente precisamos fazer uma
    interação, como a propriedade toString, como mostra o exemplo abaixo:
    */
    public static void main(String[] args){
        int[] numbers = new int[]{0,10, 23, 5, 33, 41, 16, 12, 25};
        Arrays.sort(numbers);
        
        //Essa linha abaixo só vai mostar o hashcode do Array numbers
        System.out.println(numbers);
        
        //Já esta linha vai impriimr corretamente o Array com seus elementos após o uso do sort, pois é toString
        System.out.println(Arrays.toString(numbers));
        
        
        // AGORA vamos falar sobre COMPARAÇÃO DE ARRAYS, dessa vez faremos duas listas muito parecidos
        
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{1, 2, 3};
        
        //Essa linha vai retornar 'false' pois seu hashcode (locação na memória) é diferente, e é isso que ele está comparando
        System.out.println(a == b);
        //O equals também não compara bem Arrays (talvez só strings, nem lembro);
        System.out.println(a.equals(b));
        //Então vamos ver seus hashcodes imprimindo eles;
        System.out.println(a + " " + b);
        
        /* Para resolver isso, como estamos comparando ESPAÇOS NA MEMÓRIA, temos que dizer que o b é igual ao a desta forma:
        int[] a = new int[]{1,2,3};
        int[] b = a;
        Aí sim ele retornará True, mas no caso vamos trocar o nome 'b' por 'c', pois 'b' já foi declarada no código */
        
        int[] c = a;
        System.out.println(a == c);
        
        /* Mas e quando a gente quer comparar o CONTEÚDO dos Arrays, e não seu local na memória? Bom, a gente simplesmente usa
        equals, mas de uma maneira diferente, e aí sim vamos ter o retorno True. Veja à seguir: */
        System.out.println(Arrays.equals(a, b));
        
        /* Por último vamos falar de preenchimento de Arrays, que pode ser usado o método Arrays.fill(nome_do_array, 1, 2, 3,...,)
        Para que isso serve? Para inserir valores PADRÕES dentro do Array. Veja: 
        String[] names = new String[10];
        //Nesse primeiro print, as 10 posições estariam "null"
        System.out.println(Arrays.toString(names));
        Array.fill(names, "Desconhecido");
        //Neste novo print, as opções vazias antes, agora estão preenchidas com a palavra "desconhecido", como um padrão
        System.out.prinln(Arrays.toString(names));
        */
    }
}