import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("\n=== Lista de Livros ===");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void registrarEmprestimo(String nomeUsuario, String tituloLivro) {
        Usuario usuario = usuarios.stream()
                .filter(u -> u.getNome().equalsIgnoreCase(nomeUsuario))
                .findFirst().orElse(null);
        Livro livro = livros.stream()
                .filter(l -> l.getTitulo().equalsIgnoreCase(tituloLivro) && l.isDisponivel())
                .findFirst().orElse(null);

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
        } else if (livro == null) {
            System.out.println("Livro não disponível ou não encontrado!");
        } else {
            livro.setDisponivel(false);
            emprestimos.add(new Emprestimo(usuario, livro));
            System.out.println("Empréstimo registrado com sucesso!");
        }
    }

    public void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo registrado.");
        } else {
            System.out.println("\n=== Lista de Empréstimos ===");
            for (Emprestimo emprestimo : emprestimos) {
                System.out.println(emprestimo);
            }
        }
    }
}
