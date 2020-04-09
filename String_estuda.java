package string_estuda;

import java.util.Scanner;

public class String_estuda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        
        String nome;
        char sexo;
         
        System.out.printf("Informe o nome: \n");
        nome = ler.nextLine();
        
        System.out.printf("Informe o sexo (M/F): \n");
        sexo = ler.next().charAt(0);
        
        if ((sexo == 'M') || (sexo == 'm'))
            System.out.printf("\nSeja bem vindo Sr. %s.\n", nome);
        else
            System.out.printf("\nSeja bem vinda Sr.a %s.\n", nome);
    }
    
}
