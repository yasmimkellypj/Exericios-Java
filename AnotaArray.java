public class AnotaArray{
    /*A gente pode criar Arrays para armazenar objetos, que são coleções (lugares na memória acessados por índice) e ele é declarado assim*/
    public static void main(String[] args){
        User[] users = new User[10];
        
        for(i=0; i < users.length();i++){
            User actual = new User();
            actual.setFirstName("Nome" + i);
            actual.setLastName("Sobrenome" + i);
            users[i] = actual;
            //Perceba que este for está atrelado ao main criado no arquivo de Gets e Sets!
        }
        
        //E aqui ele pega pelo índice o que está guardado dentro
        System.out.prinln(users[2].getFirstName);
    }
}