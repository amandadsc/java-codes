public class Conta {
  
    //metodo
    double consultaSaldoDisponivel() {
        return this.saldo + this.limite;
    }
    
    void deposita(double valor) {
        this.saldo += valor;
    }
    
    double saldo;
    double limite = 500.0;
    int numero;
}