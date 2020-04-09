package metodoabstrato;

public final class Chefe extends Empregado {
    private double salario;
    
    public Chefe(String n, String s, double sa) {
        super(n, s);
        setSalario(sa);
    }

    public void setSalario(double s) {
        salario = (s > 0 ? s : 0.0);
    }
    
    //Implementação do método abstrato da superclasse Empregado
    public double ganha() {
        return salario;
    }
    
    //Ligação do toString() da classe Empregado
    public String toString() {
        return "Chefe: "+super.toString();
    }
}
