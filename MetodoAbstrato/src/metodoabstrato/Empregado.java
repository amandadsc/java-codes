package metodoabstrato;

public abstract class Empregado {
    //Como a classe contém um método ela deve ser declarada como abstract
    private String nome;
    private String sobrenome;
    
    
    public Empregado(String n, String s) {
        nome = n;
        sobrenome = s;
        
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    public String toString() {
        return nome+' '+sobrenome;
    }
    
    //Método abstrato deve ser implementado
    public abstract double ganha();
    
    /*
     * Declarando o método como abstrato na superclasse garante-se que em todas 
     * as subclasses feitas terão implementaçãoes do método ganha() em todas as 
     * outras, do contrário o objeto dessas classes não pode ser criado.
     */

}
