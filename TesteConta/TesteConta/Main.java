public class Main {

    public static void main(String[] args) {
        double saldoDisponivel;
        
        //Criando um objeto de cada Classe
        Conta conta = new Conta();
        Cliente cliente = new Cliente();
        CartaoDeCredito cdc = new CartaoDeCredito();
        
        //Ligar os objetos
        cdc.cliente = cliente;
        
        //Acessando os atributos
        cdc.cliente.nome = "Amanda";
        conta.saldo = 1000.0;
        conta.numero = 1;
        
        //Chamando metodo deposita()
        conta.deposita(1000);
        
        //Armazenando a resposta do metodo em uma variavel
        saldoDisponivel = conta.consultaSaldoDisponivel();
        
        //Imprimindo na tela
        System.out.println("Bem-vindo, "+cdc.cliente.nome);
        System.out.println("Seu saldo é de: "+conta.saldo);
        System.out.println("Conta: "+conta.numero);
        System.out.println(saldoDisponivel);
    }
    
}
