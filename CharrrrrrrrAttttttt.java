package charrrrrrrrattttttt;

public class CharrrrrrrrAttttttt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a; //String faz parte do pacote java.lang.string
        a = "Beltrano";
        
        System.out.println("O caracter no index 0 é: "+a.charAt(0));
        System.out.println("O caracter no index 1 é: "+a.charAt(1));
        System.out.println("O caracter no index 2 é: "+a.charAt(2));
        System.out.println("O caracter no index 3 é: "+a.charAt(3));
        System.out.println("O caracter no index 4 é: "+a.charAt(4));
        System.out.println("O caracter no index 5 é: "+a.charAt(5));
        System.out.println("O caracter no index 6 é: "+a.charAt(6));
        System.out.println("O caracter no index 7 é: "+a.charAt(7));
        
        System.out.println();
        
        System.out.println("Em minusculo: "+a.toLowerCase());
        System.out.println("Em minusculo: "+a.toUpperCase());
        
        System.out.println();
        
        char i = 0; //Um char é um inteiro de 16 bits
                    //Sem sinal da Tabela ASCII
        
        for (int x = 0; x < 300; x++) {
            i++;
            System.out.println("O caracter na posição "+x+" é "+i);
        }
        
        
    }
    
}
