public class Listas{
    /*
    Agora falando sobre listas, elas são usadas para quando não sabemos quantos elementos serão setados, tal como nos Arrays, para isso usamos
    listas e nela já definimos o tipo desta forma:
    
    List<User> users = new ArrayList<>();
    
    Quando crio um ArrayList não preciso definir tamanho pois ele irá alocar espaços na memória dinamicamente para mim! Claro que precisamos 
    do import java.util.* para essa entidade.
    
    vou estar escrevendo um código da clsse App com uso de Arraylist para dar exemplo
    */
    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        
        int i = 0;
        while(i <10){
            User actual = new User("Nome" + i, "Sobrenome" + i);
            //O método add que adiciona o elemento na lista, no caso um objeto do tipo User chamado actual está sendo adicionado à lista
            users.add(actual);
            i++
        }
        System.out.println(users.get(0).getFirstName());
        System.out.println(users.get(0).gerLastName());
        
        User user11 = new User("Nome 11", "Sobrenome 11");
        users.add(user11);
        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName());
    }
    /* Diferente do array, a gente realmente não especifica a quantidade de itens que vão ter a lista, e para recuperar o objeto a gente só
    precisa usar o método get juntamente ao ÍNDICE (posição) dentro da lista*/
}