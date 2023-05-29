package Entidades;

public class ProdutoUsado extends Produto {
    private String fabricacao;

    public ProdutoUsado(String nome, Double preco, char tipo, String fabricacao) {
        super(nome, preco, tipo);
        this.fabricacao = fabricacao;
    }

    public String mostrarProduto() {
        return getNome() + " (usado) " + " R$ " + getPreco() +
                " (Data de fabricação: " + fabricacao + ")";
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Data de fabricação (DD/MM/YYYY): " + fabricacao;
    }
}
