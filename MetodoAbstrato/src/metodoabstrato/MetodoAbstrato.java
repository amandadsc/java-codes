package metodoabstrato;

public class MetodoAbstrato {

    public static void main(String[] args) {
        Empregado e; //e -> variável de referência a superclasse
        String saida = "";
        Chefe c = new Chefe("Amanda", "Dias", 5000.00);
        PorComissao pc = new PorComissao("Eduarda", "Candido", 400.00, 3.00, 100);
        PorItem pi = new PorItem("Julia", "Florencio", 2.80, 200);
        PorHora ph = new PorHora("Giovanna", "Candido", 13.75, 40.50);
        
        e = c; //Recuperando as caracteristicas do chefe
        saida += e.toString()+" ganha $"+e.ganha()+"\n";
        System.out.println(saida);
    }    
}
