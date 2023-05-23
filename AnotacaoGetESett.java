public class AnotacaoGetESett{
    /*
    Se eu definir uma propriedade como pública, em qualquer lugar do meu programa vou conseguir mudar o estado daquele objeto depois que
    ele tiver vida. Isso não é uma boa prática de programação, e para isso a gente deixa a propriedade privada e cria um get (para pegar)
    e sett (para alterar) a propriedade. Exemplo:*/
    
    private String firstName;
    private String lastName;
    
    //Setter, modifica, e você pode atribuir mudanças na variável, como aqui colocamos o uppercase
    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }
    
    //Getter busca a propriedade, então ele retorna essa propriedade
    public String getFirstName(){
        this.firstName;
    } 
    
    /* Digamos que o código acima está na classe user, e ela será usada na class app da seguinte forma:
    public class App{
        public static void main(String[] args){
            User userA = new User;
            userA.setFirstName("Yasmim");
            
            System.out.println(userA.getFirstName());
        }
    }
}