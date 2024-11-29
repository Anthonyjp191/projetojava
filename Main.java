import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Sistema de Biblioteca ===");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Cadastrar Usuário");
            System.out.println("4. Registrar Empréstimo");
            System.out.println("5. Listar Empréstimos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha após a opção

            switch (opcao) {
                case 1:
                    System.out.print("Título do Livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor do Livro: ");
                    String autor = scanner.nextLine();
                    biblioteca.adicionarLivro(new Livro(titulo, autor));
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    System.out.print("Nome do Usuário: ");
                    String nome = scanner.nextLine();
                    biblioteca.cadastrarUsuario(new Usuario(nome));
                    break;
                case 4:
                    System.out.print("Nome do Usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Título do Livro: ");
                    String livroTitulo = scanner.nextLine();
                    biblioteca.registrarEmprestimo(nomeUsuario, livroTitulo);
                    break;
                case 5:
                    biblioteca.listarEmprestimos();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
