class Emprestimo {
    private Usuario usuario;
    private Livro livro;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Empréstimo -> Usuário: " + usuario.getNome() + ", Livro: " + livro.getTitulo();
    }
}
