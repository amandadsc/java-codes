package metodoabstrato;

public final class PorItem extends Empregado {
    private double producao;
    private int quantidade;
    
    public PorItem(String n, String s, double p, int q) {
        super(n, s);
        setProducao(p);
        setQuantidade(q);
    }

    public void setProducao(double p) {
        producao = (p > 0 ? p : 0.0);
    }

    public void setQuantidade(int q) {
        quantidade = (q > 0 ? q : 0);
    }
    
    public double ganha() {
        return producao*quantidade;
    }
    
    public String toString() {
        return "Por item: "+super.toString();
    }
    
    
    
}
