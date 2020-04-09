package metodoabstrato;

public final class PorHora extends Empregado {
    private double valor;
    private double horas;
    
    public PorHora(String n, String s, double v, double h) {
        super(n, s);
        setValor(v);
        setHoras(h);
    }
    
    public void setValor(double v) {
        valor = (v > 0 ? v : 0.0);
    }
    
    public void setHoras(double h) {
        horas = (h >= 0 && h <= 300 ? h : 0.0);
    }
    
    //Implementação do método abstrato da superclasse Empregado
    public double ganha() {
        return valor*horas;
    }
    
    //Ligação do toString() da classe Empregado
    public String toString() {
        return "Por hora: "+super.toString();
    }
}
