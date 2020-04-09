//Programa que o usuário tenta encontrar um número aleatório até acertar o mesmo
//Exibe ao errar se o número que ele digitou é maior ou menor que o número aleatório 
//Ao final quando acertar, é mostrado quantas tentativas levou e quantos números pares e impares foram digitados

import java.util.Random;
import java.util.Scanner;

public class adivinhandoNumero
{
	public static void main(String[] args) {
	    
	    Random rand = new Random();
	    Scanner scan = new Scanner(System.in);
	    
		int numRand, tentativa, contador = 0, pares = 0, impares = 0;
		numRand = rand.nextInt(100);
		
		System.out.println("Tente adivinhar o número");
		tentativa = scan.nextInt();
		
		if (numRand == tentativa) {
		    System.out.println("PARABÉNS, VOCÊ ACERTOU DE PRIMEIRA!");
		} else {
		    while (numRand != tentativa) {
    		    	contador++;
    		    	if(tentativa > numRand) {
    		        	System.out.println("O número digitado é maior que o aleatório");
    		    	} else {
    		        	System.out.println("O número digitado é menor que o aleatório");
    		    	}
    		    	if(tentativa % 2 == 0){
    		        	pares++;
    		    	} else {
    		        	impares++;
    		    	}
		        System.out.println("Tente adivinhar o número");
		        tentativa = scan.nextInt();
		    }
		    contador++;
		    if(numRand % 2 == 0){
    		        pares++;
    		    } else {
    		        impares++;
    		}
		System.out.println("PARABÉNS, VOCÊ ACERTOU!");
    		System.out.println("Foram necessárias "+contador+" tentativas");
    		System.out.println("Qtd. de nº pares digitados: "+pares);
    		System.out.println("Qtd. de nº impares digitados: "+impares);
		}
	}
}	
