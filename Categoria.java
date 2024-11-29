public class Categoria {
    private String nome;

    // Construtor
    public Categoria(String nome) {
        this.nome = nome;
    }

    // Getter para nome da categoria
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Categoria: " + nome;
    }
}
