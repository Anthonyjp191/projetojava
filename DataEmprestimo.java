import java.time.LocalDate;

public class DataEmprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    // Construtor
    public DataEmprestimo() {
        this.dataEmprestimo = LocalDate.now(); // Data atual
        this.dataDevolucao = dataEmprestimo.plusDays(7); // Definindo uma devolução em 7 dias
    }

    // Método para obter a data de empréstimo
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    // Método para obter a data de devolução
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    // Método para atualizar a data de devolução
    public void setDataDevolucao(int dias) {
        this.dataDevolucao = dataEmprestimo.plusDays(dias);
    }

    @Override
    public String toString() {
        return "Data de Empréstimo: " + dataEmprestimo + ", Data de Devolução: " + dataDevolucao;
    }
}
