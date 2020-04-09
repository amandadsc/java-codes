package livrariafloresta;

/**
 *
 * @author Cliente
 */
public class Cliente {
    public String nome;
    public int cod;
    private static int cont = 0;
    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCod() {
        return cod;
    }


    public void setCod(int cod) {
        this.cod = ++cont;
    }
    

    
    
}
