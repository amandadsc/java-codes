package printf_peculiar;

public class PrintF_Peculiar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c;
        int n;
        /* os caracteres são tipos ordinais, portanto, podem
         ser usados no controle de instruções de repetição
        */
        
        for(c='0'; c<='9'; c++){
            //converte o caracter numérico no respectivo valor inteiro
            n = c - 48; //substitui o valor ASCII
            /* "printf" o f quer dizer formato
            System.out.printf(formato, dados de saída);
            */
            System.out.printf("%d x 10 = %d\n", n, (n*10));
        }
        /*
        %s -> string
        %d -> inteiro
        %f -> número com ponto flutuante, o f representa a vírgula
        \t -> tabulação
        \n -> salto de linha
        %u -> inteiro
        %o -> inteiro octal
        %X, %x -> inteiro hexa
        %2f -> Double
        %E, %e -> real, em notação cientific
        %b -> Boolean
        %c -> char
        \b -> backspace
        \r -> retorno
        \' -> aspas simples
        \" -> aspas duplas
        \\ -> barra dupla
        %% -> porcentagem
        */
    }   
}
