package metodoabstrato;

public final class PorComissao extends Empregado {
    private double salario;
    private double comissao;
    private int vendas;
    
    public PorComissao(String n, String s, double sa, double c, int v) {
        super(n, s);
        setComissao(c);
        setSalario(sa);
        setVendas(v);
        
    }

    public void setSalario(double s) {
        salario = (s > 0 ? s : 0.0);
    }

    public void setComissao(double c) {
        comissao = (c > 0 ? c : 0.0);
    }

    public void setVendas(int v) {
        vendas = (v > 0 ? v : 0);
    }
    
    public double ganha() {
        return salario+(comissao*vendas);
    }
    
    public String toString() {
        return "Por comissão: "+super.toString();
    }
}
