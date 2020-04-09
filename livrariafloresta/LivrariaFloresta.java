package livrariafloresta;

import java.util.Scanner;

/**
 *
 * @author Cliente
 * @email
 * Resumo
 * Versao
 */
public class LivrariaFloresta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livros livros = new Livros();
        Cliente cliente = new Cliente();
        Scanner scan = new Scanner(System.in);
        livros.setCod(cliente);
        int escolha = 0;
        String titulo;
        
        System.out.println("******* Bem-vindo(a) ********\n");
        do {
            System.out.println("Escolha seu destino!");
            System.out.println("1 - Cadastro de usuario.");
            System.out.println("2 - Cadastro de livro.");
            System.out.println("3 - Consultar livro.");
            System.out.println("4 - Sair!");
            System.out.println("Digite o numero da opção desejada: ");
            escolha = scan.nextInt();
            
            switch(escolha) {
                case 1:
                    System.out.println("_____CADASTRO DE USUARIO_____");
                    System.out.println("***Digite o nome e gere o codigo***");
                    System.out.print("Nome: ");
                    cliente.setNome(scan.next());
                    cliente.setCod(1);
                    System.out.println("Seu codigo é: "+cliente.getCod());
                    break;
                case 2:
                    System.out.println("_____CADASTRO DE LIVRO_____");
                    System.out.print("Titulo: ");
                    livros.setTitulo(scan.next());
                    System.out.print("Nº de pags: ");
                    livros.setPag(scan.nextInt());
                    System.out.print("Preço: ");
                    livros.setValor(scan.nextDouble());
                    break;
                case 3:
                    System.out.println("_____CONSULTA DE LIVRO_____");
                    System.out.println("Digite o Titulo: ");
                    titulo = scan.next();
                    if(titulo.equalsIgnoreCase(livros.getTitulo())) {
                        System.out.println("O livro "+livros.getTitulo()+" foi emprestado para "+livros.cod.getCod());
                    } else {
                        System.out.println("Titulo não foi encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("***** VOLTE SEMPRE ******");
                default:
                    System.out.println("Opção inválida!");
            }
            
        } while (escolha != 4);
        
    }
    
}
