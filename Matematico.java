package matematico;

import java.util.Scanner;

public class Matematico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;
        float n = 5.5f; //f - ponto flutuante
        double a = 4.6;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("O valor de pi é: "+Math.PI);
        System.out.println("O valor de 2 elevado ao cubo(³) é: "+Math.pow(2,3));
        System.out.println("O valor da aiz quadrada de 49 é: "+Math.sqrt(49));
        System.out.println("O seno de 0 é: "+Math.sin(0));
        System.out.println(""+Math.min(maior, menor));
        System.out.println(""+Math.max(maior,menor));
        System.out.println("Arredondando umu numero: "+a+" "+n);
        System.out.println("Arredondando um numero para cima: "+Math.ceil(a));
        System.out.println("Arredondando um numero para baixo: "+Math.floor(a));
        System.out.println(""+ (byte) (Math.random()*100));
        
        
        
        
        //Faça um programa onde o usuário entre com os valores e com isso gere o calculo da potencia
        int vlr, pot;
        double res;
        
        System.out.println("Digite um valor numério: ");
        vlr = scan.nextInt();
        
        System.out.println("Determine o valor da potência: ");
        pot = scan.nextInt();
        
        res = Math.pow(vlr, pot);
        
        System.out.println(vlr+" elevado a "+pot+" é "+res);
        
        
        
        
    }
    
}
