package livrariafloresta;

/**
 *
 * @author Cliente
 */
public class Livros {
    public String titulo;
    public int pag;
    public double valor;
    public Cliente cod;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public Cliente getCod() {
        return cod;
    }


    public void setCod(Cliente cod) {
        this.cod = cod;
    }
}
