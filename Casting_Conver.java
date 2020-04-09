package casting_conver;

public class Casting_Conver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Casting feito implicitamente, pois o valor possui
        um tamanho menor que o tipo da variável que irá recebê-lo*/
        char a = 'a';
        int b = 'b';
        float c = 100;
        
        System.out.println(a); //Imprimir a
        System.out.println(b); //Imprime 98
        System.out.println(c); //Imprime 100
        System.out.println(""); 
        System.out.println(""); 
        
        /*Casting feito explicitamente pois o valor possui um 
        maior que o tipo da variável que irá recebê-lo*/
        int d = (int) 5.1987;
        float e = (float) 5.0;
        int f = (char) (a+5);
        char g = (char) 110.5;
        
        System.out.println(d); //Imprimir 5
        System.out.println(e); //Imprime 5.0
        System.out.println(f); //Imprime 102
        System.out.println(g); //Imprime n
        
        
        
        
    }
    
}
